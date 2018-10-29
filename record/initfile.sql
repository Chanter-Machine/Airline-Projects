/*
SQLyog v10.2 
MySQL - 5.7.23 : Database - airline
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`airline` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `airline`;

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `cityId` int(11) NOT NULL,
  `cityName` varchar(25) DEFAULT NULL,
  `airportCode` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`cityId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `city` */

/*Table structure for table `flight` */

DROP TABLE IF EXISTS `flight`;

CREATE TABLE `flight` (
  `flightId` int(11) NOT NULL AUTO_INCREMENT,
  `dst` int(11) DEFAULT NULL,
  `ori` int(11) DEFAULT NULL,
  `planeId` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`flightId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `flight` */

/*Table structure for table `flightandorder` */

DROP TABLE IF EXISTS `flightandorder`;

CREATE TABLE `flightandorder` (
  `flightAndOrderId` int(11) NOT NULL AUTO_INCREMENT,
  `flightId` int(11) DEFAULT NULL,
  `orderId` int(11) DEFAULT NULL,
  `seatType` varchar(25) DEFAULT NULL,
  `seatNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`flightAndOrderId`),
  KEY `flight_reference_idx` (`flightId`),
  KEY `order_reference_idx` (`orderId`),
  CONSTRAINT `flight_reference` FOREIGN KEY (`flightId`) REFERENCES `flight` (`flightId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `order_reference` FOREIGN KEY (`orderId`) REFERENCES `order` (`orderId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `flightandorder` */

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `passagerId` int(11) DEFAULT NULL,
  `paymentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  CONSTRAINT `payment_reference` FOREIGN KEY (`orderId`) REFERENCES `paymentrecord` (`paymentId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

/*Table structure for table `passenger` */

DROP TABLE IF EXISTS `passenger`;

CREATE TABLE `passenger` (
  `passengerId` int(11) NOT NULL AUTO_INCREMENT,
  `passengerName` varchar(25) DEFAULT NULL,
  `address` varchar(25) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phone` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`passengerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `passenger` */

/*Table structure for table `paymentrecord` */

DROP TABLE IF EXISTS `paymentrecord`;

CREATE TABLE `paymentrecord` (
  `paymentId` int(11) NOT NULL AUTO_INCREMENT,
  `amount` varchar(25) DEFAULT NULL,
  `status` varchar(25) DEFAULT NULL,
  `data` date DEFAULT NULL,
  PRIMARY KEY (`paymentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paymentrecord` */

/*Table structure for table `plane` */

DROP TABLE IF EXISTS `plane`;

CREATE TABLE `plane` (
  `planeId` int(11) NOT NULL AUTO_INCREMENT,
  `manufacturer` varchar(25) DEFAULT NULL,
  `numOfFirstClass` int(11) DEFAULT NULL,
  `numOfBusinessClass` int(11) DEFAULT NULL,
  `numOfEconomyClass` int(11) DEFAULT NULL,
  PRIMARY KEY (`planeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `plane` */

/*Table structure for table `seatrecord` */

DROP TABLE IF EXISTS `seatrecord`;

CREATE TABLE `seatrecord` (
  `seatRecordId` int(11) NOT NULL AUTO_INCREMENT,
  `flightId` varchar(25) DEFAULT NULL,
  `availFirst` int(11) DEFAULT NULL,
  `availBusiness` int(11) DEFAULT NULL,
  `availEconomyl` int(11) DEFAULT NULL,
  PRIMARY KEY (`seatRecordId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `seatrecord` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
