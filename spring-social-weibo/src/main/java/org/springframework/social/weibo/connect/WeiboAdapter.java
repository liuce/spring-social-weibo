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
package org.springframework.social.weibo.connect;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.weibo.api.Weibo;

/**
 * Weibo ApiAdapter implementation.
 * @author liuce
 *
 */
public class WeiboAdapter implements ApiAdapter<Weibo> {

	public UserProfile fetchUserProfile(Weibo weibo) {
		// TODO Auto-generated method stub
		weibo.accountOperations().getUser();
		return null;
	}

	public void setConnectionValues(Weibo arg0, ConnectionValues arg1) {
		// TODO Auto-generated method stub
		
	}

	public boolean test(Weibo arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void updateStatus(Weibo arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

}
