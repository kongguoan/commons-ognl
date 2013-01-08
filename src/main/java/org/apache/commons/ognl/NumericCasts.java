package org.apache.commons.ognl;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Constant strings for casting different primitive types.
 */
class NumericCasts {

    private final Map<Class<? extends Number>, String> map = new HashMap<Class<? extends Number>, String>();

    NumericCasts() {
        map.put( Double.class, "(double)" );
        map.put( Float.class, "(float)" );
        map.put( Integer.class, "(int)" );
        map.put( Long.class, "(long)" );
        map.put( BigDecimal.class, "(double)" );
        map.put( BigInteger.class, "" );
    }

    String get( Class<? extends Number> cls ) {
        return map.get( cls );
    }
}
