-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.53-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema demo_news
--

CREATE DATABASE IF NOT EXISTS demo_news;
USE demo_news;

--
-- Definition of table `account`
--

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `account_type_id` varchar(45) NOT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `status` set('Active','InActive') NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

/*!40000 ALTER TABLE `account` DISABLE KEYS */;
/*!40000 ALTER TABLE `account` ENABLE KEYS */;


--
-- Definition of table `account_scheduler`
--

DROP TABLE IF EXISTS `account_scheduler`;
CREATE TABLE `account_scheduler` (
  `account_id` int(10) unsigned NOT NULL,
  `scheduler_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`account_id`,`scheduler_id`),
  KEY `FK_account_scheduler_2` (`scheduler_id`),
  CONSTRAINT `FK_account_scheduler_1` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_account_scheduler_2` FOREIGN KEY (`scheduler_id`) REFERENCES `scheduler` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account_scheduler`
--

/*!40000 ALTER TABLE `account_scheduler` DISABLE KEYS */;
/*!40000 ALTER TABLE `account_scheduler` ENABLE KEYS */;


--
-- Definition of table `account_type`
--

DROP TABLE IF EXISTS `account_type`;
CREATE TABLE `account_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account_type`
--

/*!40000 ALTER TABLE `account_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `account_type` ENABLE KEYS */;


--
-- Definition of table `address`
--

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `address1` varchar(255) NOT NULL,
  `address2` varchar(255) DEFAULT NULL,
  `city` varchar(255) NOT NULL,
  `state` varchar(255) NOT NULL,
  `country` varchar(45) NOT NULL,
  `zip` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `address`
--

/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;


--
-- Definition of table `advertise`
--

DROP TABLE IF EXISTS `advertise`;
CREATE TABLE `advertise` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `create_date` datetime NOT NULL,
  `createdBY` int(10) unsigned NOT NULL,
  `advertise_det_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_advertise_1` (`createdBY`),
  KEY `FK_advertise_2` (`advertise_det_id`),
  CONSTRAINT `FK_advertise_1` FOREIGN KEY (`createdBY`) REFERENCES `advertiser` (`id`),
  CONSTRAINT `FK_advertise_2` FOREIGN KEY (`advertise_det_id`) REFERENCES `advertise_details` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `advertise`
--

/*!40000 ALTER TABLE `advertise` DISABLE KEYS */;
/*!40000 ALTER TABLE `advertise` ENABLE KEYS */;


--
-- Definition of table `advertise_attachment`
--

DROP TABLE IF EXISTS `advertise_attachment`;
CREATE TABLE `advertise_attachment` (
  `advertise_id` int(10) unsigned NOT NULL,
  `attachment_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`advertise_id`,`attachment_id`),
  KEY `FK_advertise_attachment_2` (`attachment_id`),
  CONSTRAINT `FK_advertise_attachment_1` FOREIGN KEY (`advertise_id`) REFERENCES `advertise` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_advertise_attachment_2` FOREIGN KEY (`attachment_id`) REFERENCES `attachment` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `advertise_attachment`
--

/*!40000 ALTER TABLE `advertise_attachment` DISABLE KEYS */;
/*!40000 ALTER TABLE `advertise_attachment` ENABLE KEYS */;


--
-- Definition of table `advertise_details`
--

DROP TABLE IF EXISTS `advertise_details`;
CREATE TABLE `advertise_details` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `short_description` varchar(1000) DEFAULT NULL,
  `description` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `advertise_details`
--

/*!40000 ALTER TABLE `advertise_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `advertise_details` ENABLE KEYS */;


--
-- Definition of table `advertiser`
--

DROP TABLE IF EXISTS `advertiser`;
CREATE TABLE `advertiser` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `status` set('Active','InActive') NOT NULL,
  `frontpage` tinyint(3) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `advertiser`
--

/*!40000 ALTER TABLE `advertiser` DISABLE KEYS */;
/*!40000 ALTER TABLE `advertiser` ENABLE KEYS */;


--
-- Definition of table `advertiser_address`
--

DROP TABLE IF EXISTS `advertiser_address`;
CREATE TABLE `advertiser_address` (
  `advertiser_id` int(10) unsigned NOT NULL,
  `address_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`advertiser_id`,`address_id`),
  KEY `FK_advertiser_address_2` (`address_id`),
  CONSTRAINT `FK_advertiser_address_1` FOREIGN KEY (`advertiser_id`) REFERENCES `advertiser` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_advertiser_address_2` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `advertiser_address`
--

/*!40000 ALTER TABLE `advertiser_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `advertiser_address` ENABLE KEYS */;


--
-- Definition of table `advertiser_contact`
--

DROP TABLE IF EXISTS `advertiser_contact`;
CREATE TABLE `advertiser_contact` (
  `advertiser_id` int(10) unsigned NOT NULL,
  `contact_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`advertiser_id`,`contact_id`),
  KEY `FK_advertiser_contact_2` (`contact_id`),
  CONSTRAINT `FK_advertiser_contact_1` FOREIGN KEY (`advertiser_id`) REFERENCES `advertiser` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_advertiser_contact_2` FOREIGN KEY (`contact_id`) REFERENCES `contact_via` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `advertiser_contact`
--

/*!40000 ALTER TABLE `advertiser_contact` DISABLE KEYS */;
/*!40000 ALTER TABLE `advertiser_contact` ENABLE KEYS */;


--
-- Definition of table `article`
--

DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(10) unsigned NOT NULL,
  `title` varchar(255) NOT NULL,
  `headline` varchar(255) NOT NULL,
  `summary` varchar(1000) DEFAULT NULL,
  `story_id` int(10) unsigned DEFAULT NULL,
  `status` set('Active','InActive') NOT NULL,
  `createdBy` int(11) NOT NULL,
  `privacy_level` set('private','public','group','specific') NOT NULL,
  `priority` int(10) unsigned DEFAULT NULL,
  `frontpage` tinyint(3) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_article_1` (`story_id`),
  CONSTRAINT `FK_article_1` FOREIGN KEY (`story_id`) REFERENCES `article_story` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `article`
--

/*!40000 ALTER TABLE `article` DISABLE KEYS */;
/*!40000 ALTER TABLE `article` ENABLE KEYS */;


--
-- Definition of table `article_attachement`
--

DROP TABLE IF EXISTS `article_attachement`;
CREATE TABLE `article_attachement` (
  `article_id` int(10) unsigned NOT NULL,
  `attachment_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`article_id`,`attachment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `article_attachement`
--

/*!40000 ALTER TABLE `article_attachement` DISABLE KEYS */;
/*!40000 ALTER TABLE `article_attachement` ENABLE KEYS */;


--
-- Definition of table `article_category`
--

DROP TABLE IF EXISTS `article_category`;
CREATE TABLE `article_category` (
  `article_id` int(10) unsigned NOT NULL,
  `category_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`article_id`,`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `article_category`
--

/*!40000 ALTER TABLE `article_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `article_category` ENABLE KEYS */;


--
-- Definition of table `article_keywords`
--

DROP TABLE IF EXISTS `article_keywords`;
CREATE TABLE `article_keywords` (
  `article_id` int(10) unsigned NOT NULL,
  `keyword_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`article_id`,`keyword_id`),
  KEY `FK_article_keywords_1` (`keyword_id`),
  CONSTRAINT `FK_article_keywords_1` FOREIGN KEY (`keyword_id`) REFERENCES `keywords` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_article_keywords_2` FOREIGN KEY (`article_id`) REFERENCES `article` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `article_keywords`
--

/*!40000 ALTER TABLE `article_keywords` DISABLE KEYS */;
/*!40000 ALTER TABLE `article_keywords` ENABLE KEYS */;


--
-- Definition of table `article_reflink`
--

DROP TABLE IF EXISTS `article_reflink`;
CREATE TABLE `article_reflink` (
  `article_id` int(10) unsigned NOT NULL,
  `reference_artId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`article_id`,`reference_artId`),
  KEY `FK_article_reflink_1` (`reference_artId`),
  CONSTRAINT `FK_article_reflink_1` FOREIGN KEY (`reference_artId`) REFERENCES `article` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `article_reflink`
--

/*!40000 ALTER TABLE `article_reflink` DISABLE KEYS */;
/*!40000 ALTER TABLE `article_reflink` ENABLE KEYS */;


--
-- Definition of table `article_section`
--

DROP TABLE IF EXISTS `article_section`;
CREATE TABLE `article_section` (
  `article_id` int(10) unsigned NOT NULL,
  `section_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`article_id`,`section_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `article_section`
--

/*!40000 ALTER TABLE `article_section` DISABLE KEYS */;
/*!40000 ALTER TABLE `article_section` ENABLE KEYS */;


--
-- Definition of table `article_story`
--

DROP TABLE IF EXISTS `article_story`;
CREATE TABLE `article_story` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `story` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `article_story`
--

/*!40000 ALTER TABLE `article_story` DISABLE KEYS */;
/*!40000 ALTER TABLE `article_story` ENABLE KEYS */;


--
-- Definition of table `attachment`
--

DROP TABLE IF EXISTS `attachment`;
CREATE TABLE `attachment` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `filename` varchar(255) NOT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `format_type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attachment`
--

/*!40000 ALTER TABLE `attachment` DISABLE KEYS */;
/*!40000 ALTER TABLE `attachment` ENABLE KEYS */;


--
-- Definition of table `bg_process`
--

DROP TABLE IF EXISTS `bg_process`;
CREATE TABLE `bg_process` (
  `id` int(10) unsigned NOT NULL,
  `type` int(10) unsigned NOT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `input` int(10) unsigned DEFAULT NULL,
  `status` set('pending','success','failure','processing') NOT NULL,
  `comment` varchar(1000) DEFAULT NULL,
  `created_date` datetime NOT NULL,
  `createdBy` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_bg_process_1` (`createdBy`),
  KEY `FK_bg_process_2` (`type`),
  KEY `FK_bg_process_3` (`input`),
  CONSTRAINT `FK_bg_process_1` FOREIGN KEY (`createdBy`) REFERENCES `user` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_bg_process_2` FOREIGN KEY (`type`) REFERENCES `bg_process_type` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_bg_process_3` FOREIGN KEY (`input`) REFERENCES `bg_process_input` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bg_process`
--

/*!40000 ALTER TABLE `bg_process` DISABLE KEYS */;
/*!40000 ALTER TABLE `bg_process` ENABLE KEYS */;


--
-- Definition of table `bg_process_input`
--

DROP TABLE IF EXISTS `bg_process_input`;
CREATE TABLE `bg_process_input` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `input` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bg_process_input`
--

/*!40000 ALTER TABLE `bg_process_input` DISABLE KEYS */;
/*!40000 ALTER TABLE `bg_process_input` ENABLE KEYS */;


--
-- Definition of table `bg_process_scheduler`
--

DROP TABLE IF EXISTS `bg_process_scheduler`;
CREATE TABLE `bg_process_scheduler` (
  `bg_process_id` int(10) unsigned NOT NULL,
  `scheduler_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`bg_process_id`,`scheduler_id`),
  KEY `FK_bg_process_scheduler_2` (`scheduler_id`),
  CONSTRAINT `FK_bg_process_scheduler_1` FOREIGN KEY (`bg_process_id`) REFERENCES `bg_process` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_bg_process_scheduler_2` FOREIGN KEY (`scheduler_id`) REFERENCES `scheduler` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bg_process_scheduler`
--

/*!40000 ALTER TABLE `bg_process_scheduler` DISABLE KEYS */;
/*!40000 ALTER TABLE `bg_process_scheduler` ENABLE KEYS */;


--
-- Definition of table `bg_process_type`
--

DROP TABLE IF EXISTS `bg_process_type`;
CREATE TABLE `bg_process_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bg_process_type`
--

/*!40000 ALTER TABLE `bg_process_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `bg_process_type` ENABLE KEYS */;


--
-- Definition of table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `parent_id` int(10) unsigned NOT NULL,
  `privacy_level` set('private','public','group','specific') NOT NULL,
  `status` set('Active','InActive') NOT NULL,
  `priority` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_category_1` (`parent_id`),
  CONSTRAINT `FK_category_1` FOREIGN KEY (`parent_id`) REFERENCES `category` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;


--
-- Definition of table `contact_via`
--

DROP TABLE IF EXISTS `contact_via`;
CREATE TABLE `contact_via` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `number` varchar(255) NOT NULL,
  `type` set('phone','mobile','fax') NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact_via`
--

/*!40000 ALTER TABLE `contact_via` DISABLE KEYS */;
/*!40000 ALTER TABLE `contact_via` ENABLE KEYS */;


--
-- Definition of table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

/*!40000 ALTER TABLE `department` DISABLE KEYS */;
/*!40000 ALTER TABLE `department` ENABLE KEYS */;


--
-- Definition of table `emp_dpt`
--

DROP TABLE IF EXISTS `emp_dpt`;
CREATE TABLE `emp_dpt` (
  `emp_id` int(10) unsigned NOT NULL,
  `dpt_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`emp_id`,`dpt_id`),
  KEY `FK_emp_dpt_2` (`dpt_id`),
  CONSTRAINT `FK_emp_dpt_1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_emp_dpt_2` FOREIGN KEY (`dpt_id`) REFERENCES `department` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp_dpt`
--

/*!40000 ALTER TABLE `emp_dpt` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp_dpt` ENABLE KEYS */;


--
-- Definition of table `emp_roles`
--

DROP TABLE IF EXISTS `emp_roles`;
CREATE TABLE `emp_roles` (
  `emp_id` int(10) unsigned NOT NULL,
  `role_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`emp_id`,`role_id`),
  KEY `FK_emp_roles_2` (`role_id`),
  CONSTRAINT `FK_emp_roles_1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_emp_roles_2` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp_roles`
--

/*!40000 ALTER TABLE `emp_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp_roles` ENABLE KEYS */;


--
-- Definition of table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `mgr_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_employee_1` FOREIGN KEY (`id`) REFERENCES `employee` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


--
-- Definition of table `entity`
--

DROP TABLE IF EXISTS `entity`;
CREATE TABLE `entity` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `logo` varchar(1000) NOT NULL,
  `support_mailId` varchar(255) DEFAULT NULL,
  `company_mailId` varchar(255) NOT NULL,
  `entity_type_id` int(10) unsigned NOT NULL,
  `status` set('Active','InActive') NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_entity_1` (`entity_type_id`),
  CONSTRAINT `FK_entity_1` FOREIGN KEY (`entity_type_id`) REFERENCES `entity_type` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `entity`
--

/*!40000 ALTER TABLE `entity` DISABLE KEYS */;
/*!40000 ALTER TABLE `entity` ENABLE KEYS */;


--
-- Definition of table `entity_addresses`
--

DROP TABLE IF EXISTS `entity_addresses`;
CREATE TABLE `entity_addresses` (
  `entity_id` int(10) unsigned NOT NULL,
  `address_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`entity_id`,`address_id`),
  KEY `FK_entity_addresses_1` (`address_id`),
  CONSTRAINT `FK_entity_addresses_1` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `FK_entity_addresses_2` FOREIGN KEY (`entity_id`) REFERENCES `entity` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `entity_addresses`
--

/*!40000 ALTER TABLE `entity_addresses` DISABLE KEYS */;
/*!40000 ALTER TABLE `entity_addresses` ENABLE KEYS */;


--
-- Definition of table `entity_type`
--

DROP TABLE IF EXISTS `entity_type`;
CREATE TABLE `entity_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `entity_type`
--

/*!40000 ALTER TABLE `entity_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `entity_type` ENABLE KEYS */;


--
-- Definition of table `keywords`
--

DROP TABLE IF EXISTS `keywords`;
CREATE TABLE `keywords` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `keyword` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `keywords`
--

/*!40000 ALTER TABLE `keywords` DISABLE KEYS */;
/*!40000 ALTER TABLE `keywords` ENABLE KEYS */;


--
-- Definition of table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `role_type_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_role_1` (`role_type_id`),
  CONSTRAINT `FK_role_1` FOREIGN KEY (`role_type_id`) REFERENCES `role_type` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role`
--

/*!40000 ALTER TABLE `role` DISABLE KEYS */;
/*!40000 ALTER TABLE `role` ENABLE KEYS */;


--
-- Definition of table `role_type`
--

DROP TABLE IF EXISTS `role_type`;
CREATE TABLE `role_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role_type`
--

/*!40000 ALTER TABLE `role_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_type` ENABLE KEYS */;


--
-- Definition of table `scheduler`
--

DROP TABLE IF EXISTS `scheduler`;
CREATE TABLE `scheduler` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `type` set('daily','weekly','yearly') DEFAULT NULL,
  `priority` set('HIGH','MEDIUM','LOW') NOT NULL,
  `trigger_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scheduler`
--

/*!40000 ALTER TABLE `scheduler` DISABLE KEYS */;
/*!40000 ALTER TABLE `scheduler` ENABLE KEYS */;


--
-- Definition of table `section`
--

DROP TABLE IF EXISTS `section`;
CREATE TABLE `section` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `status` set('Active','InActive') NOT NULL,
  `parent_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_section_1` FOREIGN KEY (`id`) REFERENCES `section` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `section`
--

/*!40000 ALTER TABLE `section` DISABLE KEYS */;
/*!40000 ALTER TABLE `section` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `alt_email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `user_account`
--

DROP TABLE IF EXISTS `user_account`;
CREATE TABLE `user_account` (
  `user_id` int(10) unsigned NOT NULL,
  `account_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`user_id`,`account_id`),
  KEY `FK_user_account_2` (`account_id`),
  CONSTRAINT `FK_user_account_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_user_account_2` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_account`
--

/*!40000 ALTER TABLE `user_account` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_account` ENABLE KEYS */;


--
-- Definition of table `user_addresses`
--

DROP TABLE IF EXISTS `user_addresses`;
CREATE TABLE `user_addresses` (
  `user_id` int(10) unsigned NOT NULL,
  `address_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`user_id`,`address_id`) USING BTREE,
  KEY `FK_USER_ADDRESSES_2` (`address_id`),
  CONSTRAINT `FK_USER_ADDRESSES_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_USER_ADDRESSES_2` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_addresses`
--

/*!40000 ALTER TABLE `user_addresses` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_addresses` ENABLE KEYS */;


--
-- Definition of table `user_contact`
--

DROP TABLE IF EXISTS `user_contact`;
CREATE TABLE `user_contact` (
  `user_id` int(10) unsigned NOT NULL,
  `contact_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`user_id`,`contact_id`),
  KEY `FK_user_contact_2` (`contact_id`),
  CONSTRAINT `FK_user_contact_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_user_contact_2` FOREIGN KEY (`contact_id`) REFERENCES `contact_via` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_contact`
--

/*!40000 ALTER TABLE `user_contact` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_contact` ENABLE KEYS */;


--
-- Definition of table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE `user_roles` (
  `user_id` int(10) unsigned NOT NULL,
  `role_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`) USING BTREE,
  KEY `FK_ USER_ROLES_1` (`role_id`),
  CONSTRAINT `FK_ USER_ROLES_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE CASCADE,
  CONSTRAINT `FK_ USER_ROLES_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_roles`
--

/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
