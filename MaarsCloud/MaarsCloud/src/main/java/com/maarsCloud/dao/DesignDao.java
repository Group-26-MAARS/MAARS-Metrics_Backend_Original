package com.maarsCloud.dao;

import com.maarsCloud.model.Design; 

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;
@Repository
public interface DesignDao extends CrudRepository<Design, Integer> {
    
	Design findByID(int id);
 
     @Query(value = "select u.firstName, u.LastName,Date(d.mostRecentDate), d.totalTime "
     		+ "from users u, design d where d.id = u.id order by d.totalTime DESC", 
    		  nativeQuery = true)
    		List<?> findAllDesign();

}
