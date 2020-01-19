package com.maarsCloud.service.impl;

import com.maarsCloud.dao.ProcGenDao;
import com.maarsCloud.model.ProcGen;
import com.maarsCloud.model.ProcGenDto;
import com.maarsCloud.service.ProcGenService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service(value = "procGenService")
public class ProcGenServiceImpl implements ProcGenService {

	@Autowired
	private ProcGenDao procGenDao;
	
	@Override
	public List<?> findAllProcGen(){
		return procGenDao.findAllProcGen();
	}
    @Override
    public ProcGen save(ProcGenDto procGen) {
    	ProcGen newProcGen = new ProcGen();
    	newProcGen.setID(procGen.getID());
    	newProcGen.setDate(procGen.getDate());
    	newProcGen.setBoltTime(procGen.getBoltTime());
    	newProcGen.setSafetyWireTime(procGen.getSafetyWireTime());
    	newProcGen.setAdhesiveTime(procGen.getAdhesiveTime());
    	newProcGen.setPPETime(procGen.getPPETime());
    	newProcGen.setUserID(procGen.getUserID());
		return procGenDao.save(newProcGen);
    }
}
