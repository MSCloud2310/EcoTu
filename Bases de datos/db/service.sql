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


-- Dumping database structure for service
CREATE DATABASE IF NOT EXISTS `service` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `service`;

-- Dumping structure for table service.entertainment
CREATE TABLE IF NOT EXISTS `entertainment` (
  `id_enter` int(11) NOT NULL,
  `enter_type` varchar(150) NOT NULL,
  `time_arrival` varchar(50) NOT NULL,
  `time_departure` varchar(50) NOT NULL,
  `restriction` varchar(200) NOT NULL,
  `id_service` int(11) NOT NULL,
  PRIMARY KEY (`id_enter`),
  KEY `id_service` (`id_service`),
  CONSTRAINT `entertainment_ibfk_1` FOREIGN KEY (`id_service`) REFERENCES `service` (`id_service`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table service.entertainment: ~2 rows (approximately)
DELETE FROM `entertainment`;
/*!40000 ALTER TABLE `entertainment` DISABLE KEYS */;
INSERT INTO `entertainment` (`id_enter`, `enter_type`, `time_arrival`, `time_departure`, `restriction`, `id_service`) VALUES
	(1, 'Deportivo', '800', '700', 'llevar ropa comoda', 5),
	(2, 'Escalda', '8:00', '10:00', 'no tener problema en rodillas', 5);
/*!40000 ALTER TABLE `entertainment` ENABLE KEYS */;

-- Dumping structure for table service.food
CREATE TABLE IF NOT EXISTS `food` (
  `id_food` int(11) NOT NULL,
  `place_type` varchar(50) NOT NULL,
  `diet_type` varchar(50) NOT NULL,
  `food_type` varchar(50) NOT NULL,
  `id_service` int(11) NOT NULL,
  PRIMARY KEY (`id_food`),
  KEY `id_service` (`id_service`),
  CONSTRAINT `food_ibfk_1` FOREIGN KEY (`id_service`) REFERENCES `service` (`id_service`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table service.food: ~3 rows (approximately)
DELETE FROM `food`;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;
INSERT INTO `food` (`id_food`, `place_type`, `diet_type`, `food_type`, `id_service`) VALUES
	(1, 'Puesto comida', 'Todo', 'Rapida', 1),
	(2, 'Restaurante', 'Todo', 'Colombiana', 2),
	(4, 'Restaurante', 'No veganos', 'Rapida', 8);
/*!40000 ALTER TABLE `food` ENABLE KEYS */;

-- Dumping structure for table service.logdment
CREATE TABLE IF NOT EXISTS `logdment` (
  `id_logdment` int(11) NOT NULL,
  `logdment_type` varchar(150) NOT NULL DEFAULT '',
  `room_type` varchar(150) DEFAULT '',
  `id_service` int(11) NOT NULL,
  PRIMARY KEY (`id_logdment`),
  KEY `id_service` (`id_service`),
  CONSTRAINT `logdment_ibfk_1` FOREIGN KEY (`id_service`) REFERENCES `service` (`id_service`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table service.logdment: ~2 rows (approximately)
DELETE FROM `logdment`;
/*!40000 ALTER TABLE `logdment` DISABLE KEYS */;
INSERT INTO `logdment` (`id_logdment`, `logdment_type`, `room_type`, `id_service`) VALUES
	(1, 'Hotel', 'Suite', 4),
	(2, 'Hotel', 'Suite', 10);
/*!40000 ALTER TABLE `logdment` ENABLE KEYS */;

-- Dumping structure for table service.service
CREATE TABLE IF NOT EXISTS `service` (
  `id_service` int(11) NOT NULL,
  `availability` int(11) NOT NULL,
  `category` varchar(150) NOT NULL,
  `name` varchar(150) NOT NULL,
  `photo_url` varchar(150) NOT NULL,
  `price` float NOT NULL DEFAULT 0,
  `duration` varchar(50) NOT NULL DEFAULT '0',
  `id_supplier` int(11) NOT NULL,
  `country` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_service`),
  KEY `id_supplier` (`id_supplier`),
  CONSTRAINT `service_ibfk_1` FOREIGN KEY (`id_supplier`) REFERENCES `authuser`.`supplier` (`id_supplier`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table service.service: ~7 rows (approximately)
DELETE FROM `service`;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` (`id_service`, `availability`, `category`, `name`, `photo_url`, `price`, `duration`, `id_supplier`, `country`) VALUES
	(1, 20, 'Food', 'Hamburguer', 'https://thumbs.dreamstime.com/b/comida-de-la-hamburguesa-5260101.jpg', 20, '2 horas', 1, 'Colombia'),
	(2, 3, 'Food', 'Chicken', 'https://www.diariodecuyo.com.ar/export/sites/diariodecuyo/img/2017/03/30/comida.jpg_97748352.jpg', 21, '45 min', 1, 'France'),
	(3, 1, 'Transport', 'Taxi rapido', 'https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Lightning_McQueen_%2834615708803%29.jpg/1200px-Lightning_McQueen_%2834615708803%29.jpg', 1, '2 horas', 2, 'Canada'),
	(4, 2, 'Logdment', 'Hotel Playa', 'https://www.elmueble.com/medio/2022/11/06/dormitorio-rustico-con-vigas-de-madera-y-pared-de-madera-00557319_00000000_22116180616_900x900.jpg', 0, '7 dias', 2, 'Canada'),
	(5, 1, 'Entertainment', 'caminata', 'https://oab.ambientebogota.gov.co/wp-content/uploads/2022/02/Foto-5-1024x682.jpeg', 12, '3 horas', 1, 'Spain'),
	(8, 4, 'Food', 'Hamburguer', 'https://thumbs.dreamstime.com/b/comida-de-la-hamburguesa-5260101.jpg', 15, '1 horas', 2, 'Colombia'),
	(10, 4, 'Logdment', 'Monserrate', 'https://upload.wikimedia.org/wikipedia/commons/7/7d/Monserrate_Sanctuary.JPG', 150, '1 semana', 1, 'Spain');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;

-- Dumping structure for table service.transport
CREATE TABLE IF NOT EXISTS `transport` (
  `id_transport` int(11) NOT NULL,
  `vehicule_type` varchar(50) NOT NULL,
  `path_name` varchar(50) NOT NULL,
  `time_arrival` varchar(50) NOT NULL,
  `time_departure` varchar(50) NOT NULL,
  `id_service` int(11) NOT NULL,
  PRIMARY KEY (`id_transport`),
  KEY `id_service` (`id_service`),
  CONSTRAINT `transport_ibfk_1` FOREIGN KEY (`id_service`) REFERENCES `service` (`id_service`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table service.transport: ~1 rows (approximately)
DELETE FROM `transport`;
/*!40000 ALTER TABLE `transport` DISABLE KEYS */;
INSERT INTO `transport` (`id_transport`, `vehicule_type`, `path_name`, `time_arrival`, `time_departure`, `id_service`) VALUES
	(1, 'Taxi', 'Av Dorado', '8:00', '8:40', 3);
/*!40000 ALTER TABLE `transport` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
