package com.pyr.news.hib.dao;

public interface InitDao {
	public void insert(Object obj);

	public void update(Object obj);

	public void remove(Object obj);

	public Object get(Class<?> c, int accountID);
}
