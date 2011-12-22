/*
 * Copyright 2011 the original author or authors.
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
package org.springframework.social.weibo.api.impl.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

/**
 * @author liuce
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IDsMixin {
	@JsonCreator
	IDsMixin(
			@JsonProperty("ids") @JsonDeserialize(using = IdsDeserializer.class) long[] ids,
			@JsonProperty("previous_cursor") long previousCursor,
			@JsonProperty("next_cursor") long nextCursor) {
	}

	private static class IdsDeserializer extends JsonDeserializer<long[]> {
		@Override
		public long[] deserialize(JsonParser jp, DeserializationContext ctxt)
				throws IOException, JsonProcessingException {
			// jp.readValueAsTree().get
			// String str = jp.getText();
			return null;
		}
	}
}
