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

-- Dump della struttura di tabella PDAUnico.anagsportelli
CREATE TABLE IF NOT EXISTS `anagsportelli` (
  `idsportello` int(11) NOT NULL,
  `tipologiafamigliasportello` varchar(50) COLLATE utf8_bin NOT NULL COMMENT 'Es. Ufficio Postale, Casa Comunale, Sportello di Cortesia',
  `al_country` varchar(25) COLLATE utf8_bin NOT NULL,
  `ram_filiale` varchar(25) COLLATE utf8_bin NOT NULL,
  `frazionario` varchar(10) COLLATE utf8_bin NOT NULL,
  `denominazione` varchar(100) COLLATE utf8_bin NOT NULL,
  `caso` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT 'Es. caso 1, caso 2',
  `ubicazione` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT 'Descrizione Caso',
  `indirizzo` varchar(255) COLLATE utf8_bin NOT NULL COMMENT 'Indirizzo (del servizio)',
  `noteindirizzo` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `idcivico` int(11) DEFAULT NULL,
  `idtoponimo` int(11) DEFAULT NULL,
  `cap` varchar(5) COLLATE utf8_bin NOT NULL,
  `comune` varchar(100) COLLATE utf8_bin NOT NULL,
  `localita` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `siglaprovincia` varchar(2) COLLATE utf8_bin NOT NULL,
  `descrizioneprovincia` varchar(100) COLLATE utf8_bin NOT NULL,
  `coordinate_x_gradi` varchar(18) COLLATE utf8_bin DEFAULT NULL COMMENT 'Es. 14,7240902967',
  `coordinate_y_gradi` varchar(18) COLLATE utf8_bin DEFAULT NULL COMMENT 'Es. 36,9182283406',
  `coordinate_x_metri` varchar(18) COLLATE utf8_bin DEFAULT NULL COMMENT 'Es. 1010089,5028882160',
  PRIMARY KEY (`idsportello`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='anagrafica proveniente da SASP';

-- L’esportazione dei dati non era selezionata.
-- Dump della struttura di tabella PDAUnico.sportellicap
CREATE TABLE IF NOT EXISTS `sportellicap` (
  `regione` varchar(25) COLLATE utf8_bin NOT NULL COMMENT 'Descrizione della regione del CAP',
  `sigla_pv` varchar(2) COLLATE utf8_bin NOT NULL COMMENT 'Sigla provincia del CAP ',
  `provincia` varchar(25) COLLATE utf8_bin NOT NULL COMMENT 'Descrizione della provincia del CAP',
  `cod_comune` varchar(8) COLLATE utf8_bin NOT NULL COMMENT 'Codice Istat del Comune del CAP',
  `comune` varchar(250) COLLATE utf8_bin NOT NULL COMMENT 'Descrizione del comune del CAP',
  `localita` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT 'Descrizione della località del CAP',
  `cap` varchar(5) COLLATE utf8_bin NOT NULL,
  `id_servizio` int(11) NOT NULL COMMENT 'Identificativo del servizio (SDA)',
  `descrizione_servizio` varchar(100) COLLATE utf8_bin NOT NULL COMMENT 'Descrizione del servizio (Inesito)',
  `frazionario` varchar(10) COLLATE utf8_bin NOT NULL COMMENT 'Frazionario dello Sportello di Inesito o Up con servizio di inesito',
  PRIMARY KEY (`cap`,`id_servizio`,`frazionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='anagrafica proveniente da SASP';

-- L’esportazione dei dati non era selezionata.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
