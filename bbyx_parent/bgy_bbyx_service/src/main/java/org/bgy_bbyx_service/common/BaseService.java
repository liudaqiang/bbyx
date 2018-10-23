package org.bgy_bbyx_service.common;

import java.util.List;

public interface BaseService<T> {
	
	public boolean insert(T t);

	public boolean update(T t);

	public T getById(T t);

	public List<T> findPage(T t);

	public Integer findPageCount(T t);

	public List<T> findAll(T t);
}
