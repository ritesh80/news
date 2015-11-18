package org.pyr.news.hib.dao.publish;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.publish.Category;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addCategory(Category category) {
		template.save(category);
	}

	public void updateCategory(Category category) {
		template.saveOrUpdate(category);
	}

	public void removeCategory(Category category) {
		template.delete(category);
	}

	public Category getCategory(int categoryID) {
		return (Category) template
				.getSessionFactory()
				.getCurrentSession()
				.createSQLQuery("select * from Category where id=" + categoryID);

	}
	/*
	 * select * from CATEGORY; select * from CATEGORY limit initial ,
	 * categperpage order by xyz select * from CATEGORY where id=x;
	 */
}
