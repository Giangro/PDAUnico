#!/usr/bin/bash

# IdSportello|Tipologia Famiglia Sportello|AL_Country|RAM_Filiale|Frazionario|Denominazione|Caso|Ubicazione|Indirizzo (del servizio)|Note Indirizzo|IdCivico|IdToponimo|CAP|Comune|Localita|Sigla Provincia|Descrizione Provincia|CoordinateX_Gradi|CoordinateY_Gradi|CoordinateX_Metri|CoordinateY_Metri|Stato|Data di attivazione|Data Chiusura definitiva|Chiusura pianificata (Santo Patrono)|Orario consegna inesitate|Predisposti|Attivi1|Attivi2|BackOffice|Note|Telefono|IsCancellato

echo -n loading anagraficasportelli from "SASP_ANAGSPORTELLI_FULL_20190212170338.txt"...
sqlite3 anagraficasportelli.db <<!
	DROP TABLE IF EXISTS anagraficasportelli; 
	CREATE TABLE anagraficasportelli (IDSPORTELLO TEXT, TIPOLOGIAFAMIGLIA TEXT, ALCOUNTRY TEXT, RAMFILIALE TEXT, FRAZIONARIO TEXT, DENOMINAZIONE TEXT, CASO TEXT, UBICAZIONE TEXT, INDIRIZZOSERVIZIO TEXT, NOTEINDIRIZZO TEXT, IDCIVICO INTEGER, IDTOPONIMO INTEGER, CAP TEXT, COMUNE TEXT, LOCALITA TEXT, SIGLAPROVINCIA TEXT, DESCRPROVINCIA TEXT, COORDXGRADI TEXT, COORDYGRADI TEXT, COORDXMETRI TEXT, COORDYMETRI TEXT, STATO TEXT, DATAATTIVAZIONE TEXT, DATACHIUSURADEFINITIVA TEXT, CHIUSURAPIANIFICATA TEXT, ORARIOCONSEGNAINESITATE TEXT, PREDISPOSTI TEXT, ATTIVI1 TEXT, ATTIVI2 TEXT, BACKOFFICE TEXT, NOTE TEXT, TELEFONO TEXT, ISCANCELLATO TEXT, PRIMARY KEY(IDSPORTELLO));
	CREATE INDEX idx_anagraficasportelli_cap ON anagraficasportelli (cap);
.separator "|"
.import SASP_ANAGSPORTELLI_FULL_20190212170338.txt anagraficasportelli
!
echo OK


