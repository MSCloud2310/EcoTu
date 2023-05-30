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


-- Dumping database structure for authuser
CREATE DATABASE IF NOT EXISTS `authuser` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `authuser`;

-- Dumping structure for table authuser.client
CREATE TABLE IF NOT EXISTS `client` (
  `id_client` int(11) NOT NULL,
  `profilephoto` varchar(150) NOT NULL DEFAULT '',
  `password` varchar(150) NOT NULL DEFAULT '',
  `username` varchar(150) NOT NULL DEFAULT '',
  `name` varchar(150) NOT NULL,
  `age` int(11) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_client`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table authuser.client: ~3 rows (approximately)
DELETE FROM `client`;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` (`id_client`, `profilephoto`, `password`, `username`, `name`, `age`, `description`) VALUES
	(1, 'https://cdn-7.motorsport.com/images/mgl/Yv854VL0/s800/charles-leclerc-ferrari-1.jpg', '123', 'lecharles', ' Charles Leclerc', 25, NULL),
	(2, 'https://cdn-3.motorsport.com/images/mgl/YKEZkBr0/s800/carlos-sainz-ferrari-1.jpg', '123', 'carlitos', 'Carlos Sainz Jr.', 28, NULL),
	(3, 'https://cdn-7.motorsport.com/images/mgl/0mb95oa2/s800/lewis-hamilton-mercedes-1.jpg', '123', 'Hami', 'Lewis Hamilton', 38, NULL),
	(4, 'https://cdns-images.dzcdn.net/images/artist/f21443a563e5d03ddf83ed1e6a12d581/500x500.jpg', '123', 'tuconejitomalo', 'Bad Bunny', 38, NULL),
	(98, 'https://cdns-images.dzcdn.net/images/artist/f21443a563e5d03ddf83ed1e6a12d581/500x500.jpg', '$2a$10$w1S1vL6cO6jt397mWG8DNedMFyeNS1tVKi0WjYchvMOdsNiIna.C.', 'spiderman', 'Peter Parker', 28, NULL);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;

-- Dumping structure for table authuser.supplier
CREATE TABLE IF NOT EXISTS `supplier` (
  `id_supplier` int(11) NOT NULL,
  `socialmedia` varchar(150) NOT NULL,
  `webpage` varchar(150) NOT NULL,
  `phonenumber` varchar(150) NOT NULL,
  `name` varchar(150) NOT NULL,
  `age` int(11) NOT NULL,
  `profilephoto` varchar(150) NOT NULL,
  `password` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_supplier`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Dumping data for table authuser.supplier: ~0 rows (approximately)
DELETE FROM `supplier`;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` (`id_supplier`, `socialmedia`, `webpage`, `phonenumber`, `name`, `age`, `profilephoto`, `password`, `username`, `description`) VALUES
	(1, 'javeturismo', 'https://www.javeturismo.com/', '3159284432', 'javeturismo', 10, 'https://www.javeturismo.com/version/2605/assets/javeturismo_assets/img/custom/javeturismo-logo.svg', '1234', 'javeturismo', NULL),
	(2, 'aviaT', 'https://www.aviatur.com/', '38484', 'aviatur', 11, 'link', '1234', 'aviatur', NULL),
	(3, 'meroviaje', 'https://www.quetrip.com/', '3159284432', 'viajaYa', 2, 'https://www.show.news/__export/1581788643778/sites/debate/img/2020/02/15/calamardo_crop1581788591155.jpg_554688468.jpg', '1234', 'meroTrip', NULL);
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
