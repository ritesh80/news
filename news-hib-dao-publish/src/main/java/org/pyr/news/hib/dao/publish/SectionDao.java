package org.pyr.news.hib.dao.publish;

import com.pyr.news.hib.model.publish.Section;

public interface SectionDao {
	public void addSection(Section section);
	
	public void updateSection(Section section);
	
	public void removeSection(Section section);
	
	public Section getSection(int sectionID);
}
