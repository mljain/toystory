CREATE SCHEMA `cohifi` ;

CREATE TABLE `cohifi`.`User` (
  `u_id` INT NOT NULL,
  `username` VARCHAR(45) NULL,
  `firstname` VARCHAR(45) NULL,
  `lastname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `address1` VARCHAR(45) NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC));