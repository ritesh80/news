package com.pyr.news.service.publish;

import org.pyr.news.hib.dao.publish.ArticleDao;
import org.pyr.news.hib.dao.publish.CategoryDao;
import org.pyr.news.hib.dao.publish.SectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyr.news.hib.model.publish.Article;
import com.pyr.news.hib.model.publish.Category;
import com.pyr.news.hib.model.publish.Section;

@Service
public class PublishServiceImpl implements PublishService {

	// @Autowired
	public ArticleDao articleDaoImpl;

	// @Autowired
	private CategoryDao categoryDaoImpl;

	// @Autowired
	private SectionDao sectionDaoImpl;

	@Autowired
	public ArticleDao getArticleDaoImpl() {
		return articleDaoImpl;
	}

	public void setArticleDaoImpl(ArticleDao articleDaoImpl) {
		this.articleDaoImpl = articleDaoImpl;
	}

	@Autowired
	public CategoryDao getCategoryDaoImpl() {
		return categoryDaoImpl;
	}

	public void setCategoryDaoImpl(CategoryDao categoryDaoImpl) {
		this.categoryDaoImpl = categoryDaoImpl;
	}

	@Autowired
	public SectionDao getSectionDaoImpl() {
		return sectionDaoImpl;
	}

	public void setSectionDaoImpl(SectionDao sectionDaoImpl) {
		this.sectionDaoImpl = sectionDaoImpl;
	}

	public void addArticle(Article article) {
		articleDaoImpl.insert(article);
	}

	public void updateArticle(Article article) {
		articleDaoImpl.update(article);
	}

	public void removeArticle(Article article) {
		articleDaoImpl.remove(article);
	}

	public Article getArticle(int articleID) {
		return (Article) articleDaoImpl.get(Article.class, articleID);
	}

	public void addCategory(Category category) {
		categoryDaoImpl.insert(category);
	}

	public void updateCategory(Category category) {
		categoryDaoImpl.update(category);
	}

	public void removeCategory(Category category) {
		categoryDaoImpl.remove(category);
	}

	public Category getCategory(int categoryID) {
		return (Category) categoryDaoImpl.get(Category.class, categoryID);
	}

	public void addSection(Section section) {
		sectionDaoImpl.insert(section);
	}

	public void updateSection(Section section) {
		sectionDaoImpl.update(section);
	}

	public void removeSection(Section section) {
		sectionDaoImpl.remove(section);
	}

	public Section getSection(int sectionID) {
		return (Section) sectionDaoImpl.get(Section.class, sectionID);
	}
}
