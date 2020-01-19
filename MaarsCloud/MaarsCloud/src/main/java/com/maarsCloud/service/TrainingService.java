package com.maarsCloud.service;


import java.util.List;

import com.maarsCloud.model.Training;
import com.maarsCloud.model.TrainingDto;

public interface TrainingService {
	
    List<?> findAllTraining();
    
    public Training save(TrainingDto training);

}
