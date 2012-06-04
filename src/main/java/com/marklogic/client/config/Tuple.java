/*
 * Copyright 2012 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.client.config;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Tuple {
    @XmlAttribute(name = "frequency")
    private long frequency;

    @XmlElement(namespace = TuplesBuilder.Tuples.TUPLES_NS, name = "distinct-value")
    private List<TypedDistinctValue> distinctValues;

    public Tuple() {
        distinctValues = new ArrayList<TypedDistinctValue>();
    }

    public long getCount() {
        return frequency;
    }

    public TypedDistinctValue[] getValues() {
        return distinctValues.toArray(new TypedDistinctValue[0]);
    }
}
