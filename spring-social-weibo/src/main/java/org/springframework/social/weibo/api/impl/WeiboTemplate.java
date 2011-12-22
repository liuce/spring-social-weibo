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

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.OAuth2Version;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.social.support.URIBuilder;
import org.springframework.social.weibo.api.AccountOperations;
import org.springframework.social.weibo.api.CommentOperations;
import org.springframework.social.weibo.api.FavoriteOperations;
import org.springframework.social.weibo.api.FriendshipOperations;
import org.springframework.social.weibo.api.LocationOperations;
import org.springframework.social.weibo.api.RegisterOperations;
import org.springframework.social.weibo.api.SearchOperations;
import org.springframework.social.weibo.api.StatusOperations;
import org.springframework.social.weibo.api.SuggestionOperations;
import org.springframework.social.weibo.api.TagOperations;
import org.springframework.social.weibo.api.TrendOperations;
import org.springframework.social.weibo.api.Weibo;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuce
 * 
 */
public class WeiboTemplate extends AbstractOAuth2ApiBinding implements Weibo {
	private AccountOperations accountOperations;

	private FavoriteOperations favoriteOperations;

	private RegisterOperations registerOperations;

	private SuggestionOperations suggestionOperations;

	private SearchOperations searchOperations;

	private TagOperations tagOperations;

	private TrendOperations trendOperations;

	private LocationOperations locationOperations;

	private FriendshipOperations friendshipOperations;

	private CommentOperations commentOperations;

	private StatusOperations statusOperations;

	public WeiboTemplate() {
		initialize();
	}

	public WeiboTemplate(String accessToken) {
		super(accessToken);
		initialize();
	}

	private void initialize() {
		// Wrap the request factory with a BufferingClientHttpRequestFactory so that the error handler can do repeat reads on the response.getBody()
		super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
		initSubApis();
	}
		

	private void initSubApis() {
		accountOperations = new AccountTemplate(this, getRestTemplate(), isAuthorized());
		favoriteOperations = new FavoriteTemplate(this, getRestTemplate(), isAuthorized());
		registerOperations = new RegisterTemplate(this, getRestTemplate(), isAuthorized());
		suggestionOperations = new SuggestionTemplate(this, getRestTemplate(), isAuthorized());
		searchOperations = new SearchTemplate(this, getRestTemplate(), isAuthorized());
		tagOperations = new TagTemplate(this, getRestTemplate(), isAuthorized());
		trendOperations = new TrendTemplate(this, getRestTemplate(), isAuthorized());
		locationOperations = new LocationTemplate(this, getRestTemplate(), isAuthorized());
		friendshipOperations = new FriendshipTemplate(this, getRestTemplate(), isAuthorized());
		commentOperations = new CommentTemplate(this, getRestTemplate(), isAuthorized());
		statusOperations = new StatusTemplate(this, getRestTemplate(), isAuthorized());
	}
	
	
	
	/* (non-Javadoc)
	 * @see org.springframework.social.oauth2.AbstractOAuth2ApiBinding#getOAuth2Version()
	 */
	@Override
	protected OAuth2Version getOAuth2Version() {
		// TODO Auto-generated method stub
		return OAuth2Version.BEARER_DRAFT_2;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.GraphApi#fetchUrlObject(java.lang.String, java.lang.Class)
	 */
	@Override
	public <T> T fetchUrlObject(String url, Class<T> type) {
		return getRestTemplate().getForObject(url, type);
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.GraphApi#fetchObject(java.lang.Class)
	 */
	@Override
	public <T> T fetchObject(Class<T> type) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.GraphApi#fetchObject(java.lang.String, java.lang.Class)
	 */
	@Override
	public <T> T fetchObject(String objectId, Class<T> type) {
		URI uri = URIBuilder.fromUri(GRAPH_API_URL + objectId).build();
//		return getRestTemplate().postForObject(url, request, responseType);
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.GraphApi#fetchObject(java.lang.String, java.lang.Class, org.springframework.util.MultiValueMap)
	 */
	@Override
	public <T> T fetchObject(String objectId, Class<T> type,
			MultiValueMap<String, String> queryParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.GraphApi#fetchConnections(java.lang.String, java.lang.String, java.lang.Class, java.lang.String[])
	 */
	@Override
	public <T> List<T> fetchConnections(String objectId, String connectionName,
			Class<T> type, String... fields) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.GraphApi#fetchConnections(java.lang.String, java.lang.String, java.lang.Class, org.springframework.util.MultiValueMap)
	 */
	@Override
	public <T> List<T> fetchConnections(String objectId, String connectionName,
			Class<T> type, MultiValueMap<String, String> queryParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.GraphApi#publish(java.lang.String, java.lang.String, org.springframework.util.MultiValueMap)
	 */
	@Override
	public Integer publish(String objectId, String connectionName,
			MultiValueMap<String, Object> data) {
		// TODO Auto-generated method stub
		return 0;
	}



	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#accountOperations()
	 */
	@Override
	public AccountOperations accountOperations() {
		return this.accountOperations;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#favoriteOperations()
	 */
	@Override
	public FavoriteOperations favoriteOperations() {
		return this.favoriteOperations;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#registerOperations()
	 */
	@Override
	public RegisterOperations registerOperations() {
		return this.registerOperations;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#suggestionOperations()
	 */
	@Override
	public SuggestionOperations suggestionOperations() {
		return this.suggestionOperations;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#searchOperations()
	 */
	@Override
	public SearchOperations searchOperations() {
		return this.searchOperations;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#tagOperations()
	 */
	@Override
	public TagOperations tagOperations() {
		return this.tagOperations;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#trendOperations()
	 */
	@Override
	public TrendOperations trendOperations() {
		return this.trendOperations;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#locationOperations()
	 */
	@Override
	public LocationOperations locationOperations() {
		return this.locationOperations;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#friendshipOperations()
	 */
	@Override
	public FriendshipOperations friendshipOperations() {
		return this.friendshipOperations;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#commentOperations()
	 */
	@Override
	public CommentOperations commentOperations() {
		return this.commentOperations;
	}

	/* (non-Javadoc)
	 * @see org.springframework.social.weibo.api.Weibo#statusOperations()
	 */
	@Override
	public StatusOperations statusOperations() {
		return this.statusOperations;
	}
	
	
}
