package com.maarsCloud.service;

//import com.maarsCloud.model.ProcGen;

import java.util.List;

import com.maarsCloud.model.ProcGen;
import com.maarsCloud.model.ProcGenDto;

public interface ProcGenService {
    
    List<?> findAllProcGen();

    public ProcGen save(ProcGenDto procGen);
}
