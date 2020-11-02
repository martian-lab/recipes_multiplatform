package com.martianlab.recipes.presentation.views.base

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.annotation.IntDef
import androidx.core.view.children
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.*
import com.martianlab.recipes.R
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1


open class BaseRecyclerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : RecyclerView(context, attrs, defStyle), IBaseView {


    @Orientation
    var orientation = VERTICAL
        set(value) {
            field = value
            layoutManager = LinearLayoutManager(context, value, false)
        }

    private val pagerSnapHelper = PagerSnapHelper()
    private val linearSnapHelper = LinearSnapHelper()

    @Behaviour
    var behaviour = SCROLL
        set(value) {
            field = value
            when (value) {
                SCROLL -> {
                    linearSnapHelper.attachToRecyclerView(null)
                    pagerSnapHelper.attachToRecyclerView(null)
                }
                CENTRING_SCROLL -> {
                    pagerSnapHelper.attachToRecyclerView(null)
                    linearSnapHelper.attachToRecyclerView(this)
                }
                SWIPE -> {
                    linearSnapHelper.attachToRecyclerView(null)
                    pagerSnapHelper.attachToRecyclerView(this)
                }
            }
        }

    var data: List<*>? = null
        set(value) {
            field = value
            value
                ?.let { data ->
                    adapter
                        ?.takeIf { it is Adapter }
                        ?.let { adapter ->
                            adapter as Adapter
                            val diffResult = primaryDataProperty
                                ?.let { DiffUtilCallback(it, adapter.data, data) }
                                ?.let { DiffUtil.calculateDiff(it) }
                            adapter.apply {
                                this.data = data
                                diffResult?.dispatchUpdatesTo(this) ?: notifyDataSetChanged()
                            }
                        }
                        ?: run {
                            adapter = Adapter(data, itemViewClass
                                    ?: return@let null, parentViewModel)
                        }
                }
                ?: run { adapter = null }
        }

    var itemViewClass: KClass<out RecyclerItemView<*>>? = null
        set(value) {
            field = value
            adapter = Adapter(data
                    ?: return, value ?: return, parentViewModel)
        }

    var parentViewModel : ViewModelForView? = null
        set(value) {
            field = value
            adapter = Adapter(data
                    ?: return, itemViewClass ?: return, value)
        }


    private var primaryDataProperty: KProperty1<Any, Any>? = null

    init {
        with(context.theme.obtainStyledAttributes(attrs, R.styleable.BaseRecyclerView, 0, 0)) {
            try {
                orientation = getInt(R.styleable.BaseRecyclerView_orientation, VERTICAL)
                behaviour = getInt(R.styleable.BaseRecyclerView_behaviour, SCROLL)
            } finally {
                recycle()
            }
        }
    }

    /**
     * Включает `DiffUtils` для этого `RecyclerView`.
     * @param primaryDataProperty - свойство класса данных, переданных через датабиндинг для
     * отображения. Сравнивая это свойствоу старых и новых данных, `DiffUtils` понимает, какой
     * яцейке в `RecyclerView` соответствуют новые данные.
     */
    @Suppress("UNCHECKED_CAST")
    fun enableDiffUtils(primaryDataProperty: KProperty1<*, *>) {
        this.primaryDataProperty = primaryDataProperty as KProperty1<Any, Any>
    }

    fun disableDiffUtils() {
        primaryDataProperty = null
    }

    class Adapter(
        var data: List<*>,
        private val itemViewClass: KClass<out RecyclerItemView<*>>,
        private val parentViewModel: ViewModelForView? = null
    ) : RecyclerView.Adapter<Adapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
                itemViewClass.java.getConstructor(Context::class.java).newInstance(parent.context)
        ).apply { itemView.layoutParams = ViewGroup.LayoutParams(WRAP_CONTENT, WRAP_CONTENT) }

        override fun getItemCount() = data.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            fun RecyclerItemView<*>.safeBindData() {
                try {
                    ::bindDataInternal.call(data[position], parentViewModel)
                } catch (e: Exception) {
                }
            }

            fun ViewGroup.bindDataToChildren() {
                children.forEach {
                    if (it is RecyclerItemView<*>) it.safeBindData()
                    if (it is ViewGroup) it.bindDataToChildren()
                }
            }
            holder.iItemView.apply {
                safeBindData()
                if (this is ViewGroup) bindDataToChildren()
            }
        }

        class ViewHolder(val iItemView: RecyclerItemView<*>) :
            RecyclerView.ViewHolder(iItemView as View)
    }

    private class DiffUtilCallback(
            private val primaryDataProperty: KProperty1<Any, Any>,
            private val oldData: List<*>,
            private val newData: List<*>
    ) : DiffUtil.Callback() {

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
            primaryDataProperty.get(oldData[oldItemPosition]!!) ==
                    primaryDataProperty.get(newData[newItemPosition]!!)

        override fun getOldListSize() = oldData.size

        override fun getNewListSize() = newData.size

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
            oldData[oldItemPosition] == newData[newItemPosition]
    }

    @IntDef(SCROLL, CENTRING_SCROLL, SWIPE)
    @Retention(AnnotationRetention.SOURCE)
    annotation class Behaviour

    companion object {

        const val SCROLL = 0
        const val CENTRING_SCROLL = 1
        const val SWIPE = 2

        @JvmStatic
        @BindingAdapter("data")
        fun setData(view: BaseRecyclerView, value: List<*>?) {
            view.data = value
        }

        @JvmStatic
        @BindingAdapter("viewModel")
        fun setViewModel(view: BaseRecyclerView, value: ViewModelForView?) {
            view.parentViewModel = value
        }
    }
}