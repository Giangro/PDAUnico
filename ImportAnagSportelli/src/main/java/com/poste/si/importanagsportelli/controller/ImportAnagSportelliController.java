/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importanagsportelli.controller;

import com.poste.si.importanagsportelli.model.AnagSportelli;
import com.poste.si.importanagsportelli.service.anagSportelliService;
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
public class ImportAnagSportelliController {

    @Autowired
    anagSportelliService anagSportelliService;

    @RequestMapping(value = "/allanagsportelli", produces = "application/json")
    @ResponseBody
    public List<AnagSportelli> getAllAnagSportelli() {
        return anagSportelliService.findAllAnagSportelliService();
    }

    @RequestMapping(value = "/infobycap/{cap}", produces = "application/json")
    @ResponseBody
    public List<AnagSportelli> getInfoByCap(@PathVariable("cap") String cap) {
        return anagSportelliService.findInfoByCapService(cap);
    }
}
