Recipes Multiplatform
=====================

This repository is the [Recipes](https://github.com/topinambur/recipes) sample android project, rewrited using the [Kotlin Multiplatform Mobile](https://kotlinlang.org/lp/mobile/).
It implements MVVM architecture using Kotlin.

#### The specific android libraries from the original project are changed to their multiplatform analogs:
- Retrofit+Okhttp -> [Ktor](https://github.com/ktorio/ktor).
- Room            -> [SQLDelight](https://github.com/square/sqldelight).
- Gson            -> [kotlinx-serialization](https://github.com/Kotlin/kotlinx.serialization).
- Dagger2         -> [Koin](https://github.com/InsertKoinIO/koin) (multiplatform version 3.0.0-alpha-4).


## If this project helps you in anyway, show your love :heart: by putting a :star: on this project :v:

### License
```
   Copyright (C) 2020 MARTIANLAB

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
