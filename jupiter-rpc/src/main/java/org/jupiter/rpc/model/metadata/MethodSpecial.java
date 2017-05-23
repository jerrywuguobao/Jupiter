/*
 * Copyright (c) 2015 The Jupiter Project
 *
 * Licensed under the Apache License, version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jupiter.rpc.model.metadata;

import java.io.Serializable;

/**
 * Jupiter
 * org.jupiter.rpc.model.metadata
 *
 * @author jiachun.fjc
 */
public class MethodSpecial implements Serializable {

    private static final long serialVersionUID = -3689442191636868738L;

    private String methodName;
    private long timeoutMillis;

    public static MethodSpecial of(String methodName, long timeoutMillis) {
        MethodSpecial m = new MethodSpecial();
        m.setMethodName(methodName);
        m.setTimeoutMillis(timeoutMillis);
        return m;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public long getTimeoutMillis() {
        return timeoutMillis;
    }

    public void setTimeoutMillis(long timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
    }
}
