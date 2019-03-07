-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versione server:              5.7.22 - MySQL Community Server (GPL)
-- S.O. server:                  Linux
-- HeidiSQL Versione:            9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dump della struttura del database PDAUnico
CREATE DATABASE IF NOT EXISTS `PDAUnico` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;
USE `PDAUnico`;

-- Dump della struttura di tabella PDAUnico.AnagSportelli
CREATE TABLE IF NOT EXISTS `AnagSportelli` (
  `IdSportello` int(11) NOT NULL,
  `TipologiaFamigliaSportello` varchar(50) COLLATE utf8_bin NOT NULL COMMENT 'Es. Ufficio Postale, Casa Comunale, Sportello di Cortesia',
  `AL_Country` varchar(25) COLLATE utf8_bin NOT NULL,
  `RAM_Filiale` varchar(25) COLLATE utf8_bin NOT NULL,
  `Frazionario` varchar(10) COLLATE utf8_bin NOT NULL,
  `Colonna 6` varchar(10) COLLATE utf8_bin NOT NULL,
  `Denominazione` varchar(100) COLLATE utf8_bin NOT NULL,
  `Caso` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT 'Es. caso 1, caso 2',
  `Ubicazione` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT 'Descrizione Caso',
  `Indirizzo` varchar(255) COLLATE utf8_bin NOT NULL COMMENT 'Indirizzo (del servizio)',
  `NoteIndirizzo` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `IdCivico` int(11) DEFAULT NULL,
  `IdToponimo` int(11) DEFAULT NULL,
  `CAP` varchar(5) COLLATE utf8_bin NOT NULL,
  `Comune` varchar(100) COLLATE utf8_bin NOT NULL,
  `Localita` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `SiglaProvincia` varchar(2) COLLATE utf8_bin NOT NULL,
  `DescrizioneProvincia` varchar(100) COLLATE utf8_bin NOT NULL,
  `CoordinateX_Gradi` varchar(18) COLLATE utf8_bin DEFAULT NULL COMMENT 'Es. 14,7240902967',
  `CoordinateY_Gradi` varchar(18) COLLATE utf8_bin DEFAULT NULL COMMENT 'Es. 36,9182283406',
  `CoordinateX_Metri` varchar(18) COLLATE utf8_bin DEFAULT NULL COMMENT 'Es. 1010089,5028882160',
  PRIMARY KEY (`IdSportello`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='anagrafica proveniente da SASP';

-- L’esportazione dei dati non era selezionata.
-- Dump della struttura di tabella PDAUnico.CalendarioSportelli
CREATE TABLE IF NOT EXISTS `CalendarioSportelli` (
  `IdSportello` int(11) NOT NULL,
  `Frazionario` varchar(10) COLLATE utf8_bin NOT NULL,
  `TipoCalendario` bit(1) NOT NULL COMMENT '= 0 se il calendario è quello di default =1 per il calendario Eccezioni',
  `DataDal` date DEFAULT NULL COMMENT 'AAAAMMGG Può essere a NULL se il calendario è quello di default',
  `DataAla 5` date DEFAULT NULL COMMENT 'AAAAMMGG Puo'' essere a NULL se il calendario e'' quello di default',
  `LunApertura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `LunChiusura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `LunApertura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `LunChiusura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `MarApertura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `MarChiusura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `MarApertura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `MarChiusura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `MerApertura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `MerChiusura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `MerApertura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `MerChiusura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `GioApertura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `GioChiusura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `GioApertura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `GioChiusura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `VenApertura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `VenChiusura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `VenApertura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `VenChiusura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `SabApertura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `SabChiusura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `SabApertura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `SabChiusura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `DomApertura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `DomChiusura1` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `DomApertura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  `Dom Chiusura2` varchar(5) COLLATE utf8_bin NOT NULL COMMENT 'Orario in formato HH:MM. Se non presente sarà valorizzato con 00:00',
  PRIMARY KEY (`IdSportello`,`TipoCalendario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='anagrafica SASP - calendario delle aperture degli Sportelli';

-- L’esportazione dei dati non era selezionata.
-- Dump della struttura di tabella PDAUnico.SportelliCap
CREATE TABLE IF NOT EXISTS `SportelliCap` (
  `Regione` varchar(25) COLLATE utf8_bin NOT NULL COMMENT 'Descrizione della regione del CAP',
  `Sigla_PV` varchar(2) COLLATE utf8_bin NOT NULL COMMENT 'Sigla provincia del CAP ',
  `Provincia` varchar(25) COLLATE utf8_bin NOT NULL COMMENT 'Descrizione della provincia del CAP',
  `Cod_Comune` varchar(8) COLLATE utf8_bin NOT NULL COMMENT 'Codice Istat del Comune del CAP',
  `Comune` varchar(250) COLLATE utf8_bin NOT NULL COMMENT 'Descrizione del comune del CAP',
  `Localita` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT 'Descrizione della località del CAP',
  `CAP` varchar(5) COLLATE utf8_bin NOT NULL,
  `ID_Servizio` int(11) NOT NULL COMMENT 'Identificativo del servizio (SDA)',
  `Descrizione_Servizio` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'Descrizione del servizio (Inesito)',
  `Frazionario` varchar(10) COLLATE utf8_bin NOT NULL COMMENT 'Frazionario dello Sportello di Inesito o Up con servizio di inesito',
  PRIMARY KEY (`CAP`,`ID_Servizio`,`Frazionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='anagrafica proveniente da SASP';

-- L’esportazione dei dati non era selezionata.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
