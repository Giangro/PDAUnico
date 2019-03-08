#!/usr/bin/bash

#Regione|Sigla_PV|Provincia|Cod_Comune|Comune|Localita|CAP|ID_Servizio|Descrizione_Servizio|Frazionario

function load_data_into_db() {

	echo -n loading sportellicap from "SASP_SPORTELLICAP_FULL_20190212170338.txt"...
	sqlite3 sportellicap.db <<!
		DROP TABLE IF EXISTS sportellicap; 
		CREATE TABLE sportellicap (REGIONE TEXT,SIGLAPV TEXT,PROVINCIA TEXT,CODCOMUNE TEXT,COMUNE TEXT,LOCALITA TEXT,CAP TEXT,IDSERVIZIO TEXT,DESCRIZIONESERVIZIO TEXT,FRAZIONARIO TEXT) ;
.separator "|"
.import SASP_SPORTELLICAP_FULL_20190212170338.txt sportellicap
	CREATE INDEX idx_sportellicap_cap ON sportellicap (cap);
!
	echo OK

}

while true; do
	echo -n "schedule importing at "
	date
	load_data_into_db
	sleep 5
done	



