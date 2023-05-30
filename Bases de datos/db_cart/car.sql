-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.11.2-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for shopping_cart
CREATE DATABASE IF NOT EXISTS `shopping_cart` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `shopping_cart`;

-- Dumping structure for table shopping_cart.shopping_cart
CREATE TABLE IF NOT EXISTS `shopping_cart` (
  `id_shop` int(11) NOT NULL,
  `total` double NOT NULL,
  `id_client` int(11) NOT NULL,
  `pay` double NOT NULL DEFAULT 0,
  PRIMARY KEY (`id_shop`),
  KEY `id_client` (`id_client`),
  CONSTRAINT `shopping_cart_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `authuser`.`client` (`id_client`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table shopping_cart.shopping_cart: ~3 rows (approximately)
DELETE FROM `shopping_cart`;
/*!40000 ALTER TABLE `shopping_cart` DISABLE KEYS */;
INSERT INTO `shopping_cart` (`id_shop`, `total`, `id_client`, `pay`) VALUES
	(1, 0, 1, 0),
	(2, 20, 2, 0),
	(3, 0, 4, 0);
/*!40000 ALTER TABLE `shopping_cart` ENABLE KEYS */;

-- Dumping structure for table shopping_cart.shoppxservice
CREATE TABLE IF NOT EXISTS `shoppxservice` (
  `id_carrito` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `quantiy` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_shoppxservice_shopping_cart` (`id_carrito`) USING BTREE,
  KEY `FK_shoppxservice_service.service` (`id_producto`),
  CONSTRAINT `FK_shoppxservice_service.service` FOREIGN KEY (`id_producto`) REFERENCES `service`.`service` (`id_service`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_shoppxservice_shopping_cart` FOREIGN KEY (`id_carrito`) REFERENCES `shopping_cart` (`id_shop`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table shopping_cart.shoppxservice: ~2 rows (approximately)
DELETE FROM `shoppxservice`;
/*!40000 ALTER TABLE `shoppxservice` DISABLE KEYS */;
INSERT INTO `shoppxservice` (`id_carrito`, `id_producto`, `id`, `quantiy`) VALUES
	(2, 1, 4, 1);
/*!40000 ALTER TABLE `shoppxservice` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
