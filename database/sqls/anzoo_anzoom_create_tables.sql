-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: 
-- ------------------------------------------------------
-- Server version	5.7.20-0ubuntu0.16.04.1

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
-- Current Database: `anzoo_anzoom`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `anzoo_anzoom` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `anzoo_anzoom`;

--
-- Table structure for table `anju_tags`
--

DROP TABLE IF EXISTS `anju_tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anju_tags` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tag` varchar(256) CHARACTER SET utf8 NOT NULL,
  `tag_count` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `anju_tags_tag_uindex` (`tag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anju_tags`
--

LOCK TABLES `anju_tags` WRITE;
/*!40000 ALTER TABLE `anju_tags` DISABLE KEYS */;
/*!40000 ALTER TABLE `anju_tags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comments`
--

DROP TABLE IF EXISTS `comments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `post_id` int(11) NOT NULL,
  `content` text CHARACTER SET utf8 NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `comments_users_id_fk` (`user_id`),
  KEY `comments_posts_id_fk` (`post_id`),
  CONSTRAINT `comments_posts_id_fk` FOREIGN KEY (`post_id`) REFERENCES `posts` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `comments_users_id_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comments`
--

LOCK TABLES `comments` WRITE;
/*!40000 ALTER TABLE `comments` DISABLE KEYS */;
/*!40000 ALTER TABLE `comments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `posts`
--

DROP TABLE IF EXISTS `posts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `posts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `photo_url` varchar(1024) CHARACTER SET utf8 NOT NULL,
  `content` text CHARACTER SET utf8,
  `beer_score` int(1) NOT NULL DEFAULT '0',
  `soju_score` int(1) NOT NULL DEFAULT '0',
  `traditional_alcoholic_drinks_score` int(1) NOT NULL DEFAULT '0',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleted_at` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `posts_users_id_fk` (`user_id`),
  CONSTRAINT `posts_users_id_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `posts`
--

LOCK TABLES `posts` WRITE;
/*!40000 ALTER TABLE `posts` DISABLE KEYS */;
/*!40000 ALTER TABLE `posts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_contact_info_types`
--

DROP TABLE IF EXISTS `user_contact_info_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_contact_info_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_contact_info_types_type_name_uindex` (`type_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_contact_info_types`
--

LOCK TABLES `user_contact_info_types` WRITE;
/*!40000 ALTER TABLE `user_contact_info_types` DISABLE KEYS */;
INSERT INTO `user_contact_info_types` VALUES (1,'email','2017-11-16 16:09:42',NULL,NULL);
INSERT INTO `user_contact_info_types` VALUES (2,'phone_number','2017-11-16 16:09:42',NULL,NULL);
/*!40000 ALTER TABLE `user_contact_info_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_contact_infos`
--

DROP TABLE IF EXISTS `user_contact_infos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_contact_infos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `info` varchar(512) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_id` int(11) NOT NULL,
  `type_id` int(11) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_contact_infos_user_id_type_id_uindex` (`user_id`,`type_id`),
  UNIQUE KEY `user_contact_infos_info_user_id_type_id_uindex` (`info`,`user_id`,`type_id`),
  KEY `user_contact_infos_user_contact_info_types_id_fk` (`type_id`),
  CONSTRAINT `user_contact_infos_user_contact_info_types_id_fk` FOREIGN KEY (`type_id`) REFERENCES `user_contact_info_types` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `user_contact_infos_users_id_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_contact_infos`
--

LOCK TABLES `user_contact_infos` WRITE;
/*!40000 ALTER TABLE `user_contact_infos` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_contact_infos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_contact_logs`
--

DROP TABLE IF EXISTS `user_contact_logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_contact_logs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `info_id` int(11) NOT NULL,
  `issued_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `subject_id` int(11) NOT NULL,
  `contacted_at` datetime DEFAULT NULL,
  `content` text CHARACTER SET utf8 NOT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_contact_logs_user_contact_infos_id_fk` (`info_id`),
  KEY `user_contact_logs_user_contact_subjects_id_fk` (`subject_id`),
  CONSTRAINT `user_contact_logs_user_contact_infos_id_fk` FOREIGN KEY (`info_id`) REFERENCES `user_contact_infos` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `user_contact_logs_user_contact_subjects_id_fk` FOREIGN KEY (`subject_id`) REFERENCES `user_contact_subjects` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_contact_logs`
--

LOCK TABLES `user_contact_logs` WRITE;
/*!40000 ALTER TABLE `user_contact_logs` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_contact_logs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_contact_subjects`
--

DROP TABLE IF EXISTS `user_contact_subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_contact_subjects` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(1024) CHARACTER SET utf8 NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_contact_subjects_title_uindex` (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_contact_subjects`
--

LOCK TABLES `user_contact_subjects` WRITE;
/*!40000 ALTER TABLE `user_contact_subjects` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_contact_subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_password_encryption_types`
--

DROP TABLE IF EXISTS `user_password_encryption_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_password_encryption_types` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(128) CHARACTER SET utf8 NOT NULL,
  `secret_key` binary(64) DEFAULT NULL,
  `description` varchar(1024) COLLATE utf8mb4_unicode_ci NOT NULL,
  `url` varchar(1024) CHARACTER SET utf8 NOT NULL DEFAULT 'Unknown',
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_password_encryption_types_type_name_secret_key_uindex` (`type_name`,`secret_key`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_password_encryption_types`
--

LOCK TABLES `user_password_encryption_types` WRITE;
/*!40000 ALTER TABLE `user_password_encryption_types` DISABLE KEYS */;
INSERT INTO `user_password_encryption_types` VALUES (2,'bcrypt',NULL,'cost = 12','https://en.wikipedia.org/wiki/Bcrypt','2017-11-16 16:40:06',NULL);
/*!40000 ALTER TABLE `user_password_encryption_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_password_histories`
--

DROP TABLE IF EXISTS `user_password_histories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_password_histories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `encrypted_password` varbinary(256) NOT NULL,
  `encryption_type_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `user_password_histories_users_id_fk` (`user_id`),
  KEY `user_password_histories_user_password_encryption_types_id_fk` (`encryption_type_id`),
  CONSTRAINT `user_password_histories_user_password_encryption_types_id_fk` FOREIGN KEY (`encryption_type_id`) REFERENCES `user_password_encryption_types` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `user_password_histories_users_id_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_password_histories`
--

LOCK TABLES `user_password_histories` WRITE;
/*!40000 ALTER TABLE `user_password_histories` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_password_histories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(50) CHARACTER SET utf8 NOT NULL,
  `auth_id` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL,
  `encrypted_password` varbinary(256) NOT NULL,
  `password_encryption_type_id` int(11) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `users_auth_id_uindex` (`auth_id`),
  KEY `users_user_password_encryption_types_id_fk` (`password_encryption_type_id`),
  CONSTRAINT `users_user_password_encryption_types_id_fk` FOREIGN KEY (`password_encryption_type_id`) REFERENCES `user_password_encryption_types` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (3,'안주안줌','anzoo-anzoom','$2a$12$dunvRet6AI0898.6cmGTzu9iMgqQum71hdCN0si4W/ug1qwHQGQIq\0\0\0\0',2,'2017-11-22 16:04:11',NULL,NULL);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-22 16:09:56
