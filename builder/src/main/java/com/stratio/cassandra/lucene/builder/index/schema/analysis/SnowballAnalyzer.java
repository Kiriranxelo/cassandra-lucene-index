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

package com.stratio.cassandra.lucene.builder.index.schema.analysis;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * {@link Analyzer} for tartarus.org snowball {@code Analyzer}.
 *
 * The supported languages are English, French, Spanish, Portuguese, Italian, Romanian, German, Dutch, Swedish,
 * Norwegian, Danish, Russian, Finnish, Irish, Hungarian, Turkish, Armenian, Basque and Catalan.
 *
 * @author Andres de la Pena {@literal <adelapena@stratio.com>}
 */
public class SnowballAnalyzer extends Analyzer {

    @JsonProperty("language")
    final String language;

    @JsonProperty("stopwords")
    String stopwords;

    /**
     * Builds a new {@link SnowballAnalyzer} for the specified language and stopwords.
     *
     * @param language The language. The supported languages are English, French, Spanish, Portuguese, Italian,
     * Romanian, German, Dutch, Swedish, Norwegian, Danish, Russian, Finnish, Irish, Hungarian, Turkish, Armenian,
     * Basque and Catalan.
     */
    @JsonCreator
    public SnowballAnalyzer(@JsonProperty("language") String language) {
        this.language = language;
    }

    /**
     * Returns this with the specified stopwords.
     *
     * @param stopwords The comma separated stopwords.
     * @return This with the specified stopwords.
     */
    public SnowballAnalyzer stopwords(String stopwords) {
        this.stopwords = stopwords;
        return this;
    }
}
