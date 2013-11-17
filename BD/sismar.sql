-- MySQL dump 10.13  Distrib 5.6.10, for Win64 (x86_64)
--
-- Host: localhost    Database: sismar
-- ------------------------------------------------------
-- Server version	5.6.10

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
-- Table structure for table `bitacora`
--

DROP TABLE IF EXISTS `bitacora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bitacora` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `entrada` text NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `personal_numero` varchar(8) DEFAULT NULL,
  `cliente_numero` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_bitacora_personal1_idx` (`personal_numero`),
  KEY `fk_bitacora_cliente1_idx` (`cliente_numero`),
  CONSTRAINT `fk_bitacora_cliente1` FOREIGN KEY (`cliente_numero`) REFERENCES `cliente` (`numero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_bitacora_personal1` FOREIGN KEY (`personal_numero`) REFERENCES `personal` (`numero`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bitacora`
--

LOCK TABLES `bitacora` WRITE;
/*!40000 ALTER TABLE `bitacora` DISABLE KEYS */;
/*!40000 ALTER TABLE `bitacora` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `numero` varchar(8) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `paterno` varchar(50) NOT NULL,
  `materno` varchar(50) NOT NULL,
  `fechaRegistro` date NOT NULL,
  `correo` varchar(100) NOT NULL,
  `direccion` text,
  `telefono` varchar(50) DEFAULT NULL,
  `numTarjeta` varchar(16) DEFAULT 'xxxxxxxxxxxxxxxx',
  `codSegTarjeta` varchar(3) DEFAULT '000',
  `tipoTarjeta` varchar(10) DEFAULT 'debito',
  `password` varchar(45) DEFAULT 'temporal',
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('12345678','nuevo','nuevo','nuevo','1012-01-01','nuevo','nuevo','12345','nuevo','111','deb','98765');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comanda`
--

DROP TABLE IF EXISTS `comanda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comanda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `horaSolicitud` time NOT NULL,
  `horaEntrega` time DEFAULT NULL,
  `fecha` date NOT NULL,
  `cuenta_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `anotaciones` text,
  PRIMARY KEY (`id`),
  KEY `fk_comanda_cuenta1_idx` (`cuenta_id`),
  KEY `item_id` (`item_id`),
  CONSTRAINT `comanda_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`),
  CONSTRAINT `fk_comanda_cuenta1` FOREIGN KEY (`cuenta_id`) REFERENCES `cuenta` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comanda`
--

LOCK TABLES `comanda` WRITE;
/*!40000 ALTER TABLE `comanda` DISABLE KEYS */;
/*!40000 ALTER TABLE `comanda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuenta`
--

DROP TABLE IF EXISTS `cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuenta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `comentarios` varchar(200) DEFAULT NULL,
  `total` decimal(10,0) DEFAULT NULL,
  `formaPago` varchar(45) NOT NULL DEFAULT 'efectivo',
  `cliente_numero` varchar(8) DEFAULT NULL,
  `mesa_id` int(11) NOT NULL,
  `hora` time DEFAULT NULL,
  `estado` varchar(50) DEFAULT 'creada',
  PRIMARY KEY (`id`),
  KEY `fk_cuenta_cliente1_idx` (`cliente_numero`),
  KEY `fk_cuenta_mesa1_idx` (`mesa_id`),
  CONSTRAINT `cuenta_ibfk_1` FOREIGN KEY (`cliente_numero`) REFERENCES `cliente` (`numero`),
  CONSTRAINT `cuenta_ibfk_2` FOREIGN KEY (`mesa_id`) REFERENCES `mesa` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuenta`
--

LOCK TABLES `cuenta` WRITE;
/*!40000 ALTER TABLE `cuenta` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuenta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `costo` decimal(10,0) NOT NULL,
  `tipoItem_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tipoItem_id` (`tipoItem_id`),
  CONSTRAINT `item_ibfk_1` FOREIGN KEY (`tipoItem_id`) REFERENCES `tipoitem` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itemsbase`
--

DROP TABLE IF EXISTS `itemsbase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `itemsbase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) NOT NULL,
  `promocion_id` varchar(5) NOT NULL,
  `item_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_itemsBase_promocion1_idx` (`promocion_id`),
  KEY `item_id` (`item_id`),
  CONSTRAINT `fk_itemsBase_promocion1` FOREIGN KEY (`promocion_id`) REFERENCES `promocion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `itemsbase_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itemsbase`
--

LOCK TABLES `itemsbase` WRITE;
/*!40000 ALTER TABLE `itemsbase` DISABLE KEYS */;
/*!40000 ALTER TABLE `itemsbase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `fechaAlta` date NOT NULL,
  `fechaActualizacion` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mesa`
--

DROP TABLE IF EXISTS `mesa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mesa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `personal_numero` varchar(8) DEFAULT NULL,
  `estado` varchar(45) DEFAULT 'disponible',
  `personas` int(11) DEFAULT '0',
  `comentarios` text,
  PRIMARY KEY (`id`),
  KEY `personal_numero` (`personal_numero`),
  CONSTRAINT `mesa_ibfk_1` FOREIGN KEY (`personal_numero`) REFERENCES `personal` (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mesa`
--

LOCK TABLES `mesa` WRITE;
/*!40000 ALTER TABLE `mesa` DISABLE KEYS */;
/*!40000 ALTER TABLE `mesa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `negocio`
--

DROP TABLE IF EXISTS `negocio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `negocio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `direccion` text NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `cuentaBancaria` varchar(10) NOT NULL,
  `rfc` varchar(13) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `negocio`
--

LOCK TABLES `negocio` WRITE;
/*!40000 ALTER TABLE `negocio` DISABLE KEYS */;
/*!40000 ALTER TABLE `negocio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notas`
--

DROP TABLE IF EXISTS `notas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `entrada` text NOT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `personal_numero` varchar(8) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_notas_personal1_idx` (`personal_numero`),
  CONSTRAINT `fk_notas_personal1` FOREIGN KEY (`personal_numero`) REFERENCES `personal` (`numero`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notas`
--

LOCK TABLES `notas` WRITE;
/*!40000 ALTER TABLE `notas` DISABLE KEYS */;
/*!40000 ALTER TABLE `notas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personal`
--

DROP TABLE IF EXISTS `personal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personal` (
  `numero` varchar(8) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `paterno` varchar(50) NOT NULL,
  `materno` varchar(50) NOT NULL,
  `estatus` varchar(45) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `fechaAlta` date NOT NULL,
  `curp` varchar(18) DEFAULT 'xxxxxxxxxxxxxxxxxx',
  `direccion` text,
  `telefono` varchar(20) DEFAULT NULL,
  `fechaBaja` date DEFAULT NULL,
  `comentarios` text,
  `tipoPersonal_id` int(11) NOT NULL,
  `password` varchar(45) NOT NULL DEFAULT 'temporal',
  PRIMARY KEY (`numero`),
  KEY `fk_personal_tipoPersonal1_idx` (`tipoPersonal_id`),
  CONSTRAINT `fk_personal_tipoPersonal1` FOREIGN KEY (`tipoPersonal_id`) REFERENCES `tipopersonal` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal`
--

LOCK TABLES `personal` WRITE;
/*!40000 ALTER TABLE `personal` DISABLE KEYS */;
INSERT INTO `personal` VALUES ('12345678','jose','mendoza','azanza','empleado','micorreo','2012-11-11','lkjh','casona 19','87','2012-12-12','coment',1,'pass');
/*!40000 ALTER TABLE `personal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promocion`
--

DROP TABLE IF EXISTS `promocion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `promocion` (
  `id` varchar(5) NOT NULL,
  `naturalezaDescuento` varchar(20) NOT NULL,
  `tipoDescuento` varchar(20) DEFAULT NULL,
  `descuento` decimal(10,0) NOT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `fechaAlta` date NOT NULL,
  `fechaBaja` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promocion`
--

LOCK TABLES `promocion` WRITE;
/*!40000 ALTER TABLE `promocion` DISABLE KEYS */;
/*!40000 ALTER TABLE `promocion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relitemmenu`
--

DROP TABLE IF EXISTS `relitemmenu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relitemmenu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_relItemMenu_menu1_idx` (`menu_id`),
  KEY `fk_relItemMenu_item1_idx` (`item_id`),
  CONSTRAINT `fk_relItemMenu_item1` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_relItemMenu_menu1` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relitemmenu`
--

LOCK TABLES `relitemmenu` WRITE;
/*!40000 ALTER TABLE `relitemmenu` DISABLE KEYS */;
/*!40000 ALTER TABLE `relitemmenu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoitem`
--

DROP TABLE IF EXISTS `tipoitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoitem`
--

LOCK TABLES `tipoitem` WRITE;
/*!40000 ALTER TABLE `tipoitem` DISABLE KEYS */;
INSERT INTO `tipoitem` VALUES (1,'bebida'),(2,'postre');
/*!40000 ALTER TABLE `tipoitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipopersonal`
--

DROP TABLE IF EXISTS `tipopersonal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipopersonal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(20) NOT NULL,
  `funciones` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipopersonal`
--

LOCK TABLES `tipopersonal` WRITE;
/*!40000 ALTER TABLE `tipopersonal` DISABLE KEYS */;
INSERT INTO `tipopersonal` VALUES (1,'mesero','debe atender las ordenes de los comenzales'),(2,'hostess','manejar las mesas para asignar a los comenzales la mas adecuada.'),(3,'recursos humanos','manejar el personal de la empresa.'),(4,'operaciones','mantener el orden en la operacione del lugar, revisar que hace falta, agregar notas de pendientes para el negocio.');
/*!40000 ALTER TABLE `tipopersonal` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-11-17 17:50:33
