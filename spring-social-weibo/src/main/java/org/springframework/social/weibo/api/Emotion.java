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

/**
 * @author liuce
 *
 */
public class Emotion {
	private String phrase;           //表情使用的替代文字
	private String type;             //表情类型，image为普通图片表情，magic为魔法表情
	private String url;              //表情图片存放的位置
	private boolean isHot;           //是否为热门表情
	private boolean isCommon;        //是否是常用表情
	private int orderNumber;         //该表情在系统中的排序号码
	private String category;         //表情分类
}
