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
 * A {@link Condition} implementation that matches documents satisfying a Lucene Query Syntax.
 *
 * @author Andres de la Pena {@literal <adelapena@stratio.com>}
 */
public class LuceneCondition extends Condition {

    /** The Lucene query syntax expression. */
    @JsonProperty("query")
    final String query;

    /** The name of the field where the clauses will be applied by default. */
    @JsonProperty("default_field")
    String defaultField;

    /**
     * Returns a new {@link LuceneCondition} with the specified query.
     *
     * @param query The Lucene query syntax expression.
     */
    @JsonCreator
    public LuceneCondition(@JsonProperty("query") String query) {
        this.query = query;
    }

    /**
     * Returns this builder with the specified default field name. This is the field where the clauses will be applied
     * by default.
     *
     * @param defaultField The name of the field where the clauses will be applied by default.
     * @return This builder with the specified name of the default field.
     */
    public LuceneCondition defaultField(String defaultField) {
        this.defaultField = defaultField;
        return this;
    }
}
