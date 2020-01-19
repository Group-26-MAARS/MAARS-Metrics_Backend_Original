package com.maarsCloud.dao;

import com.maarsCloud.model.Training;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.*;
@Repository
public interface TrainingDao extends CrudRepository<Training, Integer> {
    
	Training findByID(int id);
 
     @Query(value = "select u.firstName, u.LastName,Date(t.mostRecentDate), t.percentProgress "
     		+ "from users u, training t where t.id = u.id order by t.percentProgress Desc limit 10", 
    		  nativeQuery = true)
    		List<?> findAllTraining();

}
