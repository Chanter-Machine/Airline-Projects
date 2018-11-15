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
  `cityId` int(11) NOT NULL AUTO_INCREMENT,
  `cityName` varchar(25) DEFAULT NULL,
  `airportCode` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`cityId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `city` */

insert  into `city`(`cityId`,`cityName`,`airportCode`) values (1,'Dublin',NULL),(2,'NewYork',NULL),(3,'Paris',NULL),(4,'London',NULL),(5,'Mosco',NULL);

/*Table structure for table `flight` */

DROP TABLE IF EXISTS `flight`;

CREATE TABLE `flight` (
  `flightId` int(11) NOT NULL AUTO_INCREMENT,
  `ori` int(11) DEFAULT NULL,
  `dst` int(11) DEFAULT NULL,
  `planeId` int(11) DEFAULT NULL,
  `takeOffTIme` time DEFAULT NULL,
  `arriveTIme` time DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`flightId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `flight` */

insert  into `flight`(`flightId`,`ori`,`dst`,`planeId`,`takeOffTIme`,`arriveTIme`,`price`) values (1,2,1,1,'00:00:00','03:00:00',100),(2,3,2,NULL,'16:00:00','23:00:00',100),(3,3,1,NULL,'19:00:00','20:00:00',100),(4,5,4,NULL,'13:00:00','17:00:00',100),(5,4,2,NULL,'07:00:00','09:00:00',100),(6,2,4,NULL,'01:00:00','03:00:00',100),(7,5,1,NULL,'09:00:00','16:00:00',100);

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

/*Table structure for table `flightrecord` */

DROP TABLE IF EXISTS `flightrecord`;

CREATE TABLE `flightrecord` (
  `fligthRecord` int(11) NOT NULL AUTO_INCREMENT,
  `flightId` int(11) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`fligthRecord`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='To record whether a flight is canced in a specified day';

/*Data for the table `flightrecord` */

insert  into `flightrecord`(`fligthRecord`,`flightId`,`status`,`date`,`description`) values (1,5,'canceled','2010-02-02','Weather condition');

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `passagerId` int(11) DEFAULT NULL,
  `paymentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  KEY `payment_reference_idx` (`paymentId`),
  KEY `passenger_reference_idx` (`passagerId`),
  CONSTRAINT `passenger_reference` FOREIGN KEY (`passagerId`) REFERENCES `passenger` (`passengerId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `payment_reference` FOREIGN KEY (`paymentId`) REFERENCES `paymentrecord` (`paymentId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

/*Table structure for table `passenger` */

DROP TABLE IF EXISTS `passenger`;

CREATE TABLE `passenger` (
  `passengerId` int(11) NOT NULL AUTO_INCREMENT,
  `passengerName` varchar(25) DEFAULT NULL,
  `address` varchar(25) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phone` varchar(25) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`passengerId`),
  KEY `user_reference_idx` (`userId`),
  CONSTRAINT `user_reference` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `passenger` */

/*Table structure for table `paymentrecord` */

DROP TABLE IF EXISTS `paymentrecord`;

CREATE TABLE `paymentrecord` (
  `paymentId` int(11) NOT NULL AUTO_INCREMENT,
  `amount` varchar(25) DEFAULT NULL,
  `status` varchar(25) DEFAULT NULL,
  `date` date DEFAULT NULL,
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

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(25) DEFAULT NULL,
  `role` varchar(25) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`userId`,`password`,`role`,`email`) values (1,'123456','passenger','123@test.com'),(2,'Test','Passenger','insertUser@Test.com'),(6,'Test','Passenger','insertUser2@Test.com'),(7,'Test','Passenger','insertUser2@Test.com'),(8,'Test','Passenger','insertUser2@Test.com'),(9,'Test','Passenger','insertUser2@Test.com'),(10,'123456','Passenger','test2@Ul.com'),(11,'123456','Passenger','test2@Ul.com'),(12,'123456','Passenger','test2@Ul.com'),(13,'123456','Passenger','test2@Ul.com'),(14,'123456','Passenger','test2@Ul.com'),(15,'123456','Passenger','test2@Ul.com'),(16,'123456','Passenger','test2@Ul.com'),(17,'123456','Passenger','test2@Ul.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
