-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.2.6-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para concurso
DROP DATABASE IF EXISTS `concurso`;
CREATE DATABASE IF NOT EXISTS `concurso` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */;
USE `concurso`;

-- Volcando estructura para tabla concurso.concursante
DROP TABLE IF EXISTS `concursante`;
CREATE TABLE IF NOT EXISTS `concursante` (
  `IdRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `Concursante` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `Edad` int(11) NOT NULL,
  `Pais` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Puntuacion` float NOT NULL,
  PRIMARY KEY (`IdRegistro`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- Volcando datos para la tabla concurso.concursante: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `concursante` DISABLE KEYS */;
INSERT INTO `concursante` (`IdRegistro`, `Concursante`, `Edad`, `Pais`, `Puntuacion`) VALUES
	(1, 'DAVILA OLIVERO  ANA MARIA', 25, 'PERU', 14.2),
	(2, 'CASANOVA MONTEBLANCO FIORELLA LUCIA', 27, 'ARGENTINA', 13.7),
	(3, 'CHUQUICAHUA ANGASPILCO JOSELITO', 27, 'PERU', 17.1),
	(4, 'PAMIES GARCIA MARIA ANTONIA', 18, 'CHILE', 11.8),
	(5, 'TORRES LEGUA CECILIA ELIZABETH', 30, 'BRASIL', 15.4),
	(6, 'SIGNOL FERNANDEZ ROSA MAGALLE', 29, 'PERU', 16.6),
	(7, 'BALDEON PALOMINO EDGAR ALEX', 22, 'CHILE', 12),
	(8, 'MENDIETA ALVA MIGUEL ANGEL', 21, 'ARGENTINA', 17.4),
	(9, 'ROJAS CASTRO  CESAR', 29, 'EEUU', 16.6),
	(10, 'MAYORGA DE LA PUENTE  INGRID', 28, 'CANADA', 18.85),
	(11, 'MORENO AMPUERO PEDRO DARIO', 32, 'ECUADOR', 17.65),
	(12, 'ACOSTA CRUZADO NELIDA', 30, 'BRASIL', 19.9),
	(13, 'ARRARTE MELENDEZ HERWIN DAVID', 23, 'CANADA', 12.9),
	(14, 'PAREDES ANCHANTE DAVID ANTONY', 26, 'EEUU', 10.4);
/*!40000 ALTER TABLE `concursante` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
