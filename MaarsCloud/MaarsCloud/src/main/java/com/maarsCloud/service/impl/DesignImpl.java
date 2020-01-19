package com.maarsCloud.service.impl;

import com.maarsCloud.dao.DesignDao;
import com.maarsCloud.model.Design;
import com.maarsCloud.model.DesignDto;
import com.maarsCloud.service.DesignService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service(value = "designService")
public class DesignImpl implements DesignService {

	@Autowired
	private DesignDao designDao;
	
	@Override
	public List<?> findAllDesign(){
		return designDao.findAllDesign();
	}
    @Override
    public Design save(DesignDto design) {
    	Design newDesign = new Design();
    	newDesign.setID(design.getID());
    	newDesign.setMostRecentDate(design.getMostRecentDate());
    	newDesign.setTotalTime(design.getTotalTime());
    	newDesign.setUserID(design.getUserID());
		return designDao.save(newDesign);
    }
}
