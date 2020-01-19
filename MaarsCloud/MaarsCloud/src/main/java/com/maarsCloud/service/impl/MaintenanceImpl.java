package com.maarsCloud.service.impl;

import com.maarsCloud.dao.MaintenanceDao;
import com.maarsCloud.model.Maintenance;
import com.maarsCloud.model.MaintenanceDto;
import com.maarsCloud.service.MaintenanceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service(value = "maintenanceService")
public class MaintenanceImpl implements MaintenanceService {

	@Autowired
	private MaintenanceDao maintenanceDao;
	
	@Override
	public List<?> findAllMaintenance(){
		return maintenanceDao.findAllMaintenance();
	}
	
	@Override
    public List<?> findMaintenanceUser(String emailAddress){
		return maintenanceDao.findMaintenanceUser(emailAddress);
    }

    @Override
    public Maintenance save(MaintenanceDto maintenance) {
    	Maintenance newMaintenance = new Maintenance();
    	newMaintenance.setID(maintenance.getID());
    	newMaintenance.setMostRecentDate(maintenance.getMostRecentDate());
    	newMaintenance.setTotalTime(maintenance.getTotalTime());
    	newMaintenance.setUserID(maintenance.getUserID());
		return maintenanceDao.save(newMaintenance);
    }
}
