package org.pyr.news.hib.dao.publish;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.publish.Section;

@Repository
@Transactional
public class SectionDaoImpl implements SectionDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addSection(Section section) {
		template.save(section);
	}

	public void updateSection(Section section) {
		template.saveOrUpdate(section);
	}

	public void removeSection(Section section) {
		template.delete(section);

	}

	public Section getSection(int sectionID) {
		return (Section) template.getSessionFactory().getCurrentSession()
				.createSQLQuery("select * FROM  section where id=" + sectionID);
	}
}
