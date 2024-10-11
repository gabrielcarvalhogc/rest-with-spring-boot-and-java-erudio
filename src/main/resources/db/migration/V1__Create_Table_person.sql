
CREATE TABLE IF NOT EXISTS `person` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `address` varchar(80) NOT NULL,
  `gender` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);
-- Dump completed on 2024-10-11 16:12:48
