SHOW DATABASES;
CREATE DATABASE `mydatabase` DEFAULT CHARACTER SET utf8;
DROP DATABASE IF EXISTS mydatabase;
USE mydatabase;
SHOW TABLES;

DROP TABLE table_name;
DROP TABLE `table_name`;
----------------------------------------
CREATE TABLE `users`(
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL,
`age` INT NOT NULL,
PRIMARY KEY (`id`));
---------------------------------------
CREATE TABLE `mydatabase`.`users2` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `users2` (
  `id` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `age` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3

SELECT * FROM users;
SELECT * FROM `users`;
