/*
 * Licensed to STRATIO (C) under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.  The STRATIO (C) licenses this file
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

package com.stratio.cassandra.lucene.builder.search.condition;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * A {@link Condition} implementation that matches a field within an range of values.
 *
 * @author Andres de la Pena {@literal <adelapena@stratio.com>}
 */
public class DateRangeCondition extends Condition {

    /** The name of the field to be matched. */
    @JsonProperty("field")
    final String field;

    /** The lower accepted date. Maybe null meaning no lower limit. */
    @JsonProperty("from")
    Object from;

    /** The upper accepted date. Maybe null meaning no upper limit. */
    @JsonProperty("to")
    Object to;

    /** The spatial operation to be performed. */
    @JsonProperty("operation")
    String operation;

    /**
     * Returns a new {@link DateRangeCondition} with the specified field reference point.
     *
     * @param field The name of the field to be matched.
     */
    @JsonCreator
    public DateRangeCondition(@JsonProperty("field") String field) {
        this.field = field;
    }

    /**
     * Sets the lower accepted date. Maybe null meaning no lower limit.
     *
     * @param from The lower accepted date. Maybe null meaning no lower limit.
     * @return This.
     */
    public DateRangeCondition from(Object from) {
        this.from = from;
        return this;
    }

    /**
     * Sets the upper accepted date. Maybe null meaning no lower limit.
     *
     * @param to The upper accepted date. Maybe null meaning no lower limit.
     * @return This.
     */
    public DateRangeCondition to(Object to) {
        this.to = to;
        return this;
    }

    /**
     * Sets the operation to be performed.
     *
     * @param operation The operation to be performed.
     * @return This.
     */
    public DateRangeCondition operation(String operation) {
        this.operation = operation;
        return this;
    }
}
