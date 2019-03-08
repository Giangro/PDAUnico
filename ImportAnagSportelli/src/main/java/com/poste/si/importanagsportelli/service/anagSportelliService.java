/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importanagsportelli.service;

import com.poste.si.importanagsportelli.dao.AnagSportelliDao;
import com.poste.si.importanagsportelli.model.AnagSportelli;
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
public class anagSportelliService {

    final static Logger logger = LoggerFactory.getLogger(anagSportelliService.class);

    @Autowired
    AnagSportelliDao anagSportelliDao;

    public List<AnagSportelli> findAllAnagSportelliService() {
        return anagSportelliDao.findAll();
    }

    public List<AnagSportelli> findInfoByCapService(String cap) {
        return anagSportelliDao.findInfoByCap(cap);
    }

}
