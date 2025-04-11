package com.ugur.hibernateAndJpa.DataAccess;

import java.util.List;

import com.ugur.hibernateAndJpa.Entities.*;



public interface ICityDal {

	List<City> getAll();
	
	void add(City city);
	
	void update(City city);
	
	void delete(City city);
	
	City getById(int id);
}
