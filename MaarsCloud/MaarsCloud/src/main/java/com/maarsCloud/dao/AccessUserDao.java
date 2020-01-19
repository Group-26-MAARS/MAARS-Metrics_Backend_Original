package com.maarsCloud.dao;

import com.maarsCloud.model.AccessUser;  

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;
@Repository
public interface AccessUserDao extends CrudRepository<AccessUser, Integer> {
    
    AccessUser findByUsername(String username);
    
}
