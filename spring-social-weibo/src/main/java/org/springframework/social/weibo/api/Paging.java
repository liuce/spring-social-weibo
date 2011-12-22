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
public class Paging {
    private int page = -1;              //页码。注意：最多返回200条分页内容。
    private int count = -1;             //指定每页返回的记录条数。
    private long sinceId = -1;          //若指定此参数，则只返回ID比since_id大（即比since_id发表时间晚的）的微博消息。
    private long maxId = -1;            //若指定此参数，则返回ID小于或等于max_id的微博消息

}
