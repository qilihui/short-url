/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : localhost:3306
 Source Schema         : short_url

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 22/06/2021 10:10:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for url_info
-- ----------------------------
DROP TABLE IF EXISTS `url_info`;
CREATE TABLE `url_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `short_key` char(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `original_url` varchar(256) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1000002 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of url_info
-- ----------------------------
INSERT INTO `url_info` VALUES (1000000, 'XHE0', 'https://google.com');
INSERT INTO `url_info` VALUES (1000001, 'XHDV', 'https://google.com');

SET FOREIGN_KEY_CHECKS = 1;
