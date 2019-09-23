package com.developer.SpringMysql.models;

import org.springframework.data.repository.CrudRepository;

//link this interface to AppUsers class to get data
public interface AppUsersRepo extends CrudRepository<AppUsers,Integer>{

}
