/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importsportellicap.scheduledimport;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    private final static Logger logger = LoggerFactory.getLogger(ImportSportelliCapTask.class);
    private final static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    @Scheduled(fixedRate = 5000)
    public void doImportSportelliCapTask() {
        logger.info("The time is now {}", dateFormat.format(new Date()));
    }
     
}
