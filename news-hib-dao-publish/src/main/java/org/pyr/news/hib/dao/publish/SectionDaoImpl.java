package org.pyr.news.hib.dao.publish;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.publish.Section;
@Repository
@Transactional
public class SectionDaoImpl implements SectionDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addSection(Section section){
		sessionFactory.getCurrentSession().save(section);
	}
	
	public void updateSection(Section section){
		sessionFactory.getCurrentSession().saveOrUpdate(section);
	}
	
	public void removeSection(Section section){
		sessionFactory.getCurrentSession().delete(section);
		
	}
	
	public Section getSection(int sectionID){
		return(Section)sessionFactory.getCurrentSession().createSQLQuery("select * FROM  section where id="+sectionID);
	}
}
