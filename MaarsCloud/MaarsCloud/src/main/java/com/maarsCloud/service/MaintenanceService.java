package com.maarsCloud.service;


import java.util.List; 

import com.maarsCloud.model.Maintenance;
import com.maarsCloud.model.MaintenanceDto;

public interface MaintenanceService {
	
    List<?> findAllMaintenance();
    List<?> findMaintenanceUser(String emailAddress);

    public Maintenance save(MaintenanceDto maintenance);

}
