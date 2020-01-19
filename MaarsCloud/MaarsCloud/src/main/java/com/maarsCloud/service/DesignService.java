package com.maarsCloud.service;


import java.util.List;

import com.maarsCloud.model.Design;
import com.maarsCloud.model.DesignDto;

public interface DesignService {
	
    List<?> findAllDesign();
    public Design save(DesignDto design);

}
