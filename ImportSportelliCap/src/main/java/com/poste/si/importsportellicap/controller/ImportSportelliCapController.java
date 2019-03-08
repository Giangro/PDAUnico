/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importsportellicap.controller;

import com.poste.si.importsportellicap.model.SportelliCap;
import com.poste.si.importsportellicap.service.SportelliCapService;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alex
 */
@RestController
public class ImportSportelliCapController {

    @Autowired
    SportelliCapService sportelliCapService;
    
    @RequestMapping(value = "/allsportellicap", produces = "application/json")
    @ResponseBody
    public List<SportelliCap> getAllSportelliCap() {
        return sportelliCapService.findAllSportelliCapService();
    }
    
    @RequestMapping(value = "/infobycap/{cap}", produces = "application/json")
    @ResponseBody
    public List<SportelliCap> getInfoByCap(@PathVariable("cap") String cap) {
        return sportelliCapService.findInfoByCapService(cap);
    }

}
