74
https://raw.githubusercontent.com/harshalbenake/hbworkspace1-100/master/google%20image%20loader%20api%20complete/com/google/android/callable/CallableContentProvider.java
/*-
 * Copyright (C) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.callable;

import android.os.Bundle;

/**
 * Interface for content providers that implement
 * {@link android.content.ContentProvider#call(String, String, Bundle)} on
 * devices running API Level 10 and lower.
 */
public interface CallableContentProvider {
    Bundle call(String method, String arg, Bundle extras);
}