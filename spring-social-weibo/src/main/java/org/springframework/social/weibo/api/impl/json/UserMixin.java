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

import java.util.Date;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.weibo.api.Comment;
import org.springframework.social.weibo.api.Status;
import org.springframework.social.weibo.api.User;

/**
 * @author liuce
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserMixin {
	@JsonCreator
	UserMixin(
			@JsonProperty("id") String id,
			@JsonProperty("screen_name") String screenName,
			@JsonProperty("name") String name,
			@JsonProperty("province") int province,
			@JsonProperty("city") int city,
			@JsonProperty("location") String location,
			@JsonProperty("description") String description,
			@JsonProperty("url") String url,
			@JsonProperty("profile_image_url") String profileImageUrl,
			@JsonProperty("domain") String userDomain,
			@JsonProperty("gender") String gender,
			@JsonProperty("followers_count") int followersCount,
			@JsonProperty("friends_count") int friendsCount,
			@JsonProperty("statuses_count") int statusesCount,
			@JsonProperty("favourites_count") int favouritesCount,
			@JsonProperty("created_at") @JsonDeserialize(using = DateJsonDeserializer.class) Date createdAt,
			@JsonProperty("following") boolean following,
			@JsonProperty("allow_all_act_msg") boolean allowAllActMsg,
			@JsonProperty("verified") boolean verified,
			@JsonProperty("allow_all_comment") boolean allowAllComment,
			@JsonProperty("avatar_large") String avatarLarge,
			@JsonProperty("verified_reason") String verifiedReason,
			@JsonProperty("follow_me") boolean followMe,
			@JsonProperty("online_status") int onlineStatus,
			@JsonProperty("bi_followers_count") int biFollowersCount,
			@JsonProperty("status") Status status,
			@JsonProperty("verifiedType") int verifiedType,
			@JsonProperty("remark") String remark,
			@JsonProperty("lang") String lang) {
	}
}
