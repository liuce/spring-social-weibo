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

import java.util.Map;

import org.springframework.social.weibo.api.AccountOperations;
import org.springframework.social.weibo.api.GraphApi;
import org.springframework.social.weibo.api.User;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuce
 * 
 */
public class AccountTemplate extends AbstractWeiboOperations implements
		AccountOperations {
	
	private final GraphApi graphApi;

	private final RestTemplate restTemplate;

	public AccountTemplate(GraphApi graphApi, RestTemplate restTemplate,
			boolean isAuthorizedForUser) {
		super(isAuthorizedForUser);
		this.graphApi = graphApi;
		this.restTemplate = restTemplate;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.AccountOperations#getUid()
	 */
	@Override
	public Long getUid() {
		// TODO Auto-generated method stub
		Map<String, Object> response = graphApi.fetchUrlObject("https://api.weibo.com/2/account/get_uid.json", Map.class);
		return (Long) response.get("uid");
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.AccountOperations#getUser()
	 */
	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.AccountOperations#getUserById(java.lang.String)
	 */
	@Override
	public User getUserById(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.AccountOperations#getUserByScreenName(java.lang.String)
	 */
	@Override
	public User getUserByScreenName(String screenName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.AccountOperations#getUserByDomain(java.lang.String)
	 */
	@Override
	public User getUserByDomain(String domain) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
