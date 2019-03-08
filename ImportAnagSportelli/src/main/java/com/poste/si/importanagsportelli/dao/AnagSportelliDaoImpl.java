/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importanagsportelli.dao;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.poste.si.importanagsportelli.model.AnagSportelli;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Alex
 */
@Repository
public class AnagSportelliDaoImpl
        implements AnagSportelliDao {

    final static Logger logger = LoggerFactory.getLogger(AnagSportelliDaoImpl.class);

    @Value("${sqlite.anagraficasportelli}")
    private String anagsportellitable;

    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    void postInit() {
    }

    @PreDestroy
    public void destroy() {
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<AnagSportelli> findAll() {

        // Regione|Sigla_PV|Provincia|Cod_Comune|Comune|Localita|CAP|ID_Servizio|Descrizione_Servizio|Frazionario
        String sql = "SELECT IDSPORTELLO , TIPOLOGIAFAMIGLIA , ALCOUNTRY , RAMFILIALE , FRAZIONARIO , DENOMINAZIONE , CASO , UBICAZIONE , INDIRIZZOSERVIZIO , NOTEINDIRIZZO , IDCIVICO , IDTOPONIMO , CAP , COMUNE , LOCALITA , SIGLAPROVINCIA , DESCRPROVINCIA , COORDXGRADI , COORDYGRADI , COORDXMETRI , COORDYMETRI , STATO , DATAATTIVAZIONE , DATACHIUSURADEFINITIVA , CHIUSURAPIANIFICATA , ORARIOCONSEGNAINESITATE , PREDISPOSTI , ATTIVI1 , ATTIVI2 , BACKOFFICE , NOTE , TELEFONO , ISCANCELLATO  FROM "
                + anagsportellitable;

        logger.info("findAll - query is " + sql);

        List<AnagSportelli> anagsportellilist = this.jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(AnagSportelli.class));

        return anagsportellilist;

    }

    @Override
    public List<AnagSportelli> findInfoByCap(String cap) {

        // Regione|Sigla_PV|Provincia|Cod_Comune|Comune|Localita|CAP|ID_Servizio|Descrizione_Servizio|Frazionario        
        String sql = "SELECT IDSPORTELLO , TIPOLOGIAFAMIGLIA , ALCOUNTRY , RAMFILIALE , FRAZIONARIO , DENOMINAZIONE , CASO , UBICAZIONE , INDIRIZZOSERVIZIO , NOTEINDIRIZZO , IDCIVICO , IDTOPONIMO , CAP , COMUNE , LOCALITA , SIGLAPROVINCIA , DESCRPROVINCIA , COORDXGRADI , COORDYGRADI , COORDXMETRI , COORDYMETRI , STATO , DATAATTIVAZIONE , DATACHIUSURADEFINITIVA , CHIUSURAPIANIFICATA , ORARIOCONSEGNAINESITATE , PREDISPOSTI , ATTIVI1 , ATTIVI2 , BACKOFFICE , NOTE , TELEFONO , ISCANCELLATO  FROM "        
                + anagsportellitable
                + " WHERE CAP = "
                + "\"" + cap + "\"";

        logger.info("findInfoByCap - query is " + sql);

        List<AnagSportelli> anagsportellilist = this.jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(AnagSportelli.class));

        return anagsportellilist;

    }

}
