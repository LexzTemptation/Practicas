-- MySQL dump 10.13  Distrib 8.0.34, for Linux (x86_64)
--
-- Host: localhost    Database: tienda
-- ------------------------------------------------------
-- Server version	8.0.34-0ubuntu0.22.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id_categoria` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Bebidas con gas'),(2,'Aceites'),(3,'Detergentes'),(4,'Galletas'),(5,'Chocolates');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `codigo_barras`
--

DROP TABLE IF EXISTS `codigo_barras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `codigo_barras` (
  `id_codigo_barras` int NOT NULL AUTO_INCREMENT,
  `serial` varchar(45) NOT NULL,
  `id_producto` int NOT NULL,
  PRIMARY KEY (`id_codigo_barras`),
  KEY `id_producto_fk_idx` (`id_producto`),
  CONSTRAINT `id_producto_fk` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `codigo_barras`
--

LOCK TABLES `codigo_barras` WRITE;
/*!40000 ALTER TABLE `codigo_barras` DISABLE KEYS */;
INSERT INTO `codigo_barras` VALUES (1,'7234752',1),(2,'7628935',2),(3,'2689305',3),(4,'265798',4),(5,'265798',5);
/*!40000 ALTER TABLE `codigo_barras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id_producto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `fecha_venta` date DEFAULT NULL,
  `id_categoria` int DEFAULT NULL,
  `cantidad` int DEFAULT NULL,
  PRIMARY KEY (`id_producto`),
  KEY `id_categoria_fk_idx` (`id_categoria`),
  CONSTRAINT `id_categoria_fk` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Coca cola',5.50,'2023-10-08',1,150),(2,'Pepsi',5.20,'2023-10-07',1,100),(3,'Heineken',3.60,'2023-10-08',1,120),(4,'Aceite de oliva',2.70,'2023-10-08',2,110),(5,'Aceite mineral',3.50,'2023-10-08',2,90);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedores` (
  `id_proveedores` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id_proveedores`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (1,'Adriana'),(2,'Marcelo'),(3,'Lexa'),(4,'Francisco'),(5,'Lura');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `union_pp`
--

DROP TABLE IF EXISTS `union_pp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `union_pp` (
  `id_union_pp` int NOT NULL,
  `id_producto` int NOT NULL,
  `id_proveedores` int NOT NULL,
  PRIMARY KEY (`id_union_pp`),
  KEY `fk_id_producto_idx` (`id_producto`),
  KEY `fk_id_proveedores_idx` (`id_proveedores`),
  CONSTRAINT `id_producto` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_proveedores` FOREIGN KEY (`id_proveedores`) REFERENCES `proveedores` (`id_proveedores`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `union_pp`
--

LOCK TABLES `union_pp` WRITE;
/*!40000 ALTER TABLE `union_pp` DISABLE KEYS */;
/*!40000 ALTER TABLE `union_pp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `vista_producto_categoria`
--

DROP TABLE IF EXISTS `vista_producto_categoria`;
/*!50001 DROP VIEW IF EXISTS `vista_producto_categoria`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vista_producto_categoria` AS SELECT 
 1 AS `nombre`,
 1 AS `precio`,
 1 AS `cantidad`,
 1 AS `Categoria`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vista_todas_las_tablas`
--

DROP TABLE IF EXISTS `vista_todas_las_tablas`;
/*!50001 DROP VIEW IF EXISTS `vista_todas_las_tablas`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vista_todas_las_tablas` AS SELECT 
 1 AS `Producto`,
 1 AS `Codigo de barras`,
 1 AS `Categoria`,
 1 AS `Proveedores`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vista_producto_categoria`
--

/*!50001 DROP VIEW IF EXISTS `vista_producto_categoria`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`lexz`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_producto_categoria` AS select `p`.`nombre` AS `nombre`,`p`.`precio` AS `precio`,`p`.`cantidad` AS `cantidad`,`c`.`nombre` AS `Categoria` from (`producto` `p` join `categoria` `c` on((`p`.`id_categoria` = `c`.`id_categoria`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_todas_las_tablas`
--

/*!50001 DROP VIEW IF EXISTS `vista_todas_las_tablas`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`lexz`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_todas_las_tablas` AS select `p`.`nombre` AS `Producto`,`cb`.`serial` AS `Codigo de barras`,`c`.`nombre` AS `Categoria`,`pvv`.`id_proveedores` AS `Proveedores` from ((((`producto` `p` join `codigo_barras` `cb` on((`p`.`id_producto` = `cb`.`id_producto`))) join `categoria` `c` on((`p`.`id_producto` = `c`.`id_categoria`))) join `union_pp` `upp` on((`p`.`id_producto` = `upp`.`id_producto`))) join `proveedores` `pvv` on((`pvv`.`id_proveedores` = `upp`.`id_proveedores`))) where (`p`.`cantidad` > 100) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-08 22:37:15
