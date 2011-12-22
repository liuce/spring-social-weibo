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

import java.util.Date;

/**
 * @author liuce
 * 
 */
public class Status {
	private User user = null; // 作者信息
	private long idstr; // 保留字段，请勿使用
	private Date createdAt; // status创建时间
	private String id; // status id
	private String text; // 微博内容
	private Source source; // 微博来源
	private boolean favorited; // 是否已收藏
	private long inReplyToStatusId; // 回复ID
	private long inReplyToUserId; // 回复人ID
	private String inReplyToScreenName; // 回复人昵称
	private String thumbnailPic; // 微博内容中的图片的缩略地址
	private String bmiddlePic; // 中型图片
	private String originalPic; // 原始图片
	private Status retweetedStatus = null; // 转发的博文，内容为status，如果不是转发，则没有此字段
	private String geo; // 地理信息，保存经纬度，没有时不返回此字段
	private double latitude = -1; // 纬度
	private double longitude = -1; // 经度
	private int repostsCount; // 转发数
	private int commentsCount; // 评论数
	private String mid; // 微博MID
	private String annotations; // 元数据，没有时不返回此字段

}
