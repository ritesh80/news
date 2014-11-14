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

	@Autowired
	private ArticleDao articleDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private SectionDao sectionDao;
	
	public void addArticle(Article article){
		articleDao.addArticle(article);
	}
	
	public void updateArticle(Article article){
		articleDao.updateArticle(article);
	}
	
	public void removeArticle(Article article){
		articleDao.removeArticle(article);
	}
	
	public Article getArticle(int articleID){
		return articleDao.getArticle(articleID);
	}
	
	public void addCategory(Category category){
		categoryDao.addCategory(category);
	}
	
	public void updateCategory(Category category){
		categoryDao.updateCategory(category);
	}
	
	public void removeCategory(Category category){
		categoryDao.removeCategory(category);
	}
	
	public Category getCategory(int categoryID){
		return categoryDao.getCategory(categoryID);
	}
	
	
	public void addSection(Section section){
		sectionDao.addSection(section);
	}
	
	public void updateSection(Section section){
		sectionDao.updateSection(section);
	}
	
	public void removeSection(Section section){
		sectionDao.removeSection(section);
	}
	
	public Section getSection(int sectionID){
		return sectionDao.getSection(sectionID);
	}
}
