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
package org.springframework.social.weibo.api.impl;

import org.springframework.social.weibo.api.GraphApi;
import org.springframework.social.weibo.api.TrendOperations;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuce
 *
 */
public class TrendTemplate extends AbstractWeiboOperations implements
		TrendOperations {
	private final GraphApi graphApi;

	private final RestTemplate restTemplate;

	public TrendTemplate(GraphApi graphApi, RestTemplate restTemplate,
			boolean isAuthorizedForUser) {
		super(isAuthorizedForUser);
		this.graphApi = graphApi;
		this.restTemplate = restTemplate;
	}
}
