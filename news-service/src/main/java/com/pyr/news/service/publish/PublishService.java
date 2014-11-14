package com.pyr.news.service.publish;

import com.pyr.news.hib.model.publish.Article;
import com.pyr.news.hib.model.publish.Category;
import com.pyr.news.hib.model.publish.Section;

public interface PublishService {
	public void addArticle(Article article);
	
	public void updateArticle(Article article);
	
	public void removeArticle(Article article);
	
	public Article getArticle(int articleID);
	
	public void addCategory(Category category);
	
	public void updateCategory(Category category);
	
	public void removeCategory(Category category);
	
	public Category getCategory(int categoryID);
	
	
	public void addSection(Section section);
	
	public void updateSection(Section section);
	
	public void removeSection(Section section);
	
	public Section getSection(int sectionID);
}
