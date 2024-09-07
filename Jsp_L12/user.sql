/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : user

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2024-06-25 15:28:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '123123', '4297F44B13955235245B2497399D7A93', '1047635107@qq.com');
INSERT INTO `users` VALUES ('2', '123456', 'E10ADC3949BA59ABBE56E057F20F883E', '1047635107@qq.com');
INSERT INTO `users` VALUES ('3', '111111', '96E79218965EB72C92A549DD5A330112', '1047635107@qq.com');
INSERT INTO `users` VALUES ('4', '222222', 'E3CEB5881A0A1FDAAD01296D7554868D', '1047635107@qq.com');
INSERT INTO `users` VALUES ('5', '88888888', '8DDCFF3A80F4189CA1C9D4D902C3C909', '1047635107@qq.com');
INSERT INTO `users` VALUES ('6', '147852', '83B4EF5AE4BB360C96628AECDA974200', '1047635107@qq.com');
INSERT INTO `users` VALUES ('7', '333333', '1A100D2C0DAB19C4430E7D73762B3423', '1047635107@QQ.COM');
INSERT INTO `users` VALUES ('8', '张三', '1A100D2C0DAB19C4430E7D73762B3423', '1047635107@QQ.COM');
