package org.pyr.news.hib.dao.publish;

import com.pyr.news.hib.model.publish.Category;

public interface CategoryDao {

	public void addCategory(Category category);
	
	public void updateCategory(Category category);
	
	public void removeCategory(Category category);
	
	public Category getCategory(int categoryID);
}
