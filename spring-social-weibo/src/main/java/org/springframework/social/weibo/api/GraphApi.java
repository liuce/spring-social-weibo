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
package org.springframework.social.weibo.api;

import java.util.List;

import org.springframework.util.MultiValueMap;

/**
 * @author liuce
 *
 */
public interface GraphApi {
	
	<T> T fetchUrlObject(String url, Class<T> type);
	
	<T> T fetchObject(Class<T> type);
	<T> T fetchObject(String objectId, Class<T> type);
	<T> T fetchObject(String objectId, Class<T> type, MultiValueMap<String, String> queryParameters);
	<T> List<T> fetchConnections(String objectId, String connectionName, Class<T> type, String... fields);
	<T> List<T> fetchConnections(String objectId, String connectionName, Class<T> type, MultiValueMap<String, String> queryParameters);
	Integer publish(String objectId, String connectionName, MultiValueMap<String, Object> data);	
	
	static final String GRAPH_API_URL = "https://api.weibo.com/2/";
	static final String API_URL_PATTERN = "https://api.weibo.com/2/account/profile/basic.json";

}
