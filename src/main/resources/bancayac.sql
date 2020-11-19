CREATE DATABASE  IF NOT EXISTS `bankayc` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `bankayc`;
-- MySQL dump 10.13  Distrib 5.7.30, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: bankayc
-- ------------------------------------------------------
-- Server version	5.7.23

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
-- Table structure for table `requests`
--

DROP TABLE IF EXISTS `requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `requests` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `method_called` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `origin_ip` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `request_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requests`
--

LOCK TABLES `requests` WRITE;
/*!40000 ALTER TABLE `requests` DISABLE KEYS */;
INSERT INTO `requests` VALUES (1,'/getAbilities','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(2,'/id','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(3,'/getBaseExperience','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(4,'/getHeldItems','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(5,'/getName','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(6,'/getLocationAreaEncounters','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(7,'/getAbilities','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(8,'/getAbilities','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(9,'/getAbilities','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(10,'/id','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(11,'/getBaseExperience','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(12,'/getHeldItems','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(13,'/getName','armando-Inspiron-5558/127.0.1.1','2020-11-18'),(14,'/getLocationAreaEncounters','armando-Inspiron-5558/127.0.1.1','2020-11-18');
/*!40000 ALTER TABLE `requests` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-18 20:40:11
