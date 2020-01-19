package com.maarsCloud.service.impl;

import com.maarsCloud.dao.TrainingDao;
import com.maarsCloud.model.Training;
import com.maarsCloud.model.TrainingDto;
import com.maarsCloud.service.TrainingService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Service(value = "trainingService")
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private TrainingDao trainingDao;
	
	@Override
	public List<?> findAllTraining(){
		return trainingDao.findAllTraining();
	}
    @Override
    public Training save(TrainingDto training) {
    	Training newTraining = new Training();
    	newTraining.setID(training.getID());
    	newTraining.setMostRecentDate(training.getMostRecentDate());
    	newTraining.setPercentProgress(training.getPercentProgress());
    	newTraining.setUserID(training.getUserID());

		return trainingDao.save(newTraining);
    }
}
