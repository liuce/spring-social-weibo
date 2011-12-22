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
public class Source {
	private String url; // 来源连接
	private String relationShip;
	private String name; // 来源文案名称

	/**
	 * 
	 */
	public Source() {
	}

	/**
	 * @param url
	 * @param relationShip
	 * @param name
	 */
	public Source(String url, String relationShip, String name) {
		this.url = url;
		this.relationShip = relationShip;
		this.name = name;
	}

	public static Source valueOf(String url, String relationShip, String name) {
		return new Source(url, relationShip, name);
	}
}
