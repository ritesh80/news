package com.pyr.news.hib.model.article;

// Generated Nov 3, 2014 6:10:49 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ArticleSectionId generated by hbm2java
 */
@Embeddable
public class ArticleSectionId implements java.io.Serializable {

	private int articleId;
	private int sectionId;

	public ArticleSectionId() {
	}

	public ArticleSectionId(int articleId, int sectionId) {
		this.articleId = articleId;
		this.sectionId = sectionId;
	}

	@Column(name = "article_id", nullable = false)
	public int getArticleId() {
		return this.articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	@Column(name = "section_id", nullable = false)
	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ArticleSectionId))
			return false;
		ArticleSectionId castOther = (ArticleSectionId) other;

		return (this.getArticleId() == castOther.getArticleId())
				&& (this.getSectionId() == castOther.getSectionId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getArticleId();
		result = 37 * result + this.getSectionId();
		return result;
	}

}
