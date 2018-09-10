/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : GMYDB

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 10/09/2018 15:02:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_area
-- ----------------------------
DROP TABLE IF EXISTS `t_area`;
CREATE TABLE `t_area` (
  `area_id` int(2) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(255) NOT NULL,
  `priority` int(2) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`area_id`,`area_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_area
-- ----------------------------
BEGIN;
INSERT INTO `t_area` VALUES (2, '西游记', 2, '2018-09-04 15:47:16', '2018-09-10 14:33:49');
INSERT INTO `t_area` VALUES (5, '东海国际', 5, NULL, NULL);
INSERT INTO `t_area` VALUES (6, '名人堂', 1, '2018-09-10 14:43:00', '2018-09-10 14:45:29');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
