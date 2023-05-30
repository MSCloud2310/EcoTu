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


-- Dumping database structure for interactions_opc
CREATE DATABASE IF NOT EXISTS `interactions_opc` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `interactions_opc`;

-- Dumping structure for table interactions_opc.comments
CREATE TABLE IF NOT EXISTS `comments` (
  `id_comment` int(11) NOT NULL,
  `message` varchar(200) NOT NULL,
  `id_client` int(11) NOT NULL,
  `id_service` int(11) NOT NULL,
  PRIMARY KEY (`id_comment`),
  KEY `id_client` (`id_client`),
  KEY `id_service` (`id_service`),
  CONSTRAINT `comments_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `authuser`.`client` (`id_client`),
  CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`id_service`) REFERENCES `service`.`service` (`id_service`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table interactions_opc.comments: ~0 rows (approximately)
DELETE FROM `comments`;
/*!40000 ALTER TABLE `comments` DISABLE KEYS */;
INSERT INTO `comments` (`id_comment`, `message`, `id_client`, `id_service`) VALUES
	(1, 'Bacano', 3, 4);
/*!40000 ALTER TABLE `comments` ENABLE KEYS */;

-- Dumping structure for table interactions_opc.question
CREATE TABLE IF NOT EXISTS `question` (
  `id_question` int(11) NOT NULL,
  `question` varchar(150) NOT NULL DEFAULT '',
  `answer` varchar(150) DEFAULT NULL,
  `id_service` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  `id_supplier` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_question`),
  KEY `id_client` (`id_client`),
  KEY `id_supplier` (`id_supplier`),
  KEY `id_service` (`id_service`),
  CONSTRAINT `question_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `authuser`.`client` (`id_client`),
  CONSTRAINT `question_ibfk_2` FOREIGN KEY (`id_client`) REFERENCES `authuser`.`client` (`id_client`),
  CONSTRAINT `question_ibfk_3` FOREIGN KEY (`id_client`) REFERENCES `service`.`service` (`id_service`),
  CONSTRAINT `question_ibfk_4` FOREIGN KEY (`id_supplier`) REFERENCES `authuser`.`supplier` (`id_supplier`),
  CONSTRAINT `question_ibfk_5` FOREIGN KEY (`id_service`) REFERENCES `service`.`service` (`id_service`),
  CONSTRAINT `question_ibfk_6` FOREIGN KEY (`id_service`) REFERENCES `service`.`service` (`id_service`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table interactions_opc.question: ~2 rows (approximately)
DELETE FROM `question`;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` (`id_question`, `question`, `answer`, `id_service`, `id_client`, `id_supplier`) VALUES
	(1, 'hay mariscos?', 'buenas en el restaurante si los hay y muy ricos', 1, 1, 1),
	(2, 'es para todos?', NULL, 1, 2, 1),
	(3, 'Es empinado?', NULL, 5, 2, 1),
	(4, 'hay piscina?', 'no', 4, 3, 2);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;

-- Dumping structure for table interactions_opc.rating
CREATE TABLE IF NOT EXISTS `rating` (
  `id_rating` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  `id_service` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  PRIMARY KEY (`id_rating`),
  KEY `id_client` (`id_client`),
  KEY `id_service` (`id_service`),
  CONSTRAINT `rating_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `authuser`.`client` (`id_client`),
  CONSTRAINT `rating_ibfk_2` FOREIGN KEY (`id_service`) REFERENCES `service`.`service` (`id_service`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table interactions_opc.rating: ~0 rows (approximately)
DELETE FROM `rating`;
/*!40000 ALTER TABLE `rating` DISABLE KEYS */;
INSERT INTO `rating` (`id_rating`, `number`, `id_service`, `id_client`) VALUES
	(1, 4, 4, 3);
/*!40000 ALTER TABLE `rating` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
