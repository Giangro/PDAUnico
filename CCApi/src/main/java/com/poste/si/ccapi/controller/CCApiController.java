/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.ccapi.controller;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alex
 */
@RestController
public class CCApiController {
    
    @RequestMapping(value="/status", produces="application/json")
    @ResponseBody
    public HashMap<Integer,String> getStatus() {
        HashMap<Integer,String> status = new HashMap<>();
        status.put(0, "Success");
        return status;
    }
}
