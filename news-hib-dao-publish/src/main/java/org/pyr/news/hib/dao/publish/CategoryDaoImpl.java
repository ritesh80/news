package org.pyr.news.hib.dao.publish;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.publish.Category;
@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCategory(Category category){
		sessionFactory.getCurrentSession().save(category);
	}
	
	public void updateCategory(Category category){
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}
	
	public void removeCategory(Category category){
		sessionFactory.getCurrentSession().delete(category);
	}
	
	public Category getCategory(int categoryID){
		return (Category)sessionFactory.getCurrentSession().createSQLQuery("select * from Category where id="+categoryID);
		
	}
}
