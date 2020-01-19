package com.maarsCloud.dao;

import java.util.List; 

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.maarsCloud.model.Maintenance;


import org.springframework.data.jpa.repository.*;
@Repository
public interface MaintenanceDao extends CrudRepository<Maintenance, Integer> {
    
    Maintenance findByID(int id);
    
    @Query(value = "select u.firstName, u.LastName, Date(m.mostRecentDate), "
    		+ "m.totalTime from users u, maintenance m where m.id = u.id order by m.totalTime DESC limit 10", 
    		  nativeQuery = true)
    		List<?> findAllMaintenance();
    /*
	@Query("select u.emailAddress, m.mostRecentDate, m.totalTime from users u, maintenance m\n" + 
			"where u.ID = m.userID And u.emailAddress = emailAddress order by m.mostRecentDate DESC limit 1")
			List<?> findMaintenanceUser(@Param("emailAddress") String emailAddress);
	*/
    
    @Query(value = "select u.emailAddress, m.mostRecentDate, m.totalTime from users u, maintenance m" 
   			+"where u.ID = m.userID And u.emailAddress = %?1 order by m.mostRecentDate DESC limit 1;",
  		  nativeQuery = true)
    List<?> findMaintenanceUser(String emailAddress);
	}