/*
Navicat MySQL Data Transfer

Source Server         : MyLocalMysql
Source Server Version : 50149
Source Host           : localhost:3306
Source Database       : db_shiro

Target Server Type    : MYSQL
Target Server Version : 50149
File Encoding         : 65001

Date: 2017-10-19 19:36:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `userName` varchar(500) DEFAULT NULL,
  `password` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'root', '11111');
INSERT INTO `users` VALUES ('2', 'lulf', '12345');
INSERT INTO `users` VALUES ('3', 'fxp', '66666');
