package com.site.blog.my.core.controller.vo;

import java.io.Serializable;

// 首页侧栏点击热门博客和最新博客值对象
public class SimpleBlogListVO implements Serializable {

	private Long blogId;

	private String blogTitle;

	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
}
