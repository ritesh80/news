package org.pyr.news.service.accnt;

import org.pyr.news.hib.dao.publish.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations= {"classpath:config/appContext.xml"})

import com.pyr.news.hib.model.publish.Article;

public class ServiceTest {

	private ArticleDao articleDaoImpl;

	@Autowired(required = true)
	public ArticleDao getArticleDaoImpl() {
		return articleDaoImpl;
	}

	public void setArticleDaoImpl(ArticleDao articleDaoImpl) {
		this.articleDaoImpl = articleDaoImpl;
	}

	// @Test
	public void setup() {
		articleDaoImpl.get(Article.class, 1);

	}

}
