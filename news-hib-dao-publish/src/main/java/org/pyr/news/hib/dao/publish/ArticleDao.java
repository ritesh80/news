package org.pyr.news.hib.dao.publish;

import com.pyr.news.hib.model.publish.Article;

public interface ArticleDao {
	public void addArticle(Article article);
	
	public void updateArticle(Article article);
	
	public void removeArticle(Article article);
	
	public Article getArticle(int articleID);
}
