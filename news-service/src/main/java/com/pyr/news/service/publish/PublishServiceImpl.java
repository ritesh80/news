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
	public ArticleDao articleDaoImpl;
	
	@Autowired
	private CategoryDao categoryDaoImpl;
	
	@Autowired
	private SectionDao sectionDaoImpl;
	
	public void addArticle(Article article){
		articleDaoImpl.addArticle(article);
	}
	
	public void updateArticle(Article article){
		articleDaoImpl.updateArticle(article);
	}
	
	public void removeArticle(Article article){
		articleDaoImpl.removeArticle(article);
	}
	
	public Article getArticle(int articleID){
		return articleDaoImpl.getArticle(articleID);
	}
	
	public void addCategory(Category category){
		categoryDaoImpl.addCategory(category);
	}
	
	public void updateCategory(Category category){
		categoryDaoImpl.updateCategory(category);
	}
	
	public void removeCategory(Category category){
		categoryDaoImpl.removeCategory(category);
	}
	
	public Category getCategory(int categoryID){
		return categoryDaoImpl.getCategory(categoryID);
	}
	
	
	public void addSection(Section section){
		sectionDaoImpl.addSection(section);
	}
	
	public void updateSection(Section section){
		sectionDaoImpl.updateSection(section);
	}
	
	public void removeSection(Section section){
		sectionDaoImpl.removeSection(section);
	}
	
	public Section getSection(int sectionID){
		return sectionDaoImpl.getSection(sectionID);
	}
}
