package org.pyr.news.service.accnt;

import org.pyr.news.hib.dao.publish.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations= {"classpath:config/appContext.xml"})
public class ServiceTest {

	private ArticleDao articleDaoImpl;
	@Autowired(required=true)
	public ArticleDao getArticleDaoImpl() {
		return articleDaoImpl;
	}
	public void setArticleDaoImpl(ArticleDao articleDaoImpl) {
		this.articleDaoImpl = articleDaoImpl;
	}
	//@Test
	public void setup(){
		articleDaoImpl.getArticle(1);
		
	}

}
