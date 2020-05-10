74
https://raw.githubusercontent.com/harshalbenake/hbworkspace1-100/master/google%20image%20loader%20api%20complete/com/google/android/accounts/AccountManagerFuture.java
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

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Mirrors {@link android.accounts.AccountManagerFuture}
 */
public interface AccountManagerFuture<V> {
    /**
     * Mirrors {@link android.accounts.AccountManagerFuture#cancel(boolean)}
     */
    boolean cancel(boolean mayInterruptIfRunning);

    /**
     * Mirrors {@link android.accounts.AccountManagerFuture#isCancelled()}
     */
    boolean isCancelled();

    /**
     * Mirrors {@link android.accounts.AccountManagerFuture#isDone()}
     */
    boolean isDone();

    /**
     * Mirrors {@link android.accounts.AccountManagerFuture#getResult()}
     */
    V getResult() throws OperationCanceledException, IOException, AuthenticatorException;

    /**
     * Mirrors {@link android.accounts.AccountManagerFuture#getResult()}
     */
    V getResult(long timeout, TimeUnit unit) throws OperationCanceledException, IOException,
            AuthenticatorException;
}