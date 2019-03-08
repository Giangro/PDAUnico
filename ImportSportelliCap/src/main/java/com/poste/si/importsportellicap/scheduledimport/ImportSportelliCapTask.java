/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importsportellicap.scheduledimport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Alex
 */

@Component
public class ImportSportelliCapTask {

    final static Logger logger = LoggerFactory.getLogger(ImportSportelliCapTask.class);
    
    @Scheduled(fixedRate = 5000)
    public void doImportSportelliCapTask() {
        logger.info("scheduled ... ");
    }
     
}
