/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importsportellicap.service;

import com.poste.si.importsportellicap.dao.SportelliCapDao;
import com.poste.si.importsportellicap.model.SportelliCap;
import com.poste.si.importsportellicap.scheduledimport.ImportSportelliCapTask;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Alex
 */

@Service
public class SportelliCapService {

    final static Logger logger = LoggerFactory.getLogger(SportelliCapService.class);
 
    @Autowired
    SportelliCapDao sportelliCapDao;
    
    public  List<SportelliCap> findAllSportelliCapService() {
        return sportelliCapDao.findAll();
    }
    
}
