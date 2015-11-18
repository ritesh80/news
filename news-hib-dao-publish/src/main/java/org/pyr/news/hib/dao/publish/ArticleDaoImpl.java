package org.pyr.news.hib.dao.publish;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.publish.Article;

@Repository
@Transactional
public class ArticleDaoImpl implements ArticleDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addArticle(Article article) {
		template.save(article);
	}

	public void updateArticle(Article article) {
		template.saveOrUpdate(article);
	}

	public void removeArticle(Article article) {
		template.delete(article);
	}

	public Article getArticle(int articleID) {
		return (Article) template.getSessionFactory().getCurrentSession()
				.createSQLQuery("select * from Article where id=" + articleID);
	}
	/*
	 * select * from ARTICLE limit initial, articleperpage select * from ARTICLE
	 * where id=x; select count(*) from ARTICLE ; select * from ARTICLE where
	 * status in ('Active');
	 */
}
