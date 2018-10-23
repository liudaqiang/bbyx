package org.bgy_bbyx_dao.base;

import java.util.List;

public interface BaseDao <T>{
	
	public int insert(T t);
	
	public int update(T t);
	
	public T getById(T t);
	
	public List<T> findPage(T t);
	
	public Integer findPageCount(T t);
	
	public List<T> findAll(T t);
}
