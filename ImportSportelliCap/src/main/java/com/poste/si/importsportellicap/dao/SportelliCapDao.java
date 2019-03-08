/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importsportellicap.dao;

import com.poste.si.importsportellicap.model.SportelliCap;
import java.util.List;


/**
 *
 * @author Alex
 */

public interface SportelliCapDao {
    //public void save(String cap);
    public List<SportelliCap> findInfoByCap(String Cap);  
    public List<SportelliCap> findAll();  
}

