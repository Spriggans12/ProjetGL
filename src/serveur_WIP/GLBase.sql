-- MySQL dump 10.13  Distrib 5.5.32, for Linux (x86_64)
--
-- Host: localhost    Database: GL
-- ------------------------------------------------------
-- Server version	5.5.32-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Events`
--

DROP TABLE IF EXISTS `Events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Events` (
  `City` varchar(128) NOT NULL DEFAULT '',
  `Name` varchar(128) DEFAULT NULL,
  `Start` bigint(20) DEFAULT NULL,
  `End` bigint(20) DEFAULT NULL,
  `Place` varchar(128) DEFAULT NULL,
  `Time` bigint(20) DEFAULT NULL,
  `StartLongitude` double DEFAULT NULL,
  `StartLatitude` double DEFAULT NULL,
  `Length` double DEFAULT NULL,
  `Information` text,
  PRIMARY KEY (`City`),
  KEY `Name` (`Name`),
  KEY `Start` (`Start`),
  KEY `End` (`End`),
  KEY `Place` (`Place`),
  KEY `Time` (`Time`),
  KEY `StartLongitude` (`StartLongitude`),
  KEY `StartLatitude` (`StartLatitude`),
  KEY `Length` (`Length`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Events`
--

LOCK TABLES `Events` WRITE;
/*!40000 ALTER TABLE `Events` DISABLE KEYS */;
/*!40000 ALTER TABLE `Events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Partners`
--

DROP TABLE IF EXISTS `Partners`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Partners` (
  `URL` varchar(128) NOT NULL DEFAULT '',
  `ImageURL` varchar(128) DEFAULT NULL,
  `Name` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`URL`),
  KEY `ImageURL` (`ImageURL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Partners`
--

LOCK TABLES `Partners` WRITE;
/*!40000 ALTER TABLE `Partners` DISABLE KEYS */;
/*!40000 ALTER TABLE `Partners` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Runners`
--

DROP TABLE IF EXISTS `Runners`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Runners` (
  `Phone` varchar(128) NOT NULL DEFAULT '',
  `Mail` varchar(128) DEFAULT NULL,
  `PassHash` varchar(128) DEFAULT NULL,
  `LastName` varchar(128) DEFAULT NULL,
  `FirstName` varchar(128) DEFAULT NULL,
  `ImageURL` varchar(128) DEFAULT NULL,
  `City` varchar(128) DEFAULT NULL,
  `InscriptionCity` varchar(128) DEFAULT NULL,
  `Length` double DEFAULT '0',
  `Organize` varchar(128) DEFAULT NULL,
  `BlackListed` smallint(6) DEFAULT '0',
  PRIMARY KEY (`Phone`),
  KEY `Mail` (`Mail`),
  KEY `PassHash` (`PassHash`),
  KEY `LastName` (`LastName`),
  KEY `FirstName` (`FirstName`),
  KEY `BlackListed` (`BlackListed`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Runners`
--

LOCK TABLES `Runners` WRITE;
/*!40000 ALTER TABLE `Runners` DISABLE KEYS */;
/*!40000 ALTER TABLE `Runners` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-03-02 21:14:16
