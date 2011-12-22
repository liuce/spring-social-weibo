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
import org.springframework.social.weibo.api.Source;
import org.springframework.social.weibo.api.Status;
import org.springframework.social.weibo.api.User;

/**
 * @author liuce
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusMixin {

	@JsonCreator
	StatusMixin(
			@JsonProperty("user") User user,
			@JsonProperty("idstr") long idstr,
			@JsonProperty("created_at") @JsonDeserialize(using = DateJsonDeserializer.class) Date createdAt,
			@JsonProperty("id") String id, @JsonProperty("text") String text,
			@JsonProperty("source")@JsonDeserialize(using = SourceDeserializer.class) Source source,
			@JsonProperty("favorited") boolean favorited,
			@JsonProperty("in_reply_to_status_id") long inReplyToStatusId,
			@JsonProperty("in_reply_to_user_id") long inReplyToUserId,
			@JsonProperty("inReplyToScreenName") String inReplyToScreenName,
			@JsonProperty("thumbnail_pic") String thumbnailPic,
			@JsonProperty("bmiddle_pic") String bmiddlePic,
			@JsonProperty("original_pic") String originalPic,
			@JsonProperty("retweeted_status") Status retweetedStatus,
			@JsonProperty("geo") String geo,
			@JsonProperty("reposts_count") int repostsCount,
			@JsonProperty("comments_count") int commentsCount,
			@JsonProperty("mid") String mid,
			@JsonProperty("annotations") String annotations) {}
}
