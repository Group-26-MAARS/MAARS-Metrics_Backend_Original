package com.maarsCloud.dao;

import com.maarsCloud.model.ProcGen;  
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;
@Repository
public interface ProcGenDao extends CrudRepository<ProcGen, Integer> {
    
    ProcGen findByID(int id);
    
    @Query(value = "select u.firstName, u.LastName, Date(pg.date), pg.boltTime, pg.safetyWireTime, "
    		+ "pg.adhesiveTime, pg.ppeTime, pg.totalTime from users u, proceduregeneration pg "
    		+ "where pg.id = u.id order by pg.totalTime Asc limit 10", 
    		  nativeQuery = true)
    		List<?> findAllProcGen();
}
