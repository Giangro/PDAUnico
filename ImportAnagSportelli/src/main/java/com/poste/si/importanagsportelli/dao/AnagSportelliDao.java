/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importanagsportelli.dao;

import com.poste.si.importanagsportelli.model.AnagSportelli;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface AnagSportelliDao {
    
    //public void save(String cap);
    public List<AnagSportelli> findInfoByCap(String Cap);
    public List<AnagSportelli> findAll();
}
