package com.martianlab.recipes.generated.callback;
public final class Function0 implements kotlin.jvm.functions.Function0 {
    final Listener mListener;
    final int mSourceId;
    public Function0(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public kotlin.Unit invoke() {
        return mListener._internalCallbackInvoke(mSourceId );
    }
    public interface Listener {
        kotlin.Unit _internalCallbackInvoke(int sourceId );
    }
}