74
https://raw.githubusercontent.com/harshalbenake/hbworkspace1-100/master/google%20image%20loader%20api%20complete/com/google/android/accounts/OperationCanceledException.java
/*-
 * Copyright (C) 2009 Google Inc.
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

package com.google.android.accounts;

/**
 * Mirrors {@link android.accounts.OperationCanceledException}
 */
@SuppressWarnings("serial")
public class OperationCanceledException extends AccountsException {
    /**
     * Mirrors
     * {@link android.accounts.OperationCanceledException#OperationCanceledException(Throwable)}
     */
    public OperationCanceledException(Throwable throwable) {
        super(throwable);
    }

    /**
     * Mirrors
     * {@link android.accounts.OperationCanceledException#OperationCanceledException()}
     */
    public OperationCanceledException() {
        super();
    }

    /**
     * Mirrors
     * {@link android.accounts.OperationCanceledException#OperationCanceledException(String, Throwable)}
     */
    public OperationCanceledException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    /**
     * Mirrors
     * {@link android.accounts.OperationCanceledException#OperationCanceledException(String)}
     */
    public OperationCanceledException(String detailMessage) {
        super(detailMessage);
    }
}
