package com.pyr.news.hib.model.article;

// Generated Nov 3, 2014 6:10:49 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ArticleStory generated by hbm2java
 */
@Entity
@Table(name = "article_story", catalog = "demo_news")
public class ArticleStory implements java.io.Serializable {

	private Integer id;
	private String story;
	private Set articles = new HashSet(0);

	public ArticleStory() {
	}

	public ArticleStory(String story) {
		this.story = story;
	}

	public ArticleStory(String story, Set articles) {
		this.story = story;
		this.articles = articles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "story", nullable = false, length = 65535)
	public String getStory() {
		return this.story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "articleStory")
	public Set getArticles() {
		return this.articles;
	}

	public void setArticles(Set articles) {
		this.articles = articles;
	}

}
