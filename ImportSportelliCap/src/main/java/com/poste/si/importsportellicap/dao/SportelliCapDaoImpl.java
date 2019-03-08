/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importsportellicap.dao;

import com.poste.si.importsportellicap.model.SportelliCap;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Alex
 */
@Repository
public class SportelliCapDaoImpl
        implements SportelliCapDao {

    final static Logger logger = LoggerFactory.getLogger(SportelliCapDaoImpl.class);

    @Value("${sqlite.sportellicap}")
    private String sportellicaptable;

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @PostConstruct
    void postInit() {
    }

    @PreDestroy
    public void destroy() {
    }

    @Override
    public List<SportelliCap> findAll() {
        
        // Regione|Sigla_PV|Provincia|Cod_Comune|Comune|Localita|CAP|ID_Servizio|Descrizione_Servizio|Frazionario
        String sql = "SELECT REGIONE, SIGLAPV, PROVINCIA, CODCOMUNE, COMUNE, LOCALITA, CAP, IDSERVIZIO, FRAZIONARIO FROM "
                + sportellicaptable;
        
        logger.info ("findAll - query is "+sql);
        
        List<SportelliCap> sportellicaplist = this.jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(SportelliCap.class));

        return sportellicaplist;

    }
    
    @Override
    public List<SportelliCap> findInfoByCap(String cap) {
        
        // Regione|Sigla_PV|Provincia|Cod_Comune|Comune|Localita|CAP|ID_Servizio|Descrizione_Servizio|Frazionario
        String sql = "SELECT REGIONE, SIGLAPV, PROVINCIA, CODCOMUNE, COMUNE, LOCALITA, CAP, IDSERVIZIO, FRAZIONARIO FROM "
                + sportellicaptable
                + " WHERE CAP = "
                + "\""+cap+"\"";

        logger.info ("findInfoByCap - query is "+sql);
        
        List<SportelliCap> sportellicaplist = this.jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(SportelliCap.class));

        return sportellicaplist;

    }

}
