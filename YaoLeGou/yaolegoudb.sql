/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : yaolegoudb

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2024-06-27 16:30:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `banner`
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认Id',
  `Image` varchar(9999) NOT NULL COMMENT 'Banner图',
  `BgColor` varchar(10) NOT NULL COMMENT '背景颜色',
  `Href` varchar(9999) NOT NULL COMMENT 'Uri连接',
  `IsTingYong` int(11) NOT NULL COMMENT '是否停用',
  `BeiZhu` varchar(50) NOT NULL COMMENT '备注',
  `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of banner
-- ----------------------------
INSERT INTO `banner` VALUES ('1', 'Image/Index_Image/Banner1.jpg', '#FCD4EC', 'ShangYi.do?State=Select&ShopId=105', '1', '第一张图', '2018-10-12 13:47:51');
INSERT INTO `banner` VALUES ('2', 'Image/Index_Image/Banner2.jpg', '#D5F4B1', '#', '0', '第二张图', '2018-09-29 08:31:16');
INSERT INTO `banner` VALUES ('19', 'Image/Index_Image/1538818149141.jpg', '#F5B5B9', 'http://www.ztyteam.cn', '0', '#F5B5B9', '2018-10-06 17:29:09');
INSERT INTO `banner` VALUES ('20', 'Image/Index_Image/1538969860324.jpg', '#E11111', '#', '1', '#E11111', '2018-10-08 16:53:06');
INSERT INTO `banner` VALUES ('21', 'Image/Index_Image/1538969889884.jpg', '#FFFFFF', '#', '0', '#FFFFFF', '2018-10-08 11:38:09');
INSERT INTO `banner` VALUES ('22', 'Image/Index_Image/1538969919583.jpg', '#454B57', '#', '0', '#454B57', '2018-10-08 11:38:39');
INSERT INTO `banner` VALUES ('24', 'Image/Index_Image/1538970318943.jpg', '#010101', 'tencent://message/?Menu=yes&uin=1973689961& Service=300&sigT=45a1e5847943b64c6ff3990f8a9e644d2b31356cb0b4ac6b24663a3c8dd0', '0', '#010101', '2018-10-08 11:45:18');

-- ----------------------------
-- Table structure for `city`
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `cityid` int(11) NOT NULL AUTO_INCREMENT,
  `cityName` varchar(20) NOT NULL,
  `ShengId` int(11) NOT NULL,
  PRIMARY KEY (`cityid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '石家庄', '10');
INSERT INTO `city` VALUES ('2', '唐山', '10');
INSERT INTO `city` VALUES ('3', '秦皇岛', '10');
INSERT INTO `city` VALUES ('4', '邯郸', '10');
INSERT INTO `city` VALUES ('5', '邢台', '10');
INSERT INTO `city` VALUES ('6', '保定', '10');
INSERT INTO `city` VALUES ('7', '张家口', '10');
INSERT INTO `city` VALUES ('8', '承德', '10');
INSERT INTO `city` VALUES ('9', '沧州', '10');
INSERT INTO `city` VALUES ('10', '廊坊', '10');
INSERT INTO `city` VALUES ('11', '衡水', '10');

-- ----------------------------
-- Table structure for `daohangtiao`
-- ----------------------------
DROP TABLE IF EXISTS `daohangtiao`;
CREATE TABLE `daohangtiao` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认Id',
  `DaoHangTiaoName` varchar(50) NOT NULL COMMENT '导航条名称',
  `Href` varchar(9999) NOT NULL COMMENT 'Uri连接',
  `IsTingYong` int(11) NOT NULL COMMENT '0正常 1停用',
  `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of daohangtiao
-- ----------------------------
INSERT INTO `daohangtiao` VALUES ('1', '首页', 'index.do', '0', '2018-09-28 15:16:30');
INSERT INTO `daohangtiao` VALUES ('2', '上衣', 'ShangYi.do', '0', '2018-09-28 16:44:02');
INSERT INTO `daohangtiao` VALUES ('3', '裤子', 'KuZi.do', '0', '2018-09-28 16:44:22');
INSERT INTO `daohangtiao` VALUES ('4', '鞋子', 'Xie.do', '0', '2018-09-28 16:44:35');
INSERT INTO `daohangtiao` VALUES ('5', '导航测试', '#', '1', '2018-10-08 16:55:10');

-- ----------------------------
-- Table structure for `dingdanbiao`
-- ----------------------------
DROP TABLE IF EXISTS `dingdanbiao`;
CREATE TABLE `dingdanbiao` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认id',
  `DingDanNumber` varchar(50) NOT NULL COMMENT '订单编号',
  `ZhuRenUser` varchar(50) NOT NULL COMMENT '买家账号',
  `Price` double NOT NULL COMMENT '订单金额',
  `StateId` int(11) NOT NULL COMMENT '订单状态id',
  `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '下单时间',
  `UserName` varchar(50) NOT NULL COMMENT '买家账号',
  `ZhiFuId` int(11) NOT NULL COMMENT '支付方式',
  `AddressId` int(11) NOT NULL COMMENT '收货地址Id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=222 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dingdanbiao
-- ----------------------------
INSERT INTO `dingdanbiao` VALUES ('204', '2082075634734', '123456', '237', '3', '2018-10-12 13:40:27', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('205', '2767344708726', '123456', '639', '3', '2018-10-12 13:40:33', '000000', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('206', '2767344708726', '123456', '639', '3', '2018-10-12 13:40:33', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('207', '2526658607605', '123456', '99', '3', '2018-10-12 13:42:40', '000000', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('208', '0256665275482', '123456', '199', '3', '2018-10-12 15:47:59', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('209', '5467688760155', '123456', '79', '3', '2018-10-12 15:48:02', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('210', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('211', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('212', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('213', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('214', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('215', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('216', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('217', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('218', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('219', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('220', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');
INSERT INTO `dingdanbiao` VALUES ('221', '7584042285403', '123456', '79', '1', '2018-10-12 16:02:26', '123456', '2', '18');

-- ----------------------------
-- Table structure for `dingdanxiangqing`
-- ----------------------------
DROP TABLE IF EXISTS `dingdanxiangqing`;
CREATE TABLE `dingdanxiangqing` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认Id',
  `DingDanNumber` varchar(50) NOT NULL COMMENT '订单编号',
  `ShopId` int(11) NOT NULL COMMENT '商品Id',
  `ChiCui` varchar(100) NOT NULL COMMENT '尺寸',
  `Color` varchar(100) NOT NULL COMMENT '颜色',
  `Count` int(11) NOT NULL COMMENT '数量',
  `UserName` varchar(50) NOT NULL COMMENT '卖家账号',
  `MyUser` varchar(50) NOT NULL COMMENT '买家账号',
  `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '下单时间',
  `State` varchar(50) DEFAULT NULL COMMENT '订单状态，待付款',
  `stateid` int(11) DEFAULT NULL COMMENT '订单状态',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=359 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dingdanxiangqing
-- ----------------------------
INSERT INTO `dingdanxiangqing` VALUES ('350', '2082075634734', '26', 'XL', '白色', '1', '123456', '123456', '2018-10-12 13:40:27', '已付款', '3');
INSERT INTO `dingdanxiangqing` VALUES ('351', '2082075634734', '39', 'S', '黑色', '1', '123456', '123456', '2018-10-12 13:40:27', '已付款', '3');
INSERT INTO `dingdanxiangqing` VALUES ('352', '2767344708726', '37', '3XL', '灰色', '1', '123456', '123456', '2018-10-12 13:40:33', '已付款', '3');
INSERT INTO `dingdanxiangqing` VALUES ('353', '2767344708726', '104', '2XL', '浅绿色', '5', '000000', '123456', '2018-10-12 13:40:33', '已付款', '3');
INSERT INTO `dingdanxiangqing` VALUES ('354', '2767344708726', '1', 'XXXL', '黑色', '1', '000000', '123456', '2018-10-12 13:40:33', '已付款', '3');
INSERT INTO `dingdanxiangqing` VALUES ('355', '2526658607605', '104', '2XL', '黑色', '1', '000000', '123456', '2018-10-12 13:42:41', '已付款', '3');
INSERT INTO `dingdanxiangqing` VALUES ('356', '0256665275482', '45', 'XXXL', '藏青色', '1', '123456', '123456', '2018-10-12 15:47:59', '已付款', '3');
INSERT INTO `dingdanxiangqing` VALUES ('357', '5467688760155', '44', 'XXXL', '白色', '1', '123456', '123456', '2018-10-12 15:48:02', '已付款', '3');
INSERT INTO `dingdanxiangqing` VALUES ('358', '7584042285403', '47', 'M100-135斤', '黑色', '1', '123456', '123456', '2018-10-12 15:55:50', '已付款', '1');

-- ----------------------------
-- Table structure for `ditu`
-- ----------------------------
DROP TABLE IF EXISTS `ditu`;
CREATE TABLE `ditu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `MapName` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ditu
-- ----------------------------
INSERT INTO `ditu` VALUES ('1', '邯郸');
INSERT INTO `ditu` VALUES ('2', '秦皇岛');
INSERT INTO `ditu` VALUES ('3', '承德');

-- ----------------------------
-- Table structure for `gouwuche`
-- ----------------------------
DROP TABLE IF EXISTS `gouwuche`;
CREATE TABLE `gouwuche` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认Id',
  `UserName` varchar(50) NOT NULL COMMENT '用户账号',
  `ShopName` varchar(200) NOT NULL COMMENT '商品标题',
  `ChiCun` varchar(100) NOT NULL COMMENT '尺寸',
  `Color` varchar(100) NOT NULL COMMENT '颜色',
  `Count` int(11) NOT NULL COMMENT '购买的数量',
  `Price` double NOT NULL COMMENT '单价',
  `Image` varchar(9999) NOT NULL COMMENT '商品图片',
  `ShopId` int(11) NOT NULL COMMENT '商品Id',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gouwuche
-- ----------------------------

-- ----------------------------
-- Table structure for `jibeninfo`
-- ----------------------------
DROP TABLE IF EXISTS `jibeninfo`;
CREATE TABLE `jibeninfo` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认id',
  `Key` varchar(50) NOT NULL COMMENT '键',
  `value` varchar(9999) NOT NULL COMMENT '值',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jibeninfo
-- ----------------------------
INSERT INTO `jibeninfo` VALUES ('1', 'Title', '瑶乐购 - 全球最大全球最好的时尚服装网上商城');
INSERT INTO `jibeninfo` VALUES ('2', 'Context', '瑶乐购是全球最大全球最好的时尚服装网上商城');
INSERT INTO `jibeninfo` VALUES ('3', 'TongJi', '<script type=\"text/javascript\">var cnzz_protocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");document.write(unescape(\"%3Cspan id=\'cnzz_stat_icon_1273538038\'%3E%3C/span%3E%3Cscript src=\'\" + cnzz_protocol + \"s22.cnzz.com/z_stat.php%3Fid%3D1273538038%26show%3Dpic\' type=\'text/javascript\'%3E%3C/script%3E\"));</script>');
INSERT INTO `jibeninfo` VALUES ('4', 'Copy', '2018 张童瑶所有');
INSERT INTO `jibeninfo` VALUES ('5', 'BeiAn', '<a href=\'http://www.miitbeian.gov.cn\' target=\'_black\'>冀ICP备18029949号</a>');

-- ----------------------------
-- Table structure for `loginadmin`
-- ----------------------------
DROP TABLE IF EXISTS `loginadmin`;
CREATE TABLE `loginadmin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认id',
  `UserName` varchar(50) NOT NULL COMMENT '后台管理员账号',
  `PassWord` varchar(50) NOT NULL COMMENT '管理员密码',
  `ShenFenId` int(11) NOT NULL COMMENT '身份类型',
  `Name` varchar(20) NOT NULL COMMENT '真实姓名',
  `Phone` varchar(11) NOT NULL COMMENT '手机号',
  `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '账号创建日期',
  `SexId` int(11) NOT NULL COMMENT '性别',
  `BeiZhu` varchar(100) NOT NULL COMMENT '备注',
  `State` int(11) NOT NULL COMMENT '是否启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loginadmin
-- ----------------------------
INSERT INTO `loginadmin` VALUES ('18', 'admin', 'admin', '1', '张童瑶', '15232045008', '2018-10-11 16:09:31', '1', '瑶乐购创始人', '0');
INSERT INTO `loginadmin` VALUES ('19', 'XiaoMing', 'admin', '2', '李明飞', '15232045008', '2018-10-06 16:41:05', '1', '这是李明飞账号', '0');

-- ----------------------------
-- Table structure for `pinglun`
-- ----------------------------
DROP TABLE IF EXISTS `pinglun`;
CREATE TABLE `pinglun` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认id',
  `ShopId` int(11) NOT NULL COMMENT '商品id',
  `UserName` varchar(50) NOT NULL COMMENT '卖家账号',
  `Context` varchar(9999) NOT NULL COMMENT '评论的内容',
  `MyUser` varchar(50) NOT NULL COMMENT '买家账号',
  `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '评论时间',
  `MyUserState` int(11) NOT NULL COMMENT '自己是否知道 1不知道，0知道',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=195 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pinglun
-- ----------------------------
INSERT INTO `pinglun` VALUES ('2', '102', '123456', '<img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/01/2018new_chigua_thumb.png\" height=\"22\" width=\"22\" />', '123456', '2018-09-27 10:13:12', '1');
INSERT INTO `pinglun` VALUES ('3', '102', '123456', '<img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/fd/2018new_baibai_thumb.png\" height=\"22\" width=\"22\" />这个网站太好了，我都接受不了了，我先去往这个网站里面充钱了。<img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/f6/2018new_aini_org.png\" height=\"22\" width=\"22\" /><img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/f6/2018new_aini_org.png\" height=\"22\" width=\"22\" /><img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/f6/2018new_aini_org.png\" height=\"22\" width=\"22\" /><img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/ca/qixi2018_xiaoxinxin_thumb.png\" height=\"22\" width=\"22\" />', '000000', '2018-09-27 10:16:16', '1');
INSERT INTO `pinglun` VALUES ('13', '105', '123456', '<img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/dd/2018new_shayan_org.png\" height=\"22\" width=\"22\" />这衣服简直棒极了，我很喜欢有空，给我对象买一个，但是，我对象呢？张童瑶什么时候给我们发放一个对象啊，不要String类型的，我要Object的这个样什么样的都有。<img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/aa/2018new_shiwang_thumb.png\" height=\"22\" width=\"22\" /><img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/aa/2018new_shiwang_thumb.png\" height=\"22\" width=\"22\" /><img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/aa/2018new_shiwang_thumb.png\" height=\"22\" width=\"22\" />', '92243424', '2018-09-30 14:24:52', '1');
INSERT INTO `pinglun` VALUES ('166', '110', '5736264', '<img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/aa/2018new_bingbujiandan_thumb.png\" height=\"22\" width=\"22\" />111', '5736264', '2018-10-04 09:45:44', '1');
INSERT INTO `pinglun` VALUES ('169', '37', '123456', '嘿，这衣服，哎嘿真好看，下次还来瑶乐购购买。太棒了，尤其是底下几位评委太帅真是。', '43931011', '2018-10-06 17:12:15', '1');
INSERT INTO `pinglun` VALUES ('172', '64', '123456', '很好', '123456', '2024-06-27 09:28:59', '1');

-- ----------------------------
-- Table structure for `qu`
-- ----------------------------
DROP TABLE IF EXISTS `qu`;
CREATE TABLE `qu` (
  `quid` int(11) NOT NULL AUTO_INCREMENT,
  `quName` varchar(20) NOT NULL,
  `Cityid` int(11) NOT NULL,
  PRIMARY KEY (`quid`)
) ENGINE=InnoDB AUTO_INCREMENT=152 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qu
-- ----------------------------
INSERT INTO `qu` VALUES ('1', '邯山区', '4');
INSERT INTO `qu` VALUES ('2', '丛台区', '4');
INSERT INTO `qu` VALUES ('3', '复兴区', '4');
INSERT INTO `qu` VALUES ('4', '峰峰', '4');
INSERT INTO `qu` VALUES ('5', '邯郸县', '4');
INSERT INTO `qu` VALUES ('6', '临漳县', '4');
INSERT INTO `qu` VALUES ('7', '成安县', '4');
INSERT INTO `qu` VALUES ('8', '大名县', '4');
INSERT INTO `qu` VALUES ('9', '涉县', '4');
INSERT INTO `qu` VALUES ('10', '磁县', '4');
INSERT INTO `qu` VALUES ('11', '肥乡县', '4');
INSERT INTO `qu` VALUES ('12', '永年区', '4');
INSERT INTO `qu` VALUES ('13', '邱县', '4');
INSERT INTO `qu` VALUES ('14', '鸡泽县', '4');
INSERT INTO `qu` VALUES ('15', '广平县', '4');
INSERT INTO `qu` VALUES ('16', '馆陶县', '4');
INSERT INTO `qu` VALUES ('17', '魏县', '4');
INSERT INTO `qu` VALUES ('18', '曲周县', '4');
INSERT INTO `qu` VALUES ('19', '武安市', '4');
INSERT INTO `qu` VALUES ('20', '赤城', '7');
INSERT INTO `qu` VALUES ('21', '崇礼', '7');
INSERT INTO `qu` VALUES ('22', '沽源', '7');
INSERT INTO `qu` VALUES ('23', '怀安', '7');
INSERT INTO `qu` VALUES ('24', '怀来', '7');
INSERT INTO `qu` VALUES ('25', '康保', '7');
INSERT INTO `qu` VALUES ('26', '尚义', '7');
INSERT INTO `qu` VALUES ('27', '万全', '7');
INSERT INTO `qu` VALUES ('28', '尉县', '7');
INSERT INTO `qu` VALUES ('29', '宣化', '7');
INSERT INTO `qu` VALUES ('30', '阳原', '7');
INSERT INTO `qu` VALUES ('31', '张北', '7');
INSERT INTO `qu` VALUES ('32', '张家口市', '7');
INSERT INTO `qu` VALUES ('33', '涿鹿', '7');
INSERT INTO `qu` VALUES ('52', '藁城', '1');
INSERT INTO `qu` VALUES ('53', '晋州', '1');
INSERT INTO `qu` VALUES ('54', '井陉', '1');
INSERT INTO `qu` VALUES ('55', '灵寿', '1');
INSERT INTO `qu` VALUES ('56', '鹿泉', '1');
INSERT INTO `qu` VALUES ('57', '栾城', '1');
INSERT INTO `qu` VALUES ('58', '平山', '1');
INSERT INTO `qu` VALUES ('59', '深泽', '1');
INSERT INTO `qu` VALUES ('60', '石家庄市', '1');
INSERT INTO `qu` VALUES ('61', '无极', '1');
INSERT INTO `qu` VALUES ('62', '辛集', '1');
INSERT INTO `qu` VALUES ('63', '新乐', '1');
INSERT INTO `qu` VALUES ('64', '行唐', '1');
INSERT INTO `qu` VALUES ('65', '元氏', '1');
INSERT INTO `qu` VALUES ('66', '赞皇', '1');
INSERT INTO `qu` VALUES ('67', '赵县', '1');
INSERT INTO `qu` VALUES ('68', '正定', '1');
INSERT INTO `qu` VALUES ('69', '高邑', '1');
INSERT INTO `qu` VALUES ('70', '长安区', '1');
INSERT INTO `qu` VALUES ('71', '桥西区', '1');
INSERT INTO `qu` VALUES ('72', '新华区', '1');
INSERT INTO `qu` VALUES ('73', '裕华区', '1');
INSERT INTO `qu` VALUES ('74', '桥东区', '1');
INSERT INTO `qu` VALUES ('75', '辛集市', '1');
INSERT INTO `qu` VALUES ('76', '正定县', '1');
INSERT INTO `qu` VALUES ('77', '正定镇', '1');
INSERT INTO `qu` VALUES ('78', '平山县', '1');
INSERT INTO `qu` VALUES ('79', '平山镇', '1');
INSERT INTO `qu` VALUES ('80', '新乐市', '1');
INSERT INTO `qu` VALUES ('81', '鹿泉市', '1');
INSERT INTO `qu` VALUES ('82', '路北区', '2');
INSERT INTO `qu` VALUES ('83', '路南区', '2');
INSERT INTO `qu` VALUES ('84', '开平区', '2');
INSERT INTO `qu` VALUES ('85', '丰润区', '2');
INSERT INTO `qu` VALUES ('86', '丰南区', '2');
INSERT INTO `qu` VALUES ('87', '古治区', '2');
INSERT INTO `qu` VALUES ('88', '玉田县', '2');
INSERT INTO `qu` VALUES ('89', '玉田镇', '2');
INSERT INTO `qu` VALUES ('90', '唐海县', '2');
INSERT INTO `qu` VALUES ('91', '唐海镇', '2');
INSERT INTO `qu` VALUES ('92', '海港区', '3');
INSERT INTO `qu` VALUES ('93', '山海关区', '3');
INSERT INTO `qu` VALUES ('94', '北戴河区', '3');
INSERT INTO `qu` VALUES ('95', '卢龙县', '3');
INSERT INTO `qu` VALUES ('96', '卢龙镇', '3');
INSERT INTO `qu` VALUES ('97', '青龙镇', '3');
INSERT INTO `qu` VALUES ('98', '桥东区', '4');
INSERT INTO `qu` VALUES ('99', '桥西区', '4');
INSERT INTO `qu` VALUES ('100', '沙河市', '4');
INSERT INTO `qu` VALUES ('101', '邢台县', '4');
INSERT INTO `qu` VALUES ('102', '临城县', '4');
INSERT INTO `qu` VALUES ('103', '临城镇', '4');
INSERT INTO `qu` VALUES ('104', '平乡县', '4');
INSERT INTO `qu` VALUES ('105', '丰州镇', '4');
INSERT INTO `qu` VALUES ('106', '新市区', '5');
INSERT INTO `qu` VALUES ('107', '北市区', '5');
INSERT INTO `qu` VALUES ('108', '南市区', '5');
INSERT INTO `qu` VALUES ('109', '定州市', '5');
INSERT INTO `qu` VALUES ('110', '安国市', '5');
INSERT INTO `qu` VALUES ('111', '高碑店', '5');
INSERT INTO `qu` VALUES ('112', '满城县', '5');
INSERT INTO `qu` VALUES ('113', '满城镇', '5');
INSERT INTO `qu` VALUES ('114', '徐水县', '5');
INSERT INTO `qu` VALUES ('115', '定兴县', '5');
INSERT INTO `qu` VALUES ('116', '双桥区', '6');
INSERT INTO `qu` VALUES ('117', '承德县', '6');
INSERT INTO `qu` VALUES ('118', '平泉县', '6');
INSERT INTO `qu` VALUES ('119', '平泉镇', '6');
INSERT INTO `qu` VALUES ('120', '隆化县', '6');
INSERT INTO `qu` VALUES ('121', '隆化镇', '6');
INSERT INTO `qu` VALUES ('122', '宽城县', '6');
INSERT INTO `qu` VALUES ('123', '围场镇', '6');
INSERT INTO `qu` VALUES ('124', '兴隆县', '6');
INSERT INTO `qu` VALUES ('125', '兴隆镇', '6');
INSERT INTO `qu` VALUES ('126', '运河区', '7');
INSERT INTO `qu` VALUES ('127', '新华区', '7');
INSERT INTO `qu` VALUES ('128', '河间市', '7');
INSERT INTO `qu` VALUES ('129', '沧县', '7');
INSERT INTO `qu` VALUES ('130', '青县', '7');
INSERT INTO `qu` VALUES ('131', '清州镇', '7');
INSERT INTO `qu` VALUES ('132', '盐山县', '7');
INSERT INTO `qu` VALUES ('133', '盐山镇', '7');
INSERT INTO `qu` VALUES ('134', '安次区', '8');
INSERT INTO `qu` VALUES ('135', '广阳区', '8');
INSERT INTO `qu` VALUES ('136', '山河市', '8');
INSERT INTO `qu` VALUES ('137', '霸州市', '8');
INSERT INTO `qu` VALUES ('138', '大城县', '8');
INSERT INTO `qu` VALUES ('139', '文安县', '8');
INSERT INTO `qu` VALUES ('140', '文安镇', '8');
INSERT INTO `qu` VALUES ('141', '大厂镇', '8');
INSERT INTO `qu` VALUES ('142', '香河县', '8');
INSERT INTO `qu` VALUES ('143', '冀州市', '9');
INSERT INTO `qu` VALUES ('144', '深州市', '9');
INSERT INTO `qu` VALUES ('145', '枣强县', '9');
INSERT INTO `qu` VALUES ('146', '枣强镇', '9');
INSERT INTO `qu` VALUES ('147', '武强县', '9');
INSERT INTO `qu` VALUES ('148', '武强镇', '9');
INSERT INTO `qu` VALUES ('149', '安平县', '9');
INSERT INTO `qu` VALUES ('150', '安平镇', '9');
INSERT INTO `qu` VALUES ('151', '郑口镇', '9');

-- ----------------------------
-- Table structure for `quanxian`
-- ----------------------------
DROP TABLE IF EXISTS `quanxian`;
CREATE TABLE `quanxian` (
  `AdminUser` varchar(50) NOT NULL COMMENT '管理员账号',
  `ShouYeAdmin` int(11) NOT NULL COMMENT '0有，1无',
  `ShopAdmin` int(11) NOT NULL COMMENT '0有，1无',
  `UserAdmin` int(11) NOT NULL COMMENT '0有，1无',
  `Admin` int(11) NOT NULL COMMENT '0有，1无',
  `TongJiAdmin` int(11) NOT NULL COMMENT '0有，1无',
  `JIBenAdmin` int(11) NOT NULL COMMENT '0有，1无'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of quanxian
-- ----------------------------
INSERT INTO `quanxian` VALUES ('admin', '0', '0', '0', '0', '0', '0');
INSERT INTO `quanxian` VALUES ('XiaoMing', '0', '0', '0', '1', '0', '0');

-- ----------------------------
-- Table structure for `shaddress`
-- ----------------------------
DROP TABLE IF EXISTS `shaddress`;
CREATE TABLE `shaddress` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认id',
  `UserName` varchar(50) NOT NULL COMMENT '用户账号',
  `Name` varchar(50) NOT NULL COMMENT '收货人姓名',
  `Phone` varchar(11) NOT NULL COMMENT '手机号',
  `ByPhone` varchar(11) DEFAULT NULL COMMENT '备用手机号',
  `City` varchar(50) NOT NULL COMMENT '所在地区',
  `Address` varchar(100) NOT NULL COMMENT '详细地址',
  `Lable` varchar(50) DEFAULT NULL COMMENT '标签',
  `Default` int(11) DEFAULT NULL COMMENT '默认地址0,不默认,1代表的是默认地址',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shaddress
-- ----------------------------
INSERT INTO `shaddress` VALUES ('3', '123456', '张晨', '15232045008', '12345678910', '上海市 ', '童瑶科技', '公司', '0');
INSERT INTO `shaddress` VALUES ('16', '000000', '李四', '15232045008', null, '河北 邯郸 邯山区', '鹏泰大厦', '学校', '0');
INSERT INTO `shaddress` VALUES ('18', '123456', '张童瑶', '15232045008', '15232045008', '河北 邯郸 邯山区', '滏西大街与学院北路交叉口鹏泰大厦', '学校', '0');
INSERT INTO `shaddress` VALUES ('19', '123456', '张童瑶', '15232045008', '15232045008', '北京 朝阳区', '北京朝阳区交叉口瑶讯科技有限责任公司', '公司', '1');
INSERT INTO `shaddress` VALUES ('29', '000000', '干不倒', '15232045008', null, '河北 邯郸 邯山区', '鹏泰大厦四楼 最好中午到 谢谢！', '学校', '1');
INSERT INTO `shaddress` VALUES ('30', '92243424', '小猪佩奇', '15232045008', null, '河北 邯郸 邯山区', '鹏泰大厦四楼，送前台，不送前台，我从这里跳下去也不会下去拿', '学校', '1');
INSERT INTO `shaddress` VALUES ('31', '5736264', '李明飞', '15533313521', null, '河北 邯郸 邯山区', '鹏泰大厦', '学校', '1');
INSERT INTO `shaddress` VALUES ('32', '25562932', '张童瑶', '1523045008', null, '河北 邯郸 邯山区', '鹏泰大厦', '学校', '1');
INSERT INTO `shaddress` VALUES ('33', '43931011', '李明飞', '15232045008', null, '河南 ', '鹏泰大厦四楼 前台，送前台，如果不送，我张童瑶从四楼跳下去也不会下去拿快递的，下楼拿快递真好。', '学校', '1');
INSERT INTO `shaddress` VALUES ('34', '23840556', '张童瑶', '123456489', null, '河北 邯郸 邯山区', '鹏泰大厦', '学校', '1');
INSERT INTO `shaddress` VALUES ('35', '10973654', '张三', '15200142203', null, '河北 邯郸 邯山区', 'asdf', '学校', '1');
INSERT INTO `shaddress` VALUES ('36', '45078733', '张童瑶', '15200142204', '15200142204', '河北 邯郸 邯山区', '鹏泰大厦', '学校', '1');
INSERT INTO `shaddress` VALUES ('38', '79719494', '张三', '15232045008', null, '河北 邯郸 邯山区', 'xx大厦', '学校', '1');

-- ----------------------------
-- Table structure for `sheng`
-- ----------------------------
DROP TABLE IF EXISTS `sheng`;
CREATE TABLE `sheng` (
  `Shengid` int(11) NOT NULL AUTO_INCREMENT,
  `ShengName` varchar(20) NOT NULL,
  PRIMARY KEY (`Shengid`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sheng
-- ----------------------------
INSERT INTO `sheng` VALUES ('1', '北京');
INSERT INTO `sheng` VALUES ('2', '上海');
INSERT INTO `sheng` VALUES ('3', '天津');
INSERT INTO `sheng` VALUES ('4', '重庆');
INSERT INTO `sheng` VALUES ('5', '江苏');
INSERT INTO `sheng` VALUES ('6', '广东');
INSERT INTO `sheng` VALUES ('7', '山东');
INSERT INTO `sheng` VALUES ('8', '浙江');
INSERT INTO `sheng` VALUES ('9', '四川');
INSERT INTO `sheng` VALUES ('10', '河北');
INSERT INTO `sheng` VALUES ('11', '湖北');
INSERT INTO `sheng` VALUES ('12', '福建');
INSERT INTO `sheng` VALUES ('13', '辽宁');
INSERT INTO `sheng` VALUES ('14', '河南');
INSERT INTO `sheng` VALUES ('15', '安微');
INSERT INTO `sheng` VALUES ('16', '湖南');
INSERT INTO `sheng` VALUES ('17', '陕西');
INSERT INTO `sheng` VALUES ('18', '广西');
INSERT INTO `sheng` VALUES ('19', '江西');
INSERT INTO `sheng` VALUES ('20', '山西');
INSERT INTO `sheng` VALUES ('21', '黑龙江');
INSERT INTO `sheng` VALUES ('22', '吉林');
INSERT INTO `sheng` VALUES ('23', '贵州');
INSERT INTO `sheng` VALUES ('24', '云南');
INSERT INTO `sheng` VALUES ('25', '新疆');
INSERT INTO `sheng` VALUES ('26', '甘肃');
INSERT INTO `sheng` VALUES ('27', '内蒙古');
INSERT INTO `sheng` VALUES ('28', '海南');
INSERT INTO `sheng` VALUES ('29', '宁夏');
INSERT INTO `sheng` VALUES ('30', '青海');
INSERT INTO `sheng` VALUES ('31', '西藏');

-- ----------------------------
-- Table structure for `shopcolor`
-- ----------------------------
DROP TABLE IF EXISTS `shopcolor`;
CREATE TABLE `shopcolor` (
  `ShopId` int(11) DEFAULT NULL COMMENT '商品id',
  `Color` varchar(10) NOT NULL COMMENT '颜色参数',
  `S_Img` varchar(9999) NOT NULL COMMENT '小图',
  `B_Img` varchar(9999) NOT NULL COMMENT '大图'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopcolor
-- ----------------------------
INSERT INTO `shopcolor` VALUES ('1', '黑色', 'attached/image/s3.jpg', 'attached/image/b3.jpg');
INSERT INTO `shopcolor` VALUES ('1', '白色', 'attached/image/s2.jpg', 'attached/image/b2.jpg');
INSERT INTO `shopcolor` VALUES ('1', '黑色', 'attached/image/s1.jpg', 'attached/image/b1.jpg');
INSERT INTO `shopcolor` VALUES ('1', '黑色', 'attached/image/s4.jpg', 'attached/image/b4.jpg');
INSERT INTO `shopcolor` VALUES ('2', '杏色', 'attached/image/2_color_1.jpg', 'attached/image/2_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('2', '杏色', 'attached/image/2_color_2.jpg', 'attached/image/2_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('2', '杏色', 'attached/image/2_color_3.jpg', 'attached/image/2_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('2', '杏色', 'attached/image/2_color_4.jpg', 'attached/image/2_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('2', '白色', 'attached/image/2_color_5.jpg', 'attached/image/2_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('2', '白色', 'attached/image/2_color_6.jpg', 'attached/image/2_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('18', '豆绿色', 'attached/image/18_color_1.jpg', 'attached/image/18_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('18', '豆绿色', 'attached/image/18_color_2.jpg', 'attached/image/18_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('18', '浅灰色', 'attached/image/18_color_3.jpg', 'attached/image/18_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('18', '浅灰色', 'attached/image/18_color_4.jpg', 'attached/image/18_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('18', '浅灰色', 'attached/image/18_color_5.jpg', 'attached/image/18_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('18', '浅灰色', 'attached/image/18_color_6.jpg', 'attached/image/18_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('18', '深蓝色', 'attached/image/18_color_7.jpg', 'attached/image/18_color_7.jpg');
INSERT INTO `shopcolor` VALUES ('18', '深蓝色', 'attached/image/18_color_8.jpg', 'attached/image/18_color_8.jpg');
INSERT INTO `shopcolor` VALUES ('19', '米白色', 'attached/image/19_color_1.jpg', 'attached/image/19_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('19', '米白色', 'attached/image/19_color_2.jpg', 'attached/image/19_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('19', '米白色', 'attached/image/19_color_3.jpg', 'attached/image/19_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('19', '米白色', 'attached/image/19_color_4.jpg', 'attached/image/19_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('19', '浅粉色', 'attached/image/19_color_5.jpg', 'attached/image/19_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('19', '浅粉色', 'attached/image/19_color_6.jpg', 'attached/image/19_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('20', '白色', 'attached/image/20_color_1.jpg', 'attached/image/20_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('20', '白色', 'attached/image/20_color_2.jpg', 'attached/image/20_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('20', '酒红色', 'attached/image/20_color_3.jpg', 'attached/image/20_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('20', '酒红色', 'attached/image/20_color_4.jpg', 'attached/image/20_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('20', '姜黄色', 'attached/image/20_color_5.jpg', 'attached/image/20_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('20', '姜黄色', 'attached/image/20_color_6.jpg', 'attached/image/20_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('20', '灰色', 'attached/image/20_color_7.jpg', 'attached/image/20_color_7.jpg');
INSERT INTO `shopcolor` VALUES ('20', '灰色', 'attached/image/20_color_8.jpg', 'attached/image/20_color_8.jpg');
INSERT INTO `shopcolor` VALUES ('20', '藕粉色', 'attached/image/20_color_9.jpg', 'attached/image/20_color_9.jpg');
INSERT INTO `shopcolor` VALUES ('20', '藕粉色', 'attached/image/20_color_10.jpg', 'attached/image/20_color_10.jpg');
INSERT INTO `shopcolor` VALUES ('20', '黑色', 'attached/image/20_color_11.jpg', 'attached/image/20_color_11.jpg');
INSERT INTO `shopcolor` VALUES ('20', '黑色', 'attached/image/20_color_12.jpg', 'attached/image/20_color_12.jpg');
INSERT INTO `shopcolor` VALUES ('21', '白色', 'attached/image/21_color_1.jpg', 'attached/image/21_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('21', '白色', 'attached/image/21_color_2.jpg', 'attached/image/21_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('21', '白色', 'attached/image/21_color_3.jpg', 'attached/image/21_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('21', '白色', 'attached/image/21_color_4.jpg', 'attached/image/21_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('21', '粉色', 'attached/image/21_color_5.jpg', 'attached/image/21_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('21', '粉色', 'attached/image/21_color_6.jpg', 'attached/image/21_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('21', '粉色', 'attached/image/21_color_7.jpg', 'attached/image/21_color_7.jpg');
INSERT INTO `shopcolor` VALUES ('21', '粉色', 'attached/image/21_color_8.jpg', 'attached/image/21_color_8.jpg');
INSERT INTO `shopcolor` VALUES ('22', '黄色', 'attached/image/22_color_1.jpg', 'attached/image/22_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('22', '黄色', 'attached/image/22_color_2.jpg', 'attached/image/22_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('22', '白色', 'attached/image/22_color_3.jpg', 'attached/image/22_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('22', '白色', 'attached/image/22_color_4.jpg', 'attached/image/22_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('22', '红色', 'attached/image/22_color_5.jpg', 'attached/image/22_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('22', '红色', 'attached/image/22_color_6.jpg', 'attached/image/22_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('26', '白色', 'attached/image/26_color_1.jpg', 'attached/image/26_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('26', '白色', 'attached/image/26_color_2.jpg', 'attached/image/26_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('26', '军绿', 'attached/image/26_color_3.jpg', 'attached/image/26_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('26', '军绿', 'attached/image/26_color_4.jpg', 'attached/image/26_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('28', '黑色', 'attached/image/28_color_1.jpg', 'attached/image/28_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('28', '黑色', 'attached/image/28_color_2.jpg', 'attached/image/28_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('28', '红色', 'attached/image/28_color_3.jpg', 'attached/image/28_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('28', '红色', 'attached/image/28_color_4.jpg', 'attached/image/28_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('30', '黑色', 'attached/image/30_color_1.jpg', 'attached/image/30_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('30', '黑色', 'attached/image/30_color_2.jpg', 'attached/image/30_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('30', '土色', 'attached/image/30_color_3.jpg', 'attached/image/30_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('30', '土色', 'attached/image/30_color_4.jpg', 'attached/image/30_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('31', '黑色', 'attached/image/31_color_1.jpg', 'attached/image/31_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('31', '黑色', 'attached/image/31_color_2.jpg', 'attached/image/31_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('31', '黑色', 'attached/image/31_color_3.jpg', 'attached/image/31_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('31', '黑色', 'attached/image/31_color_4.jpg', 'attached/image/31_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('31', '深灰色', 'attached/image/31_color_5.jpg', 'attached/image/31_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('31', '深灰色', 'attached/image/31_color_6.jpg', 'attached/image/31_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('31', '深灰色', 'attached/image/31_color_7.jpg', 'attached/image/31_color_7.jpg');
INSERT INTO `shopcolor` VALUES ('31', '浅灰色', 'attached/image/31_color_8.jpg', 'attached/image/31_color_8.jpg');
INSERT INTO `shopcolor` VALUES ('31', '浅灰色', 'attached/image/31_color_9.jpg', 'attached/image/31_color_9.jpg');
INSERT INTO `shopcolor` VALUES ('32', '黑色', 'attached/image/32_color_1.jpg', 'attached/image/32_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('32', '黑色', 'attached/image/32_color_2.jpg', 'attached/image/32_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('32', '黑色', 'attached/image/32_color_3.jpg', 'attached/image/32_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('32', '黑色', 'attached/image/32_color_4.jpg', 'attached/image/32_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('33', '黑色', 'attached/image/33_color_1.jpg', 'attached/image/33_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('33', '黑色', 'attached/image/33_color_2.jpg', 'attached/image/33_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('33', '黑色', 'attached/image/33_color_3.jpg', 'attached/image/33_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('33', '黑色', 'attached/image/33_color_4.jpg', 'attached/image/33_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('33', '黑色', 'attached/image/33_color_5.jpg', 'attached/image/33_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('34', '橙色', 'attached/image/34_color_1.jpg', 'attached/image/34_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('34', '浅蓝色', 'attached/image/34_color_2.jpg', 'attached/image/34_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('34', '白色', 'attached/image/34_color_3.jpg', 'attached/image/34_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('34', '白色', 'attached/image/34_color_4.jpg', 'attached/image/34_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('34', '白色', 'attached/image/34_color_5.jpg', 'attached/image/34_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('35', '米白色', 'attached/image/35_color_1.jpg', 'attached/image/35_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('35', '红色', 'attached/image/35_color_2.jpg', 'attached/image/35_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('35', '红色', 'attached/image/35_color_3.jpg', 'attached/image/35_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('35', '黑色', 'attached/image/35_color_4.jpg', 'attached/image/35_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('36', '藏青', 'attached/image/36_color_1.jpg', 'attached/image/36_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('36', '麻灰', 'attached/image/36_color_2.jpg', 'attached/image/36_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('36', '麻灰', 'attached/image/36_color_3.jpg', 'attached/image/36_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('36', '麻灰', 'attached/image/36_color_4.jpg', 'attached/image/36_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('36', '白色', 'attached/image/36_color_5.jpg', 'attached/image/36_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('36', '湖蓝', 'attached/image/36_color_6.jpg', 'attached/image/36_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('36', '黑色', 'attached/image/36_color_7.jpg', 'attached/image/36_color_7.jpg');
INSERT INTO `shopcolor` VALUES ('37', '白色', 'attached/image/37_color_1.jpg', 'attached/image/37_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('37', '灰色', 'attached/image/37_color_2.jpg', 'attached/image/37_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('37', '黑色', 'attached/image/37_color_3.jpg', 'attached/image/37_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('38', '米白色', 'attached/image/38_color_1.jpg', 'attached/image/38_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('38', '天蓝色', 'attached/image/38_color_2.jpg', 'attached/image/38_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('38', '天蓝色', 'attached/image/38_color_3.jpg', 'attached/image/38_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('39', '黑色', 'attached/image/39_color_1.jpg', 'attached/image/39_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('40', '白色', 'attached/image/40_color_1.jpg', 'attached/image/40_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('40', '黑色', 'attached/image/40_color_2.jpg', 'attached/image/40_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('40', '灰色', 'attached/image/40_color_3.jpg', 'attached/image/40_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('41', '白色', 'attached/image/41_color_1.jpg', 'attached/image/41_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('42', '黑色', 'attached/image/42_color_1.jpg', 'attached/image/42_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('43', '黄色', 'attached/image/43_color_1.jpg', 'attached/image/43_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('44', '白色', 'attached/image/44_color_1.jpg', 'attached/image/44_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('45', '焦糖色', 'attached/image/45_color_1.jpg', 'attached/image/45_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('45', '藏青色', 'attached/image/45_color_2.jpg', 'attached/image/45_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('45', '军绿色', 'attached/image/45_color_3.jpg', 'attached/image/45_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('47', '白色', 'attached/image/47_color_1.jpg', 'attached/image/47_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('47', '黑色', 'attached/image/47_color_2.jpg', 'attached/image/47_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('48', '酒红色', 'attached/image/48_color_1.jpg', 'attached/image/48_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('49', '黑色', 'attached/image/49_color_1.jpg', 'attached/image/49_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('49', '深灰色', 'attached/image/49_color_2.jpg', 'attached/image/49_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('50', '黑色', 'attached/image/50_color_1.jpg', 'attached/image/50_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('50', '红色', 'attached/image/50_color_2.jpg', 'attached/image/50_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('51', '天鹅蓝', 'attached/image/51_color_1.jpg', 'attached/image/51_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('51', '典雅黑', 'attached/image/51_color_2.jpg', 'attached/image/51_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('52', '暂时无颜色', 'attached/image/52_color_1.jpg', 'attached/image/52_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('56', '黑色', 'attached/image/56_color_1.jpg', 'attached/image/56_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('56', '黑色', 'attached/image/56_color_2.jpg', 'attached/image/56_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_1.jpg', 'attached/image/57_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_2.jpg', 'attached/image/57_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_3.jpg', 'attached/image/57_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_4.jpg', 'attached/image/57_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_5.jpg', 'attached/image/57_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_6.jpg', 'attached/image/57_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_7.jpg', 'attached/image/57_color_7.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_8.jpg', 'attached/image/57_color_8.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_9.jpg', 'attached/image/57_color_9.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_10.jpg', 'attached/image/57_color_10.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_11.jpg', 'attached/image/57_color_11.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_12.jpg', 'attached/image/57_color_12.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_13.jpg', 'attached/image/57_color_13.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_14.jpg', 'attached/image/57_color_14.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_15.jpg', 'attached/image/57_color_15.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_16.jpg', 'attached/image/57_color_16.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_17.jpg', 'attached/image/57_color_17.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_18.jpg', 'attached/image/57_color_18.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_19.jpg', 'attached/image/57_color_19.jpg');
INSERT INTO `shopcolor` VALUES ('57', '暂无颜色', 'attached/image/57_color_20.jpg', 'attached/image/57_color_20.jpg');
INSERT INTO `shopcolor` VALUES ('60', 'asdfadsf', 'attached/image/60_color_1.jpg', 'attached/image/60_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('60', 'asdfadsf', 'attached/image/60_color_2.jpg', 'attached/image/60_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('60', 'asdfadsf', 'attached/image/60_color_3.jpg', 'attached/image/60_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('60', 'asdfadsf', 'attached/image/60_color_4.jpg', 'attached/image/60_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('61', 'asdf', 'attached/image/61_color_1.jpg', 'attached/image/61_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('61', 'asdf', 'attached/image/61_color_2.jpg', 'attached/image/61_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('62', '浅蓝色', 'attached/image/62_color_1.jpg', 'attached/image/62_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('62', '深蓝色', 'attached/image/62_color_2.jpg', 'attached/image/62_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('63', '黑色', 'attached/image/63_color_1.jpg', 'attached/image/63_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('64', '浅蓝色', 'attached/image/64_color_1.jpg', 'attached/image/64_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('64', '黑色', 'attached/image/64_color_2.jpg', 'attached/image/64_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('65', '黑色', 'attached/image/65_color_1.jpg', 'attached/image/65_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('66', '黑灰色', 'attached/image/66_color_1.jpg', 'attached/image/66_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('66', '深蓝', 'attached/image/66_color_2.jpg', 'attached/image/66_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('67', '黑色', 'attached/image/67_color_1.jpg', 'attached/image/67_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('67', '灰色', 'attached/image/67_color_2.jpg', 'attached/image/67_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('68', '经典黑', 'attached/image/68_color_1.jpg', 'attached/image/68_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('68', '烟灰色', 'attached/image/68_color_2.jpg', 'attached/image/68_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('68', '标准蓝', 'attached/image/68_color_3.jpg', 'attached/image/68_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('69', '米白色', 'attached/image/69_color_1.jpg', 'attached/image/69_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('69', '黑色军', 'attached/image/69_color_2.jpg', 'attached/image/69_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('69', '绿色', 'attached/image/69_color_3.jpg', 'attached/image/69_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('70', '蓝色', 'attached/image/70_color_1.jpg', 'attached/image/70_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('71', '绿色', 'attached/image/71_color_1.jpg', 'attached/image/71_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('71', '黑色', 'attached/image/71_color_2.jpg', 'attached/image/71_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('71', '白色', 'attached/image/71_color_3.jpg', 'attached/image/71_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('72', '一杆', 'attached/image/72_color_1.jpg', 'attached/image/72_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('72', '白线', 'attached/image/72_color_2.jpg', 'attached/image/72_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('72', '黑色', 'attached/image/72_color_3.jpg', 'attached/image/72_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('73', '白色', 'attached/image/73_color_1.jpg', 'attached/image/73_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('73', '黑色', 'attached/image/73_color_2.jpg', 'attached/image/73_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('73', '灰色', 'attached/image/73_color_3.jpg', 'attached/image/73_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('73', '蓝色', 'attached/image/73_color_4.jpg', 'attached/image/73_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('74', '浅蓝色', 'attached/image/74_color_1.jpg', 'attached/image/74_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('74', '黑色', 'attached/image/74_color_2.jpg', 'attached/image/74_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('76', '黑色', 'attached/image/76_color_1.jpg', 'attached/image/76_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('77', '浅蓝色', 'attached/image/77_color_1.jpg', 'attached/image/77_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('77', '黑色', 'attached/image/77_color_2.jpg', 'attached/image/77_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('78', '白色', 'attached/image/78_color_1.jpg', 'attached/image/78_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('78', '黑色', 'attached/image/78_color_2.jpg', 'attached/image/78_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('79', '黑色', 'attached/image/79_color_1.jpg', 'attached/image/79_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('79', '黑色', 'attached/image/79_color_2.jpg', 'attached/image/79_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('80', '银色', 'attached/image/80_color_1.jpg', 'attached/image/80_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('80', '粉色', 'attached/image/80_color_2.jpg', 'attached/image/80_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('81', '白色', 'attached/image/81_color_1.jpg', 'attached/image/81_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('81', '黑色', 'attached/image/81_color_2.jpg', 'attached/image/81_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('82', '黑白色', 'attached/image/82_color_1.jpg', 'attached/image/82_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('82', '粉色', 'attached/image/82_color_2.jpg', 'attached/image/82_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('83', '黑色', 'attached/image/83_color_1.jpg', 'attached/image/83_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('83', '军绿色', 'attached/image/83_color_2.jpg', 'attached/image/83_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('83', '卡其色', 'attached/image/83_color_3.jpg', 'attached/image/83_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('83', '咖啡色', 'attached/image/83_color_4.jpg', 'attached/image/83_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('83', '红色', 'attached/image/83_color_5.jpg', 'attached/image/83_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('84', '红色', 'attached/image/84_color_1.jpg', 'attached/image/84_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('84', '黄色', 'attached/image/84_color_2.jpg', 'attached/image/84_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('85', '蓝绿色', 'attached/image/85_color_1.jpg', 'attached/image/85_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('85', '白色', 'attached/image/85_color_2.jpg', 'attached/image/85_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('85', '黑色', 'attached/image/85_color_3.jpg', 'attached/image/85_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('85', '灰色', 'attached/image/85_color_4.jpg', 'attached/image/85_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('86', '白色', 'attached/image/86_color_1.jpg', 'attached/image/86_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('86', '黑色', 'attached/image/86_color_2.jpg', 'attached/image/86_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('87', '黑色', 'attached/image/87_color_1.jpg', 'attached/image/87_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('89', '白黄', 'attached/image/89_color_1.jpg', 'attached/image/89_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('89', '白绿', 'attached/image/89_color_2.jpg', 'attached/image/89_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('90', '黑底男鞋', 'attached/image/90_color_1.jpg', 'attached/image/90_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('90', '白底男鞋', 'attached/image/90_color_2.jpg', 'attached/image/90_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('91', '白色', 'attached/image/91_color_1.jpg', 'attached/image/91_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('91', '黑色', 'attached/image/91_color_2.jpg', 'attached/image/91_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('91', '粉色', 'attached/image/91_color_3.jpg', 'attached/image/91_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('92', '白色', 'attached/image/92_color_1.jpg', 'attached/image/92_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('92', '黑色', 'attached/image/92_color_2.jpg', 'attached/image/92_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('92', '灰色', 'attached/image/92_color_3.jpg', 'attached/image/92_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('93', '米色', 'attached/image/93_color_1.jpg', 'attached/image/93_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('94', '白色', 'attached/image/94_color_1.jpg', 'attached/image/94_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('94', '黑白色', 'attached/image/94_color_2.jpg', 'attached/image/94_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('94', '米色', 'attached/image/94_color_3.jpg', 'attached/image/94_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('95', '白色', 'attached/image/95_color_1.jpg', 'attached/image/95_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('96', '红色', 'attached/image/96_color_1.jpg', 'attached/image/96_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('96', '白色', 'attached/image/96_color_2.jpg', 'attached/image/96_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('96', '黑色', 'attached/image/96_color_3.jpg', 'attached/image/96_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('96', '黄色', 'attached/image/96_color_4.jpg', 'attached/image/96_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('97', '红色', 'attached/image/97_color_1.jpg', 'attached/image/97_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('97', '黑色', 'attached/image/97_color_2.jpg', 'attached/image/97_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('98', '灰色', 'attached/image/98_color_1.jpg', 'attached/image/98_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('98', '深棕色', 'attached/image/98_color_2.jpg', 'attached/image/98_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('98', '卡其色', 'attached/image/98_color_3.jpg', 'attached/image/98_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('99', '黑色', 'attached/image/99_color_1.jpg', 'attached/image/99_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('99', '彩蓝', 'attached/image/99_color_2.jpg', 'attached/image/99_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('99', '皮红', 'attached/image/99_color_3.jpg', 'attached/image/99_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('100', '红色', 'attached/image/100_color_1.jpg', 'attached/image/100_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('100', '卡其色', 'attached/image/100_color_2.jpg', 'attached/image/100_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('100', '黑色', 'attached/image/100_color_3.jpg', 'attached/image/100_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('100', '皮粉色', 'attached/image/100_color_4.jpg', 'attached/image/100_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('101', '黑色', 'attached/image/101_color_1.jpg', 'attached/image/101_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('101', '咖啡色', 'attached/image/101_color_2.jpg', 'attached/image/101_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('101', '卡其色', 'attached/image/101_color_3.jpg', 'attached/image/101_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('102', '白色', 'attached/image/102_color_1.jpg', 'attached/image/102_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('103', '浅咖色', 'attached/image/103_color_1.jpg', 'attached/image/103_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('103', '米白色', 'attached/image/103_color_2.jpg', 'attached/image/103_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('103', '桔红色', 'attached/image/103_color_3.jpg', 'attached/image/103_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('104', '白色', 'attached/image/104_color_1.jpg', 'attached/image/104_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('104', '粉红色', 'attached/image/104_color_2.jpg', 'attached/image/104_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('104', '粉红色', 'attached/image/104_color_3.jpg', 'attached/image/104_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('104', '黑色', 'attached/image/104_color_4.jpg', 'attached/image/104_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('104', '浅绿色', 'attached/image/104_color_5.jpg', 'attached/image/104_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('104', '浅绿色', 'attached/image/104_color_6.jpg', 'attached/image/104_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('104', '卡其色', 'attached/image/104_color_7.jpg', 'attached/image/104_color_7.jpg');
INSERT INTO `shopcolor` VALUES ('105', '蓝白条纹', 'attached/image/105_color_1.jpg', 'attached/image/105_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('105', '蓝白条纹', 'attached/image/105_color_2.jpg', 'attached/image/105_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('105', '蓝白条纹', 'attached/image/105_color_3.jpg', 'attached/image/105_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('105', '蓝白条纹', 'attached/image/105_color_4.jpg', 'attached/image/105_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('105', '蓝白条纹', 'attached/image/105_color_5.jpg', 'attached/image/105_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('105', '黑白条纹', 'attached/image/105_color_6.jpg', 'attached/image/105_color_6.jpg');
INSERT INTO `shopcolor` VALUES ('106', '黑色', 'attached/image/106_color_1.jpg', 'attached/image/106_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('106', '红色', 'attached/image/106_color_2.jpg', 'attached/image/106_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('106', '红色', 'attached/image/106_color_3.jpg', 'attached/image/106_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('106', '红色', 'attached/image/106_color_4.jpg', 'attached/image/106_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('109', '黑色', 'attached/image/109_color_1.jpg', 'attached/image/109_color_1.jpg');
INSERT INTO `shopcolor` VALUES ('109', '黑色', 'attached/image/109_color_2.jpg', 'attached/image/109_color_2.jpg');
INSERT INTO `shopcolor` VALUES ('109', '灰色', 'attached/image/109_color_3.jpg', 'attached/image/109_color_3.jpg');
INSERT INTO `shopcolor` VALUES ('109', '灰色', 'attached/image/109_color_4.jpg', 'attached/image/109_color_4.jpg');
INSERT INTO `shopcolor` VALUES ('109', '黑色', 'attached/image/109_color_5.jpg', 'attached/image/109_color_5.jpg');
INSERT INTO `shopcolor` VALUES ('109', '黑色', 'attached/image/109_color_6.jpg', 'attached/image/109_color_6.jpg');

-- ----------------------------
-- Table structure for `shopinfo`
-- ----------------------------
DROP TABLE IF EXISTS `shopinfo`;
CREATE TABLE `shopinfo` (
  `ShopId` int(11) NOT NULL AUTO_INCREMENT COMMENT '性别Id',
  `ShopName` varchar(100) NOT NULL COMMENT '商品名称',
  `ShopMiaoShu` varchar(100) NOT NULL COMMENT '商品描述',
  `ShopPrice` double NOT NULL COMMENT '商品价格',
  `ChiCun` varchar(100) NOT NULL COMMENT '尺寸',
  `Color` varchar(100) NOT NULL COMMENT '商品颜色',
  `ZhuRenUser` varchar(50) NOT NULL COMMENT '卖家账号',
  `ShopTypeId` int(11) NOT NULL COMMENT '商品类别id',
  `Image` varchar(9999) NOT NULL COMMENT '商品封面图',
  `Context` varchar(9999) NOT NULL COMMENT '商品介绍',
  `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '商品发表日期',
  `XiaoLiangCount` int(11) NOT NULL,
  `xiajia` int(11) DEFAULT NULL,
  PRIMARY KEY (`ShopId`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopinfo
-- ----------------------------
INSERT INTO `shopinfo` VALUES ('1', '2018男士短袖T恤七分袖港风男装夏款韩版学生宽松7分上衣男生短袖t恤Q2001-LG1862', '这件衣服很不错', '85', 'M,Xl,L,XXL,XXXL', '黑色,白色', '000000', '1', 'attached/image/1.jpg', '<img src=\"attached/image/1_jieshao_1.jpg\">\n<img src=\"attached/image/1_jieshao_2.jpg\">\n<img src=\"attached/image/1_jieshao_3.jpg\">\n<img src=\"attached/image/1_jieshao_4.jpg\">\n<img src=\"attached/image/1_jieshao_5.jpg\">\n<img src=\"attached/image/1_jieshao_6.jpg\">\n<img src=\"attached/image/1_jieshao_7.jpg\">\n<img src=\"attached/image/1_jieshao_8.jpg\">\n希望广大 购友点击购买哦！！', '2018-10-12 13:39:53', '7', '1');
INSERT INTO `shopinfo` VALUES ('2', '早秋新品韩版chic字母印花休闲中长款女士T恤宽松长袖圆领上衣打底衫女xch.1437', '这件衣服是女生的。', '79', 'M,Xl,L', '杏色,白色', '123456', '1', 'attached/image/2_fengmian.jpg', '<img src=\"attached/image/2_jieshao_1.jpg\">\n<img src=\"attached/image/2_jieshao_2.jpg\">\n<img src=\"attached/image/2_jieshao_3.jpg\">\n<img src=\"attached/image/2_jieshao_4.jpg\">\n<img src=\"attached/image/2_jieshao_5.jpg\">\n<img src=\"attached/image/2_jieshao_6.jpg\">', '2018-10-12 10:16:12', '0', '1');
INSERT INTO `shopinfo` VALUES ('18', 'MAIDEXI迈得喜 时尚纯色弹力休闲男士长袖圆领修身T恤上衣 秋冬青年韩版小清新打底衫', 'MAIDEXI迈得喜 时尚纯色弹力休闲男士长袖圆领修身T恤上衣 秋冬青年韩版小清新打底衫', '47', 'M,XXXL', '豆绿色,浅灰色,深蓝色', '123456', '1', 'attached/image/18_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180913/20180913153712_102.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913153712_325.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913153712_606.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913153712_592.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913153712_219.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913153712_442.jpg\" alt=\"\" />', '2018-10-12 11:03:35', '0', '1');
INSERT INTO `shopinfo` VALUES ('19', '初语夏新款圆领短袖宽松字母T恤女显瘦纯棉打底百搭体恤上衣潮', '初语夏新款圆领短袖宽松字母T恤女显瘦纯棉打底百搭体恤上衣潮', '99', 'M,XXX,XXXL,XXL', '米白色,浅粉色', '123456', '1', 'attached/image/19_fengmian.jpg', '<p>\r\n	<img src=\"/YaoLeGou/attached/image/20180913/20180913154639_905.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913154639_533.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913154639_954.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913154639_749.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913154639_714.jpg\" alt=\"\" />\r\n</p>\r\n<p>\r\n	<br />\r\n</p>\r\n<h1>\r\n	<span style=\"color:#E53333;background-color:#FFE500;\">瑶乐购创始人就是帅！！</span>\r\n</h1>', '2018-10-12 10:22:17', '3', '1');
INSERT INTO `shopinfo` VALUES ('20', '短袖T恤女2018新款夏装韩版百搭修身印花学生半袖白色体恤上衣女B8', '短袖T恤女2018新款夏装韩版百搭修身印花学生半袖白色体恤上衣女B8', '29.9', 'XX,XXXL,S', '白色,酒红色,姜黄色,灰色,藕粉色,黑色', '123456', '1', 'attached/image/20_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180913/20180913181623_556.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913181623_52.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913181624_915.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913181624_541.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913181624_986.jpg\" alt=\"\" />', '2018-10-12 10:16:27', '2', '1');
INSERT INTO `shopinfo` VALUES ('21', '欧乐鑫2018秋装新款加肥加大码女装卫衣女学生韩版上衣宽松胖mm长袖T恤', '欧乐鑫2018秋装新款加肥加大码女装卫衣女学生韩版上衣宽松胖mm长袖T恤', '69', 'L,2XL,M,XL', '白色,粉色', '123456', '1', 'attached/image/21_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180913/20180913190820_428.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913190820_755.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913190820_254.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913190820_824.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913190820_110.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913190820_871.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913190821_790.jpg\" alt=\"\" />', '2018-10-12 10:17:26', '0', '1');
INSERT INTO `shopinfo` VALUES ('22', '2018新款韩版短袖t恤女夏季常规款宽松百搭女装高含棉半袖上衣女士T恤衫 莎丞', '2018新款韩版短袖t恤女夏季常规款宽松百搭女装高含棉半袖上衣女士T恤衫 莎丞', '24.8', 'L,XXL,M,XL', '黄色,白色,红色', '123456', '1', 'attached/image/22_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180913/20180913191531_903.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913191532_257.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913191532_952.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913191532_583.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913191532_507.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913191532_620.jpg\" alt=\"\" />', '2018-10-12 12:39:47', '7', '1');
INSERT INTO `shopinfo` VALUES ('26', '茵曼2018春装新款纯棉v领花束刺绣文艺休闲T恤女长袖白色宽松上衣', '茵曼2018春装新款纯棉v领花束刺绣文艺休闲T恤女长袖白色宽松上衣', '139', 'L,M,XL,S', '白色,军绿', '123456', '1', 'attached/image/26_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180913/20180913210109_616.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913210109_992.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913210109_540.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913210109_776.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913210109_575.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913210109_538.jpg\" alt=\"\" />', '2018-10-12 13:39:19', '2', '1');
INSERT INTO `shopinfo` VALUES ('28', '幸福时光2018新款J8602春季新日系工装男脱卸宽松连帽外套夹克大码【bkbt】', '幸福时光2018新款J8602春季新日系工装男脱卸宽松连帽外套夹克大码【bkbt】', '188', 'M,L,XL,2XL,3XL,4XL,5XL', '黑色,红色', '123456', '1', 'attached/image/28_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180913/20180913211536_483.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211536_467.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211536_396.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211536_513.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211536_339.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211536_103.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211536_794.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211536_84.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211536_604.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211537_188.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211537_771.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211537_713.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211545_314.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211545_50.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211546_410.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211546_61.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211546_751.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211546_426.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211546_860.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211546_237.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211546_842.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211546_647.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211546_527.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913211546_133.jpg\" alt=\"\" />', '2018-10-12 10:17:21', '0', '1');
INSERT INTO `shopinfo` VALUES ('30', '幸福时光2018新款秋新款皮夹克韩版PU皮衣男装青少年修身机车皮外套潮薄9960【PPQ 12.08】', '幸福时光2018新款秋新款皮夹克韩版PU皮衣男装青少年修身机车皮外套潮薄9960【PPQ 12.08】', '198', 'M,L,XL,2XL,3XL,4XL', '黑色,土色', '123456', '1', 'attached/image/30_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180913/20180913212350_343.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_997.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_501.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_564.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_664.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_715.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_269.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_28.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_393.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_726.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_955.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_729.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180913/20180913212351_628.jpg\" alt=\"\" />', '2018-10-12 10:16:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('31', 'KC 2018夏季新款男士原创弹力九分裤男士休闲裤大码小脚裤运动裤小角裤学生裤子跑步裤', 'KC 2018夏季新款男士原创弹力九分裤男士休闲裤大码小脚裤运动裤小角裤学生裤子跑步裤', '79', 'XXX,S', '黑色,深灰色,浅灰色', '123456', '2', 'attached/image/31_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180914/20180914102219_621.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914102219_530.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914102219_101.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914102219_726.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914102219_115.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914102220_437.jpg\" alt=\"\" />', '2018-10-12 10:28:23', '0', '1');
INSERT INTO `shopinfo` VALUES ('32', 'UYUK新款男裤休闲男士束脚裤春夏季潮学生青少年运动裤大码时尚百搭运动裤', 'UYUK新款男裤休闲男士束脚裤春夏季潮学生青少年运动裤大码时尚百搭运动裤', '260', 'M,XXX,XXXL,XXL', '黑色', '123456', '2', 'attached/image/32_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180914/20180914103445_675.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914103445_454.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914103445_734.jpg\" alt=\"\" />', '2018-10-12 13:08:17', '7', '1');
INSERT INTO `shopinfo` VALUES ('33', '耐克（Nike）男鞋2018秋季新款男子网面透气运动鞋轻便减震舒适休闲跑步鞋812654-011', '耐克（Nike）男鞋2018秋季新款男子网面透气运动鞋轻便减震舒适休闲跑步鞋812654-011', '352', '39,40,40.5,41,42,42.4,43,44,44.5', '黑色', '123456', '3', 'attached/image/33_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180914/20180914144110_241.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144111_429.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144111_678.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144111_155.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144111_194.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144111_212.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144111_32.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144111_104.jpg\" alt=\"\" />', '2018-10-12 10:28:00', '0', '1');
INSERT INTO `shopinfo` VALUES ('34', '茵曼2018夏装新款百搭文艺范镂空花边修身短袖圆领T恤女恤衫上衣', '茵曼2018夏装新款百搭文艺范镂空花边修身短袖圆领T恤女恤衫上衣', '99', 'L,M,XL,S', '橙色,浅蓝色,白色', '123456', '1', 'attached/image/34_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180914/20180914144818_493.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144818_630.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144818_172.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144818_530.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144818_960.png\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_274.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_32.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_724.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_912.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_967.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_650.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_194.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_541.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_845.png\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_422.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180914/20180914144819_152.jpg\" alt=\"\" />', '2018-10-12 10:17:23', '0', '1');
INSERT INTO `shopinfo` VALUES ('35', '与牧慵懒风毛衣女开衫针织衫宽松2018秋冬新款韩版中长款针织外套6237', '与牧慵懒风毛衣女开衫针织衫宽松2018秋冬新款韩版中长款针织外套6237', '108', '均码', '米白色,红色,黑色', '123456', '1', 'attached/image/35_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918084321_535.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918084322_815.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918084322_733.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918084323_318.jpg\" alt=\"\" />', '2018-10-12 12:20:04', '0', '1');
INSERT INTO `shopinfo` VALUES ('36', '狮臣SHICHEN 2018年新款秋季长袖T恤男圆领韩版修身 T恤男 青年休闲百搭上衣T恤长袖男春秋装潮 t恤男', '狮臣SHICHEN 2018年新款秋季长袖T恤男圆领韩版修身 T恤男 青年休闲百搭上衣T恤长袖男春秋装潮 t恤男', '68', 'L,XXL,4XL,M,Xl,XXXL', '黑色,藏青,麻灰,白色,湖蓝', '123456', '1', 'attached/image/36_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918104722_806.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918104723_44.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918104724_140.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918104726_880.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918104727_481.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918104728_73.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918104729_298.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918104729_599.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('37', '与牧2018秋宽松羽绒棉马甲女学生冬短款韩版背心中长款坎肩小外套潮', '与牧2018秋宽松羽绒棉马甲女学生冬短款韩版背心中长款坎肩小外套潮', '59', 'L,2XL,4XL,M,XL,3XL,S', '白色,灰色,黑色', '123456', '1', 'attached/image/37_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918105536_595.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918105538_969.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918105559_673.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918105606_679.jpg\" alt=\"\" />', '2018-10-12 13:39:53', '44', '1');
INSERT INTO `shopinfo` VALUES ('39', 'X-MAN2018秋季新款女士夹克宽松上衣韩版刺绣棒球服百搭短外套女', 'X-MAN2018秋季新款女士夹克宽松上衣韩版刺绣棒球服百搭短外套女', '98', 'L,2XL,M,XL,S', '黑色', '123456', '1', 'attached/image/39_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918111245_316.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918111249_299.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918111315_483.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918111317_754.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918111318_871.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918111320_392.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918111320_940.jpg\" alt=\"\" />', '2018-10-12 13:39:19', '1', '1');
INSERT INTO `shopinfo` VALUES ('40', 'X-MAN2018秋季新款长袖T恤男港风条纹男士上衣', 'X-MAN2018秋季新款长袖T恤男港风条纹男士上衣', '69', 'M,L,XL,2XL,3XL,4XL,5XL', '白色,黑色,灰色', '123456', '1', 'attached/image/40_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918111813_772.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918111823_214.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918111824_535.jpg\" alt=\"\" />', '2018-10-12 13:06:24', '9', '1');
INSERT INTO `shopinfo` VALUES ('41', '与牧2018夏季新款韩版女装两件套条纹上衣高腰阔腿裤休闲显瘦时尚套装', '与牧2018夏季新款韩版女装两件套条纹上衣高腰阔腿裤休闲显瘦时尚套装', '69', 'XXL,L,M,XL,XXXL,S', '白色', '123456', '1', 'attached/image/41_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918112225_973.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112226_436.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112240_753.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112242_425.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112244_221.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112245_289.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112246_819.jpg\" alt=\"\" />', '2018-10-12 10:17:20', '0', '1');
INSERT INTO `shopinfo` VALUES ('42', '李维犀牛(LEEVIRHINO)2018新款加大码T恤长袖男青年秋冬款打底衫弹力上衣男', '李维犀牛(LEEVIRHINO)2018新款加大码T恤长袖男青年秋冬款打底衫弹力上衣男', '69', '2XL,3XL,4XL,5XL,6XL,7XL,8XL', '黑色', '123456', '1', 'attached/image/42_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918112750_207.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112755_572.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112758_832.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112759_913.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112759_97.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918112800_309.jpg\" alt=\"\" />', '2018-10-12 13:00:15', '1', '1');
INSERT INTO `shopinfo` VALUES ('43', '绅士空间(SENSIKJ)2018秋季新款小清新糖果色牛仔外套女韩版长袖宽松短款立领夹克', '绅士空间(SENSIKJ)2018秋季新款小清新糖果色牛仔外套女韩版长袖宽松短款立领夹克', '119', 'L,M,S', '黄色', '123456', '1', 'attached/image/43_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918113013_467.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113014_511.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113023_667.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113023_204.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113024_72.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113026_83.jpg\" alt=\"\" />', '2018-10-12 12:18:28', '1', '1');
INSERT INTO `shopinfo` VALUES ('44', 'VIISHOW2018夏季新款男士短袖T恤 圆领宽松韩版帅气上衣纯棉套头', 'VIISHOW2018夏季新款男士短袖T恤 圆领宽松韩版帅气上衣纯棉套头', '79', 'XL,XXL,XXXL,L,M', '白色', '123456', '1', 'attached/image/44_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918113244_296.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113248_298.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113254_714.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113304_61.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113313_848.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113315_931.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918113317_346.jpg\" alt=\"\" />', '2018-10-12 15:46:39', '1', '1');
INSERT INTO `shopinfo` VALUES ('45', '芷臻zhizhen风衣女装中长款2018新品韩版修身小矮个子秋季港味外套潮', '芷臻zhizhen风衣女装中长款2018新品韩版修身小矮个子秋季港味外套潮', '199', 'XXL,L,M,XL,XXXL', '焦糖色,藏青色,军绿色', '123456', '1', 'attached/image/45_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918114037_519.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918114056_813.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918114059_305.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918114129_557.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918114134_120.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918114136_368.jpg\" alt=\"\" />', '2018-10-12 15:30:24', '2', '1');
INSERT INTO `shopinfo` VALUES ('47', '幸福时光2018夏季新款半袖短袖T恤男士加肥大码宽松连帽上衣韩版潮流男装【bkbt】', '幸福时光2018夏季新款半袖短袖T恤男士加肥大码宽松连帽上衣韩版潮流男装【bkbt】', '79', 'M,L,XL,2XL,3XL,M100-135斤', '白色,黑色', '123456', '1', 'attached/image/47_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918114658_324.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918114707_953.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918114708_598.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918114709_689.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918114710_916.jpg\" alt=\"\" />', '2018-10-12 15:59:38', '12', '1');
INSERT INTO `shopinfo` VALUES ('48', '愫惠君加绒加厚2018秋装新款韩版ins超火套头外套长袖连帽卫衣', '愫惠君加绒加厚2018秋装新款韩版ins超火套头外套长袖连帽卫衣', '79', 'L,2XL,M,XL', '酒红色', '123456', '1', 'attached/image/48_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918115004_680.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115014_253.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115015_356.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115019_430.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115020_273.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115020_551.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115021_743.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '2', '1');
INSERT INTO `shopinfo` VALUES ('49', '古仕卡特2018春季新款灯芯绒小脚休闲裤男士加肥大码运动裤韩版潮流男裤子', '古仕卡特2018春季新款灯芯绒小脚休闲裤男士加肥大码运动裤韩版潮流男裤子', '118', 'M,L,XL,2XL,3XL,4XL,5XL', '黑色,深灰色', '123456', '2', 'attached/image/49_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918115524_69.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115531_750.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115709_971.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115724_233.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115759_958.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918115812_736.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '4', '1');
INSERT INTO `shopinfo` VALUES ('50', '法国品牌芭步仕Burbupps男鞋2018秋尚新小白鞋男运动休闲鞋子男透气网纱韩版潮流网面运动板鞋', '法国品牌芭步仕Burbupps男鞋2018秋尚新小白鞋男运动休闲鞋子男透气网纱韩版潮流网面运动板鞋', '139', '43,44,45,39,41,42,40', '黑色,红色', '123456', '3', 'attached/image/50_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918120421_652.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120437_524.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120440_69.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120441_22.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120449_896.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120451_860.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120453_841.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120508_606.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('51', '与牧裤子女2018秋冬韩版阔腿裤新款休闲裤直筒裤宽松金丝绒大码运动裤', '与牧裤子女2018秋冬韩版阔腿裤新款休闲裤直筒裤宽松金丝绒大码运动裤', '98', 'XXL,L,M,XL,S', '天鹅蓝,典雅黑', '123456', '2', 'attached/image/51_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918120947_376.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120948_883.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120948_754.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120949_938.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918120949_414.jpg\" alt=\"\" />', '2018-10-12 11:29:06', '1', '1');
INSERT INTO `shopinfo` VALUES ('62', '与牧2018秋装新款牛仔裤女破洞紧身小脚薄款九分裤韩版显瘦铅笔裤', '与牧2018秋装新款牛仔裤女破洞紧身小脚薄款九分裤韩版显瘦铅笔裤', '89', '27,28,26,29,30,31,32', '浅蓝色,深蓝色', '123456', '2', 'attached/image/62_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918164615_297.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164626_353.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164626_631.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164627_705.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164627_326.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164627_977.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164628_390.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164628_395.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164629_957.jpg\" alt=\"\" />', '2018-10-12 13:08:17', '1', '1');
INSERT INTO `shopinfo` VALUES ('63', '纳雷蒙尼2018男士休闲裤男装春季季新款男士修身长裤子韩版商务休闲裤直筒裤', '纳雷蒙尼2018男士休闲裤男装春季季新款男士修身长裤子韩版商务休闲裤直筒裤', '98', '28,29,30,31,32,33,34,36,38', '黑色', '123456', '2', 'attached/image/63_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918164925_157.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164934_767.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164935_916.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164935_217.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164936_859.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918164937_186.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('64', '与牧2018秋季新款韩版弹力牛仔裤女高腰修身显瘦卷边小脚铅笔裤', '与牧2018秋季新款韩版弹力牛仔裤女高腰修身显瘦卷边小脚铅笔裤', '89', '27,28,29,30,31,32', '浅蓝色,黑色', '123456', '2', 'attached/image/64_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918165151_780.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165204_163.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165207_128.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165207_758.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165209_159.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165211_515.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165213_889.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('65', '夏季运动裤小脚港风修身九分裤男士裤子韩版潮流宽松休闲裤男', '夏季运动裤小脚港风修身九分裤男士裤子韩版潮流宽松休闲裤男', '89', 'M,L,XL,XXL,XXXL,4XL,5XL,', '黑色', '123456', '2', 'attached/image/65_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918165404_167.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165412_744.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165414_961.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165414_674.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165415_277.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '1', '1');
INSERT INTO `shopinfo` VALUES ('66', '班俏BANQIAO牛仔裤女秋季2018新款韩版学生chic高腰紧身小脚裤显瘦铅笔长裤子潮', '班俏BANQIAO牛仔裤女秋季2018新款韩版学生chic高腰紧身小脚裤显瘦铅笔长裤子潮', '108', '27,28,29,30,31,32', '黑灰色,深蓝', '123456', '2', 'attached/image/66_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918165607_336.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165619_787.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165620_467.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165620_416.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165623_664.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165623_646.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165623_222.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165626_560.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165626_591.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '7', '1');
INSERT INTO `shopinfo` VALUES ('67', '九分裤男百搭修身小脚bf休闲裤夏季薄款宽松韩版潮流哈伦运动裤子2018', '九分裤男百搭修身小脚bf休闲裤夏季薄款宽松韩版潮流哈伦运动裤子2018', '99', 'M,L,XL,XXL,XXXL', '黑色,灰色', '123456', '2', 'attached/image/67_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918165805_85.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165824_455.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165826_283.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165826_313.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918165827_970.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '1', '1');
INSERT INTO `shopinfo` VALUES ('68', '与牧2018秋装韩版新款休闲弹力修身毛边小脚牛仔裤女长裤秋装', '与牧2018秋装韩版新款休闲弹力修身毛边小脚牛仔裤女长裤秋装', '79', '27,28,29,30,31,32', '经典黑,烟灰色,标准蓝', '123456', '2', 'attached/image/68_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918170027_74.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170036_208.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170036_518.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170037_670.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170037_685.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170038_972.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170038_699.jpg\" alt=\"\" />', '2018-10-12 13:16:18', '2', '1');
INSERT INTO `shopinfo` VALUES ('69', 'X-MAN2018秋季新款男士休闲裤韩版多口袋工装裤男宽松休闲裤小脚哈伦束脚裤', 'X-MAN2018秋季新款男士休闲裤韩版多口袋工装裤男宽松休闲裤小脚哈伦束脚裤', '109', 'M,L,XL,XXL,XXXL', '米白色,黑色军,绿色', '123456', '2', 'attached/image/69_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918170343_726.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170354_127.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170355_733.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170356_428.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170357_630.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170359_445.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170400_810.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('70', '愫惠君破洞牛仔裤女九分裤韩版潮宽松显瘦2018秋季新款学生百搭乞丐裤', '愫惠君破洞牛仔裤女九分裤韩版潮宽松显瘦2018秋季新款学生百搭乞丐裤', '89', '27,28,29,30,31,32', '蓝色', '123456', '2', 'attached/image/70_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918170646_430.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170654_975.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170654_762.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170654_469.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170655_835.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('71', '【买一送一，88元共两件】2018春秋新款休闲裤男修身薄九分裤百搭韩版潮流裤子大码运动裤初秋百搭拼色男裤', '【买一送一，88元共两件】2018春秋新款休闲裤男修身薄九分裤百搭韩版潮流裤子大码运动裤初秋百搭拼色男裤', '78', 'M,L,XL,XXL,3XL,4XL,5XL', '绿色,黑色,白色', '123456', '2', 'attached/image/71_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918170838_270.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170848_547.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170849_603.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170849_286.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918170850_119.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('72', '2017春夏韩版黑色微喇叭九分牛仔裤女不规则流苏毛边阔腿裤潮', '2017春夏韩版黑色微喇叭九分牛仔裤女不规则流苏毛边阔腿裤潮', '26', '27,28,29,30,31', '一杆,白线,黑色', '123456', '2', 'attached/image/72_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918171100_416.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171100_343.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171100_830.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171101_565.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171101_980.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '1', '1');
INSERT INTO `shopinfo` VALUES ('73', 'X-MAN2018秋冬新款韩版潮流九分运动裤秋季薄款宽松学生哈伦休闲裤', 'X-MAN2018秋冬新款韩版潮流九分运动裤秋季薄款宽松学生哈伦休闲裤', '98', 'M,L,XL,2XL,3XL,4XL,5XL', '白色,黑色,灰色,蓝色', '123456', '2', 'attached/image/73_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918171300_18.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171309_530.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171309_862.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171310_227.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171310_235.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171310_362.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171311_932.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918171311_986.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('77', '班俏BANQIAO破洞潮牛仔裤女绑带紧身小脚2018新款韩版显瘦九分裤铅笔裤', '班俏BANQIAO破洞潮牛仔裤女绑带紧身小脚2018新款韩版显瘦九分裤铅笔裤', '108', 'L,M,S,XL', '浅蓝色,黑色', '123456', '2', 'attached/image/77_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918172427_735.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('78', '法国品牌芭步仕(Burbupps)2018秋尚新男鞋ins超火的鞋子透气网面运动鞋韩版潮流休闲小白鞋男百搭', '法国品牌芭步仕(Burbupps)2018秋尚新男鞋ins超火的鞋子透气网面运动鞋韩版潮流休闲小白鞋男百搭', '259', '39,40,41,42,43', '白色,黑色', '123456', '3', 'attached/image/78_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918172641_820.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918172641_63.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918172642_968.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918172643_876.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918172643_780.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918172644_505.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918172645_615.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918172646_110.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918172647_86.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918172647_456.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918172648_194.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('80', 'X-MAN女鞋2018秋季透气网面跑步鞋韩版百搭运动休闲鞋女轻便圆头平底鞋', 'X-MAN女鞋2018秋季透气网面跑步鞋韩版百搭运动休闲鞋女轻便圆头平底鞋', '118', '35,36,37,38,39,40', '银色,粉色', '123456', '3', 'attached/image/80_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918172957_474.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173006_502.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173008_815.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173008_911.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173010_104.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173011_169.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173012_919.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173012_660.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173014_788.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173016_919.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173017_670.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173018_337.jpg\" alt=\"\" />', '2018-10-12 11:52:18', '1', '1');
INSERT INTO `shopinfo` VALUES ('81', '花花公子/PLAYBOY男鞋秋冬季男士运动休闲鞋保暖皮鞋青年板鞋男韩版鞋子男', '花花公子/PLAYBOY男鞋秋冬季男士运动休闲鞋保暖皮鞋青年板鞋男韩版鞋子男', '198', '38,39,40,41,42,43,44', '白色,黑色', '123456', '3', 'attached/image/81_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918173218_649.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173218_661.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173219_595.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173219_571.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173220_856.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173220_164.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173221_722.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173222_8.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173222_939.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('82', '百慕爱BAIMUAI单鞋女秋季韩版女鞋休闲鞋学生平底板鞋内增高圆头低跟(1-3厘米)小白鞋系带运动鞋', '百慕爱BAIMUAI单鞋女秋季韩版女鞋休闲鞋学生平底板鞋内增高圆头低跟(1-3厘米)小白鞋系带运动鞋', '69', '35,36,37,38,39,40', '黑白色,粉色', '123456', '3', 'attached/image/82_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918173428_678.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173429_961.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173429_777.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173430_771.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173432_670.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173433_471.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173434_320.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('83', 'X-MAN2018新款鞋子真皮 豆豆鞋 男 韩版百搭潮流懒人鞋透气休闲鞋', 'X-MAN2018新款鞋子真皮 豆豆鞋 男 韩版百搭潮流懒人鞋透气休闲鞋', '179', '38,39,40,41,42,43,44', '黑色,军绿色,卡其色,咖啡色,红色', '123456', '3', 'attached/image/83_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918173643_673.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173652_939.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173653_191.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173653_335.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173656_630.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173657_285.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173657_755.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173659_791.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173659_904.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918173700_389.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('84', '【品牌定制 原装直邮】法国品牌PORIFF宝丽芙ins超火的鞋子夏季新款运动鞋女韩版透气原宿百搭老爹鞋女', '【品牌定制 原装直邮】法国品牌PORIFF宝丽芙ins超火的鞋子夏季新款运动鞋女韩版透气原宿百搭老爹鞋女', '159', '35,36,37,38,39,40', '红色,黄色', '123456', '3', 'attached/image/84_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180918/20180918174033_625.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918174043_388.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918174044_542.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918174044_392.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918174045_813.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918174045_597.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918174045_153.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918174046_574.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918174047_860.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180918/20180918174047_81.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('85', '英伦班纳（ENLEN&BENNA）秋上新款悟道2圆头老爹鞋男国潮超火鞋韩版夏季透气网超纤原宿运动休闲鞋', '英伦班纳（ENLEN&BENNA）秋上新款悟道2圆头老爹鞋男国潮超火鞋韩版夏季透气网超纤原宿运动休闲鞋', '98', '39,40,41,42,43,44', '蓝绿色,白色,黑色,灰色', '123456', '3', 'attached/image/85_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920083636_864.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920083652_664.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920083658_234.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920083707_819.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920083712_438.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920083801_664.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920083919_700.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920083927_317.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920083934_385.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084018_844.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('86', 'CAMEL骆驼女鞋 2018新款休闲鞋运动板鞋女韩版百搭ulzzang中跟小白鞋', 'CAMEL骆驼女鞋 2018新款休闲鞋运动板鞋女韩版百搭ulzzang中跟小白鞋', '249', '35,36,37,38,39,40', '白色,黑色', '123456', '3', 'attached/image/86_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920084500_519.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084510_706.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084512_541.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084513_516.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084513_995.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084514_211.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084515_243.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '9', '1');
INSERT INTO `shopinfo` VALUES ('87', '策霸CEBA2018秋季上新男款商务休闲鞋英伦猪皮内里男鞋透气青年男士鞋子时尚韩版板鞋', '策霸CEBA2018秋季上新男款商务休闲鞋英伦猪皮内里男鞋透气青年男士鞋子时尚韩版板鞋', '79', '43,38,44,37,39,41,42', '黑色', '123456', '3', 'attached/image/87_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920084844_744.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084857_921.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084858_192.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084859_398.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084900_438.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084903_590.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084905_62.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084908_666.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920084909_176.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '3', '1');
INSERT INTO `shopinfo` VALUES ('89', 'Camel小白鞋女2018新款百搭韩版骆驼女鞋秋季透气休闲鞋子平底单鞋女潮', 'Camel小白鞋女2018新款百搭韩版骆驼女鞋秋季透气休闲鞋子平底单鞋女潮', '156', '35,36,37,38,39,40', '白黄,白绿', '123456', '3', 'attached/image/89_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920085129_691.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085158_39.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085211_551.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085543_91.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085550_432.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085550_72.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085551_942.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '10', '1');
INSERT INTO `shopinfo` VALUES ('90', '凡世界 2018秋季新款透气男鞋休闲鞋男士运动鞋板鞋韩版驾车布鞋商务布鞋单鞋', '凡世界 2018秋季新款透气男鞋休闲鞋男士运动鞋板鞋韩版驾车布鞋商务布鞋单鞋', '29.9', '38,39,40,41,42', '白底男鞋,黑底男鞋', '123456', '3', 'attached/image/90_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920085808_557.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085809_710.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085809_104.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085812_481.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085814_317.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085815_147.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085816_764.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085817_375.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920085818_666.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('91', '红蜻蜓(REDDRAGONFLY) 女鞋2018秋新款真皮韩版单鞋休闲内增高小白鞋女乐福鞋子', '红蜻蜓(REDDRAGONFLY) 女鞋2018秋新款真皮韩版单鞋休闲内增高小白鞋女乐福鞋子', '269', '34,35,36,37,38,39', '白色,黑色,粉色', '123456', '3', 'attached/image/91_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920090115_573.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090124_614.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090142_245.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090147_657.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090202_952.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090210_605.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090213_663.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '3', '1');
INSERT INTO `shopinfo` VALUES ('92', '英伦班纳（ENLEN&BENNA）2018夏季新款圆头系带男士运动休闲鞋 男韩版百搭跑步男鞋透气板鞋网纱网布时尚男鞋', '英伦班纳（ENLEN&BENNA）2018夏季新款圆头系带男士运动休闲鞋 男韩版百搭跑步男鞋透气板鞋网纱网布时尚男鞋', '29.9', '38,39,40,41,42,43', '白色,黑色,灰色', '123456', '3', 'attached/image/92_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920090512_802.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090522_951.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090526_464.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090529_131.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090530_67.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090537_326.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090537_384.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090544_544.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090549_616.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '4', '1');
INSERT INTO `shopinfo` VALUES ('93', 'Camel骆驼女鞋 2018秋季新款 运动休闲拼接系带厚底韩版时尚松糕底休闲鞋女 中跟(3-5厘米)', 'Camel骆驼女鞋 2018秋季新款 运动休闲拼接系带厚底韩版时尚松糕底休闲鞋女 中跟(3-5厘米)', '214', '35,36,37,38,39,40', '米色', '123456', '3', 'attached/image/93_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920090741_340.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090806_378.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090810_49.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090815_689.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090818_374.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090820_393.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090823_703.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920090825_532.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('94', '太子龍活力（太子龙TEDELONENERGY）2018秋上新款超火的嘻哈百搭夏季男鞋透气高帮运动韩版国潮鞋休闲板鞋', '太子龍活力（太子龙TEDELONENERGY）2018秋上新款超火的嘻哈百搭夏季男鞋透气高帮运动韩版国潮鞋休闲板鞋', '59', '39,40,41,42,43', '白色,黑白色,米色', '123456', '3', 'attached/image/94_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920090955_29.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091006_474.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091009_496.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091013_887.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091014_560.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091015_797.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091015_752.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091016_994.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('95', '红蜻蜓(REDDRAGONFLY) 女鞋2018秋季新款休闲鞋韩版百搭学生平底小白鞋女单鞋乐福鞋子', '红蜻蜓(REDDRAGONFLY) 女鞋2018秋季新款休闲鞋韩版百搭学生平底小白鞋女单鞋乐福鞋子', '189', '35,36,37,38,39', '白色', '123456', '3', 'attached/image/95_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920091156_419.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091208_566.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091208_198.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091209_774.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091210_220.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091210_455.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091211_456.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091211_412.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091211_351.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091212_471.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('96', '【官方正品 品牌直营】ORCCISEM奥驰森 2018秋季新款男鞋韩版潮流百搭轻便减震跑步鞋男士运动休闲鞋潮鞋子', '【官方正品 品牌直营】ORCCISEM奥驰森 2018秋季新款男鞋韩版潮流百搭轻便减震跑步鞋男士运动休闲鞋潮鞋子', '158', '39,40,41,42,43,44', '红色,白色,黑色,黄色', '123456', '3', 'attached/image/96_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920091414_395.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091426_963.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091429_588.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091430_336.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091432_212.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091433_935.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091433_276.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091437_257.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091437_592.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('97', 'SANJOE赏爵春季新品韩版百搭休闲鞋女平底鞋女圆头系带小白鞋女板鞋舒适内增高鞋松糕鞋单鞋女低跟中跟(3-5厘米)女鞋', 'SANJOE赏爵春季新品韩版百搭休闲鞋女平底鞋女圆头系带小白鞋女板鞋舒适内增高鞋松糕鞋单鞋女低跟中跟(3-5厘米)女鞋', '128', '35,36,37,38,39,40', '红色,黑色', '123456', '3', 'attached/image/97_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920091649_787.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091703_649.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091704_612.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091711_30.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091711_532.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920091712_262.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('98', '古仕卡特GUSSKATER2018秋冬新款灯芯绒夹克衫男士加肥加大码修身字母刺绣外套韩版青年上衣潮男装【GPF】', '古仕卡特GUSSKATER2018秋冬新款灯芯绒夹克衫男士加肥加大码修身字母刺绣外套韩版青年上衣潮男装【GPF】', '118', 'L,XL,XXXL,M', '灰色,深棕色,卡其色', '123456', '1', 'attached/image/98_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920114224_692.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114230_764.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114231_4.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114232_934.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114233_964.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '11', '1');
INSERT INTO `shopinfo` VALUES ('99', '古仕卡特2018秋冬新款帅气棒球服夹克男士加肥大码休闲连帽外套韩版潮男装DS26【BT】', '古仕卡特2018秋冬新款帅气棒球服夹克男士加肥大码休闲连帽外套韩版潮男装DS26【BT】', '168', ' M,L,XL,XXL,XXXL', '黑色,彩蓝,皮红', '123456', '1', 'attached/image/99_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920114436_132.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114443_291.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114459_110.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114502_438.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114519_452.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114522_850.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');
INSERT INTO `shopinfo` VALUES ('100', '型男大师 2018秋冬新款青年韩版休闲男士外套夹克潮流上衣', '型男大师 2018秋冬新款青年韩版休闲男士外套夹克潮流上衣', '138', ' M,L,XL,XXL,XXXL', '红色,卡其色,黑色,皮粉色', '123456', '1', 'attached/image/100_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920114706_285.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114714_933.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114716_426.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114718_464.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114719_895.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114720_688.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '11', '1');
INSERT INTO `shopinfo` VALUES ('101', '男装2018秋冬男士外套韩版修身学生男士长袖夹克拉链衫衣服上衣男', '男装2018秋冬男士外套韩版修身学生男士长袖夹克拉链衫衣服上衣男', '158', 'L,XXL,M,XL', '黑色,咖啡色,卡其色', '123456', '1', 'attached/image/101_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920114929_454.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114937_67.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114940_757.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114942_814.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114944_560.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114946_241.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920114947_626.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '3', '1');
INSERT INTO `shopinfo` VALUES ('102', '愫惠君雪纺衬衫女长袖2018秋季新款修身打底衬衣韩版大码上衣', '愫惠君雪纺衬衫女长袖2018秋季新款修身打底衬衣韩版大码上衣', '89', 'L,XXL,M,XL,S', '白色', '123456', '1', 'attached/image/102_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920120728_706.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920120733_856.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920120734_727.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920120734_209.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920120735_628.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920120735_683.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920120735_994.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '5', '1');
INSERT INTO `shopinfo` VALUES ('104', '【漫倪纷】【秋季新款】秋装新款大码卡通刺绣宽松短袖T恤女韩版百搭上衣', '【漫倪纷】【秋季新款】秋装新款大码卡通刺绣宽松短袖T恤女韩版百搭上衣', '99', 'M,L,XL,2XL', '白色,粉红色,黑色,浅绿色,卡其色', '000000', '1', 'attached/image/104_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920201017_13.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201017_199.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201017_601.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201017_295.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201017_105.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201017_983.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201017_200.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201017_720.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201018_904.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201018_260.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201018_88.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201018_679.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201018_742.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920201018_402.jpg\" alt=\"\" />', '2018-10-12 13:41:04', '37', '1');
INSERT INTO `shopinfo` VALUES ('105', '贰零一捌款韩版女装蓝白条纹T恤女夏宽松学生短袖上衣纯棉海军风半袖女t', '贰零一捌款韩版女装蓝白条纹T恤女夏宽松学生短袖上衣纯棉海军风半袖女t', '83', 'M,L', '蓝白条纹,黑白条纹', '123456', '1', 'attached/image/105_fengmian.jpg', '<p>\r\n	<img src=\"/YaoLeGou/attached/image/20180920/20180920202648_335.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920202648_910.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920202744_632.jpg\" alt=\"\" /><img src=\"http://localhost:8080/YaoLeGou/attached/image/20180920/20180920202744_360.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203059_584.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203059_116.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203146_652.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203218_750.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203245_307.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203359_715.jpg\" alt=\"\" />\r\n</p>\r\n<p>\r\n	<br />\r\n</p>\r\n<p>\r\n	<img src=\"/YaoLeGou/attached/image/20180920/20180920203728_597.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203750_699.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203826_64.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203846_383.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203846_126.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203846_444.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203846_131.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203846_941.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920203846_641.jpg\" alt=\"\" />\r\n</p>', '2018-10-12 09:52:29', '8', '1');
INSERT INTO `shopinfo` VALUES ('106', '【童瑶自营】休闲鞋 女2018春夏甜美板鞋女百搭小白鞋女学生磨砂皮中跟(3-5厘米)女鞋', '【童瑶自营】休闲鞋 女2018春夏甜美板鞋女百搭小白鞋女学生磨砂皮中跟(3-5厘米)女鞋', '82', '35码,36码,37码,38码,39码,40码', '黑色,红色', '123456', '3', 'attached/image/106_fengmian.jpg', '<img src=\"/YaoLeGou/attached/image/20180920/20180920234458_960.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920234458_985.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920234458_97.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920234458_468.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920234458_430.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920234458_718.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920234458_553.jpg\" alt=\"\" /><img src=\"/YaoLeGou/attached/image/20180920/20180920234458_152.jpg\" alt=\"\" />', '2018-10-12 09:52:29', '0', '1');

-- ----------------------------
-- Table structure for `shopmingxi`
-- ----------------------------
DROP TABLE IF EXISTS `shopmingxi`;
CREATE TABLE `shopmingxi` (
  `ShopId` int(11) NOT NULL COMMENT '商品id',
  `SImg` varchar(9999) NOT NULL COMMENT '商品小图',
  `BImg` varchar(9999) NOT NULL COMMENT '商品大图'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopmingxi
-- ----------------------------
INSERT INTO `shopmingxi` VALUES ('1', 'attached/image/s1.jpg', 'attached/image/b1.jpg');
INSERT INTO `shopmingxi` VALUES ('1', 'attached/image/s2.jpg', 'attached/image/b2.jpg');
INSERT INTO `shopmingxi` VALUES ('2', 'attached/image/2_default_1.jpg', 'attached/image/2_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('2', 'attached/image/2_default_2.jpg', 'attached/image/2_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('2', 'attached/image/2_default_3.jpg', 'attached/image/2_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('2', 'attached/image/2_default_4.jpg', 'attached/image/2_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('2', 'attached/image/2_default_5.jpg', 'attached/image/2_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('2', 'attached/image/2_default_6.jpg', 'attached/image/2_default_6.jpg');
INSERT INTO `shopmingxi` VALUES ('18', 'attached/image/18_default_1.jpg', 'attached/image/18_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('18', 'attached/image/18_default_2.jpg', 'attached/image/18_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('18', 'attached/image/18_default_3.jpg', 'attached/image/18_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('18', 'attached/image/18_default_4.jpg', 'attached/image/18_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('18', 'attached/image/18_default_5.jpg', 'attached/image/18_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('18', 'attached/image/18_default_6.jpg', 'attached/image/18_default_6.jpg');
INSERT INTO `shopmingxi` VALUES ('19', 'attached/image/19_default_1.jpg', 'attached/image/19_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('19', 'attached/image/19_default_2.jpg', 'attached/image/19_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('19', 'attached/image/19_default_3.jpg', 'attached/image/19_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('19', 'attached/image/19_default_4.jpg', 'attached/image/19_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('19', 'attached/image/19_default_5.jpg', 'attached/image/19_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('19', 'attached/image/19_default_6.jpg', 'attached/image/19_default_6.jpg');
INSERT INTO `shopmingxi` VALUES ('20', 'attached/image/20_default_1.jpg', 'attached/image/20_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('20', 'attached/image/20_default_2.jpg', 'attached/image/20_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('20', 'attached/image/20_default_3.jpg', 'attached/image/20_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('20', 'attached/image/20_default_4.jpg', 'attached/image/20_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('20', 'attached/image/20_default_5.jpg', 'attached/image/20_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('20', 'attached/image/20_default_6.jpg', 'attached/image/20_default_6.jpg');
INSERT INTO `shopmingxi` VALUES ('20', 'attached/image/20_default_7.jpg', 'attached/image/20_default_7.jpg');
INSERT INTO `shopmingxi` VALUES ('20', 'attached/image/20_default_8.jpg', 'attached/image/20_default_8.jpg');
INSERT INTO `shopmingxi` VALUES ('21', 'attached/image/21_default_1.jpg', 'attached/image/21_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('21', 'attached/image/21_default_2.jpg', 'attached/image/21_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('21', 'attached/image/21_default_3.jpg', 'attached/image/21_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('21', 'attached/image/21_default_4.jpg', 'attached/image/21_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('21', 'attached/image/21_default_5.jpg', 'attached/image/21_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('21', 'attached/image/21_default_6.jpg', 'attached/image/21_default_6.jpg');
INSERT INTO `shopmingxi` VALUES ('21', 'attached/image/21_default_7.jpg', 'attached/image/21_default_7.jpg');
INSERT INTO `shopmingxi` VALUES ('21', 'attached/image/21_default_8.jpg', 'attached/image/21_default_8.jpg');
INSERT INTO `shopmingxi` VALUES ('22', 'attached/image/22_default_1.jpg', 'attached/image/22_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('22', 'attached/image/22_default_2.jpg', 'attached/image/22_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('22', 'attached/image/22_default_3.jpg', 'attached/image/22_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('22', 'attached/image/22_default_4.jpg', 'attached/image/22_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('22', 'attached/image/22_default_5.jpg', 'attached/image/22_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('22', 'attached/image/22_default_6.jpg', 'attached/image/22_default_6.jpg');
INSERT INTO `shopmingxi` VALUES ('26', 'attached/image/26_default_1.jpg', 'attached/image/26_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('26', 'attached/image/26_default_2.jpg', 'attached/image/26_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('26', 'attached/image/26_default_3.jpg', 'attached/image/26_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('26', 'attached/image/26_default_4.jpg', 'attached/image/26_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('28', 'attached/image/28_default_1.jpg', 'attached/image/28_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('28', 'attached/image/28_default_2.jpg', 'attached/image/28_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('28', 'attached/image/28_default_3.jpg', 'attached/image/28_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('28', 'attached/image/28_default_4.jpg', 'attached/image/28_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('30', 'attached/image/30_default_1.jpg', 'attached/image/30_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('30', 'attached/image/30_default_2.jpg', 'attached/image/30_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('30', 'attached/image/30_default_3.jpg', 'attached/image/30_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('30', 'attached/image/30_default_4.jpg', 'attached/image/30_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('31', 'attached/image/31_default_1.jpg', 'attached/image/31_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('31', 'attached/image/31_default_2.jpg', 'attached/image/31_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('31', 'attached/image/31_default_3.jpg', 'attached/image/31_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('31', 'attached/image/31_default_4.jpg', 'attached/image/31_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('31', 'attached/image/31_default_5.jpg', 'attached/image/31_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('31', 'attached/image/31_default_6.jpg', 'attached/image/31_default_6.jpg');
INSERT INTO `shopmingxi` VALUES ('32', 'attached/image/32_default_1.jpg', 'attached/image/32_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('32', 'attached/image/32_default_2.jpg', 'attached/image/32_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('32', 'attached/image/32_default_3.jpg', 'attached/image/32_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('32', 'attached/image/32_default_4.jpg', 'attached/image/32_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('33', 'attached/image/33_default_1.jpg', 'attached/image/33_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('33', 'attached/image/33_default_2.jpg', 'attached/image/33_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('33', 'attached/image/33_default_3.jpg', 'attached/image/33_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('33', 'attached/image/33_default_4.jpg', 'attached/image/33_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('33', 'attached/image/33_default_5.jpg', 'attached/image/33_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('34', 'attached/image/34_default_1.jpg', 'attached/image/34_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('34', 'attached/image/34_default_2.jpg', 'attached/image/34_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('34', 'attached/image/34_default_3.jpg', 'attached/image/34_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('34', 'attached/image/34_default_4.jpg', 'attached/image/34_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('34', 'attached/image/34_default_5.jpg', 'attached/image/34_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('35', 'attached/image/35_default_1.jpg', 'attached/image/35_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('35', 'attached/image/35_default_2.jpg', 'attached/image/35_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('35', 'attached/image/35_default_3.jpg', 'attached/image/35_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('35', 'attached/image/35_default_4.jpg', 'attached/image/35_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('35', 'attached/image/35_default_5.jpg', 'attached/image/35_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('36', 'attached/image/36_default_1.jpg', 'attached/image/36_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('36', 'attached/image/36_default_2.jpg', 'attached/image/36_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('36', 'attached/image/36_default_3.jpg', 'attached/image/36_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('37', 'attached/image/37_default_1.jpg', 'attached/image/37_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('37', 'attached/image/37_default_2.jpg', 'attached/image/37_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('38', 'attached/image/38_default_1.jpg', 'attached/image/38_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('38', 'attached/image/38_default_2.jpg', 'attached/image/38_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('38', 'attached/image/38_default_3.jpg', 'attached/image/38_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('39', 'attached/image/39_default_1.jpg', 'attached/image/39_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('39', 'attached/image/39_default_2.jpg', 'attached/image/39_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('39', 'attached/image/39_default_3.jpg', 'attached/image/39_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('39', 'attached/image/39_default_4.jpg', 'attached/image/39_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('39', 'attached/image/39_default_5.jpg', 'attached/image/39_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('40', 'attached/image/40_default_1.jpg', 'attached/image/40_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('40', 'attached/image/40_default_2.jpg', 'attached/image/40_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('40', 'attached/image/40_default_3.jpg', 'attached/image/40_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('40', 'attached/image/40_default_4.jpg', 'attached/image/40_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('41', 'attached/image/41_default_1.jpg', 'attached/image/41_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('41', 'attached/image/41_default_2.jpg', 'attached/image/41_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('41', 'attached/image/41_default_3.jpg', 'attached/image/41_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('41', 'attached/image/41_default_4.jpg', 'attached/image/41_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('42', 'attached/image/42_default_1.jpg', 'attached/image/42_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('42', 'attached/image/42_default_2.jpg', 'attached/image/42_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('43', 'attached/image/43_default_1.jpg', 'attached/image/43_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('43', 'attached/image/43_default_2.jpg', 'attached/image/43_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('44', 'attached/image/44_default_1.jpg', 'attached/image/44_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('44', 'attached/image/44_default_2.jpg', 'attached/image/44_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('45', 'attached/image/45_default_1.jpg', 'attached/image/45_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('45', 'attached/image/45_default_2.jpg', 'attached/image/45_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('45', 'attached/image/45_default_3.jpg', 'attached/image/45_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('46', 'attached/image/46_default_1.jpg', 'attached/image/46_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('46', 'attached/image/46_default_2.jpg', 'attached/image/46_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('47', 'attached/image/47_default_1.jpg', 'attached/image/47_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('47', 'attached/image/47_default_2.jpg', 'attached/image/47_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('47', 'attached/image/47_default_3.jpg', 'attached/image/47_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('48', 'attached/image/48_default_1.jpg', 'attached/image/48_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('48', 'attached/image/48_default_2.jpg', 'attached/image/48_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('48', 'attached/image/48_default_3.jpg', 'attached/image/48_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('49', 'attached/image/49_default_1.jpg', 'attached/image/49_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('49', 'attached/image/49_default_2.jpg', 'attached/image/49_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('50', 'attached/image/50_default_1.jpg', 'attached/image/50_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('50', 'attached/image/50_default_2.jpg', 'attached/image/50_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('50', 'attached/image/50_default_3.jpg', 'attached/image/50_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('50', 'attached/image/50_default_4.jpg', 'attached/image/50_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('50', 'attached/image/50_default_5.jpg', 'attached/image/50_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('51', 'attached/image/51_default_1.jpg', 'attached/image/51_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('51', 'attached/image/51_default_2.jpg', 'attached/image/51_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('52', 'attached/image/52_default_1.jpg', 'attached/image/52_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('52', 'attached/image/52_default_2.jpg', 'attached/image/52_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('54', 'attached/image/54_default_1.jpg', 'attached/image/54_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('54', 'attached/image/54_default_2.jpg', 'attached/image/54_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('55', 'attached/image/55_default_1.jpg', 'attached/image/55_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('55', 'attached/image/55_default_2.jpg', 'attached/image/55_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('56', 'attached/image/56_default_1.jpg', 'attached/image/56_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('56', 'attached/image/56_default_2.jpg', 'attached/image/56_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('57', 'attached/image/57_default_1.jpg', 'attached/image/57_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('57', 'attached/image/57_default_2.jpg', 'attached/image/57_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('58', 'attached/image/58_default_1.jpg', 'attached/image/58_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('58', 'attached/image/58_default_2.jpg', 'attached/image/58_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('59', 'attached/image/59_default_1.jpg', 'attached/image/59_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('59', 'attached/image/59_default_2.jpg', 'attached/image/59_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('60', 'attached/image/60_default_1.jpg', 'attached/image/60_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('60', 'attached/image/60_default_2.jpg', 'attached/image/60_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('61', 'attached/image/61_default_1.jpg', 'attached/image/61_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('61', 'attached/image/61_default_2.jpg', 'attached/image/61_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('62', 'attached/image/62_default_1.jpg', 'attached/image/62_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('62', 'attached/image/62_default_2.jpg', 'attached/image/62_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('63', 'attached/image/63_default_1.jpg', 'attached/image/63_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('63', 'attached/image/63_default_2.jpg', 'attached/image/63_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('63', 'attached/image/63_default_3.jpg', 'attached/image/63_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('64', 'attached/image/64_default_1.jpg', 'attached/image/64_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('64', 'attached/image/64_default_2.jpg', 'attached/image/64_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('64', 'attached/image/64_default_3.jpg', 'attached/image/64_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('65', 'attached/image/65_default_1.jpg', 'attached/image/65_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('65', 'attached/image/65_default_2.jpg', 'attached/image/65_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('65', 'attached/image/65_default_3.jpg', 'attached/image/65_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('66', 'attached/image/66_default_1.jpg', 'attached/image/66_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('66', 'attached/image/66_default_2.jpg', 'attached/image/66_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('67', 'attached/image/67_default_1.jpg', 'attached/image/67_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('67', 'attached/image/67_default_2.jpg', 'attached/image/67_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('67', 'attached/image/67_default_3.jpg', 'attached/image/67_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('68', 'attached/image/68_default_1.jpg', 'attached/image/68_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('68', 'attached/image/68_default_2.jpg', 'attached/image/68_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('68', 'attached/image/68_default_3.jpg', 'attached/image/68_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('69', 'attached/image/69_default_1.jpg', 'attached/image/69_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('69', 'attached/image/69_default_2.jpg', 'attached/image/69_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('69', 'attached/image/69_default_3.jpg', 'attached/image/69_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('70', 'attached/image/70_default_1.jpg', 'attached/image/70_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('71', 'attached/image/71_default_1.jpg', 'attached/image/71_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('71', 'attached/image/71_default_2.jpg', 'attached/image/71_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('71', 'attached/image/71_default_3.jpg', 'attached/image/71_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('72', 'attached/image/72_default_1.jpg', 'attached/image/72_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('72', 'attached/image/72_default_2.jpg', 'attached/image/72_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('73', 'attached/image/73_default_1.jpg', 'attached/image/73_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('73', 'attached/image/73_default_2.jpg', 'attached/image/73_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('74', 'attached/image/74_default_1.jpg', 'attached/image/74_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('74', 'attached/image/74_default_2.jpg', 'attached/image/74_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('75', 'attached/image/75_default_1.jpg', 'attached/image/75_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('76', 'attached/image/76_default_1.jpg', 'attached/image/76_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('76', 'attached/image/76_default_2.jpg', 'attached/image/76_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('77', 'attached/image/77_default_1.jpg', 'attached/image/77_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('77', 'attached/image/77_default_2.jpg', 'attached/image/77_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('78', 'attached/image/78_default_1.jpg', 'attached/image/78_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('78', 'attached/image/78_default_2.jpg', 'attached/image/78_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('79', 'attached/image/79_default_1.jpg', 'attached/image/79_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('79', 'attached/image/79_default_2.jpg', 'attached/image/79_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('80', 'attached/image/80_default_1.jpg', 'attached/image/80_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('80', 'attached/image/80_default_2.jpg', 'attached/image/80_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('81', 'attached/image/81_default_1.jpg', 'attached/image/81_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('81', 'attached/image/81_default_2.jpg', 'attached/image/81_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('82', 'attached/image/82_default_1.jpg', 'attached/image/82_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('82', 'attached/image/82_default_2.jpg', 'attached/image/82_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('83', 'attached/image/83_default_1.jpg', 'attached/image/83_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('83', 'attached/image/83_default_2.jpg', 'attached/image/83_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('83', 'attached/image/83_default_3.jpg', 'attached/image/83_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('83', 'attached/image/83_default_4.jpg', 'attached/image/83_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('83', 'attached/image/83_default_5.jpg', 'attached/image/83_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('84', 'attached/image/84_default_1.jpg', 'attached/image/84_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('84', 'attached/image/84_default_2.jpg', 'attached/image/84_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('85', 'attached/image/85_default_1.jpg', 'attached/image/85_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('85', 'attached/image/85_default_2.jpg', 'attached/image/85_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('86', 'attached/image/86_default_1.jpg', 'attached/image/86_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('86', 'attached/image/86_default_2.jpg', 'attached/image/86_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('87', 'attached/image/87_default_1.jpg', 'attached/image/87_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('87', 'attached/image/87_default_2.jpg', 'attached/image/87_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('87', 'attached/image/87_default_3.jpg', 'attached/image/87_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('87', 'attached/image/87_default_4.jpg', 'attached/image/87_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('88', 'attached/image/88_default_1.jpg', 'attached/image/88_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('89', 'attached/image/89_default_1.jpg', 'attached/image/89_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('89', 'attached/image/89_default_2.jpg', 'attached/image/89_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('90', 'attached/image/90_default_1.jpg', 'attached/image/90_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('90', 'attached/image/90_default_2.jpg', 'attached/image/90_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('91', 'attached/image/91_default_1.jpg', 'attached/image/91_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('91', 'attached/image/91_default_2.jpg', 'attached/image/91_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('92', 'attached/image/92_default_1.jpg', 'attached/image/92_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('92', 'attached/image/92_default_2.jpg', 'attached/image/92_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('93', 'attached/image/93_default_1.jpg', 'attached/image/93_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('93', 'attached/image/93_default_2.jpg', 'attached/image/93_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('94', 'attached/image/94_default_1.jpg', 'attached/image/94_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('94', 'attached/image/94_default_2.jpg', 'attached/image/94_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('95', 'attached/image/95_default_1.jpg', 'attached/image/95_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('95', 'attached/image/95_default_2.jpg', 'attached/image/95_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('96', 'attached/image/96_default_1.jpg', 'attached/image/96_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('96', 'attached/image/96_default_2.jpg', 'attached/image/96_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('97', 'attached/image/97_default_1.jpg', 'attached/image/97_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('97', 'attached/image/97_default_2.jpg', 'attached/image/97_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('98', 'attached/image/98_default_1.jpg', 'attached/image/98_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('98', 'attached/image/98_default_2.jpg', 'attached/image/98_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('98', 'attached/image/98_default_3.jpg', 'attached/image/98_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('98', 'attached/image/98_default_4.jpg', 'attached/image/98_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('99', 'attached/image/99_default_1.jpg', 'attached/image/99_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('99', 'attached/image/99_default_2.jpg', 'attached/image/99_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('99', 'attached/image/99_default_3.jpg', 'attached/image/99_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('100', 'attached/image/100_default_1.jpg', 'attached/image/100_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('100', 'attached/image/100_default_2.jpg', 'attached/image/100_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('101', 'attached/image/101_default_1.jpg', 'attached/image/101_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('101', 'attached/image/101_default_2.jpg', 'attached/image/101_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('102', 'attached/image/102_default_1.jpg', 'attached/image/102_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('102', 'attached/image/102_default_2.jpg', 'attached/image/102_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('103', 'attached/image/103_default_1.jpg', 'attached/image/103_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('103', 'attached/image/103_default_2.jpg', 'attached/image/103_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('104', 'attached/image/104_default_1.jpg', 'attached/image/104_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('104', 'attached/image/104_default_2.jpg', 'attached/image/104_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('104', 'attached/image/104_default_3.jpg', 'attached/image/104_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('104', 'attached/image/104_default_4.jpg', 'attached/image/104_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('104', 'attached/image/104_default_5.jpg', 'attached/image/104_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('105', 'attached/image/105_default_1.jpg', 'attached/image/105_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('105', 'attached/image/105_default_2.jpg', 'attached/image/105_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('105', 'attached/image/105_default_3.jpg', 'attached/image/105_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('105', 'attached/image/105_default_4.jpg', 'attached/image/105_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('105', 'attached/image/105_default_5.jpg', 'attached/image/105_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('106', 'attached/image/106_default_1.jpg', 'attached/image/106_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('106', 'attached/image/106_default_2.jpg', 'attached/image/106_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('106', 'attached/image/106_default_3.jpg', 'attached/image/106_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('106', 'attached/image/106_default_4.jpg', 'attached/image/106_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('106', 'attached/image/106_default_5.jpg', 'attached/image/106_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('107', 'attached/image/107_default_1.jpg', 'attached/image/107_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('107', 'attached/image/107_default_2.jpg', 'attached/image/107_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('107', 'attached/image/107_default_3.jpg', 'attached/image/107_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('107', 'attached/image/107_default_4.jpg', 'attached/image/107_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('107', 'attached/image/107_default_5.jpg', 'attached/image/107_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('108', 'attached/image/108_default_1.jpg', 'attached/image/108_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('108', 'attached/image/108_default_2.jpg', 'attached/image/108_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('0', 'attached/image/0_default_1.jpg', 'attached/image/0_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('0', 'attached/image/0_default_2.jpg', 'attached/image/0_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('0', 'attached/image/0_default_3.jpg', 'attached/image/0_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('0', 'attached/image/0_default_4.jpg', 'attached/image/0_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('0', 'attached/image/0_default_5.jpg', 'attached/image/0_default_5.jpg');
INSERT INTO `shopmingxi` VALUES ('0', 'attached/image/0_default_6.jpg', 'attached/image/0_default_6.jpg');
INSERT INTO `shopmingxi` VALUES ('109', 'attached/image/109_default_1.jpg', 'attached/image/109_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('109', 'attached/image/109_default_2.jpg', 'attached/image/109_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('111', 'attached/image/111_default_1.jpg', 'attached/image/111_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('111', 'attached/image/111_default_2.jpg', 'attached/image/111_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('112', 'attached/image/112_default_1.jpg', 'attached/image/112_default_1.jpg');
INSERT INTO `shopmingxi` VALUES ('112', 'attached/image/112_default_2.jpg', 'attached/image/112_default_2.jpg');
INSERT INTO `shopmingxi` VALUES ('112', 'attached/image/112_default_3.jpg', 'attached/image/112_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('112', 'attached/image/112_default_4.jpg', 'attached/image/112_default_4.jpg');
INSERT INTO `shopmingxi` VALUES ('107', 'attached/image/107_default_6.jpg', 'attached/image/107_default_6.jpg');
INSERT INTO `shopmingxi` VALUES ('107', 'attached/image/107_default_7.jpg', 'attached/image/107_default_7.jpg');
INSERT INTO `shopmingxi` VALUES ('108', 'attached/image/108_default_3.jpg', 'attached/image/108_default_3.jpg');
INSERT INTO `shopmingxi` VALUES ('108', 'attached/image/108_default_4.jpg', 'attached/image/108_default_4.jpg');

-- ----------------------------
-- Table structure for `shouyeshop`
-- ----------------------------
DROP TABLE IF EXISTS `shouyeshop`;
CREATE TABLE `shouyeshop` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认Id',
  `ShopId` int(11) NOT NULL COMMENT '商品Id',
  `ShopTypeid` int(11) NOT NULL COMMENT '商品类型Id',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shouyeshop
-- ----------------------------
INSERT INTO `shouyeshop` VALUES ('1', '1', '1');
INSERT INTO `shouyeshop` VALUES ('2', '2', '1');
INSERT INTO `shouyeshop` VALUES ('6', '21', '1');
INSERT INTO `shouyeshop` VALUES ('8', '62', '2');
INSERT INTO `shouyeshop` VALUES ('9', '63', '2');
INSERT INTO `shouyeshop` VALUES ('10', '64', '2');
INSERT INTO `shouyeshop` VALUES ('11', '65', '2');
INSERT INTO `shouyeshop` VALUES ('12', '66', '2');
INSERT INTO `shouyeshop` VALUES ('13', '78', '3');
INSERT INTO `shouyeshop` VALUES ('14', '80', '3');
INSERT INTO `shouyeshop` VALUES ('15', '81', '3');
INSERT INTO `shouyeshop` VALUES ('16', '82', '3');
INSERT INTO `shouyeshop` VALUES ('18', '84', '3');
INSERT INTO `shouyeshop` VALUES ('19', '104', '1');
INSERT INTO `shouyeshop` VALUES ('20', '98', '1');
INSERT INTO `shouyeshop` VALUES ('22', '86', '3');
INSERT INTO `shouyeshop` VALUES ('23', '32', '2');
INSERT INTO `shouyeshop` VALUES ('24', '98', '1');

-- ----------------------------
-- Table structure for `totalpirce`
-- ----------------------------
DROP TABLE IF EXISTS `totalpirce`;
CREATE TABLE `totalpirce` (
  `Price` int(11) NOT NULL COMMENT '网站项目总价'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of totalpirce
-- ----------------------------
INSERT INTO `totalpirce` VALUES ('17129');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认id',
  `UserName` varchar(50) NOT NULL COMMENT '用户账号',
  `PassWord` varchar(50) NOT NULL COMMENT '用户密码',
  `State` int(11) NOT NULL COMMENT '0是正常 1是停用',
  `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '注册日期',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123456', '123456', '0', '2018-10-12 12:49:30');
INSERT INTO `user` VALUES ('2', '000000', '123456', '0', '2018-08-29 08:11:40');
INSERT INTO `user` VALUES ('17', '10973654', '123456', '0', '2018-10-08 18:43:30');
INSERT INTO `user` VALUES ('18', '45078733', '123456', '0', '2018-10-09 09:09:39');
INSERT INTO `user` VALUES ('19', '45149307', '123456', '0', '2018-10-10 09:11:19');
INSERT INTO `user` VALUES ('20', '79719494', '123456', '0', '2018-10-10 09:19:50');

-- ----------------------------
-- Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `UserName` varchar(50) NOT NULL COMMENT '用户账号',
  `UserNick` varchar(50) NOT NULL COMMENT '用户昵称',
  `Name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `JianJie` varchar(9999) DEFAULT NULL COMMENT '店铺说明',
  `ShenFenZheng` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `Address` varchar(50) DEFAULT NULL COMMENT '居住地址',
  `Email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `Phone` varchar(11) NOT NULL COMMENT '手机号码',
  `SexId` int(11) NOT NULL COMMENT '性别 默认是3保密',
  `IsDianPu` int(11) NOT NULL COMMENT '是否是店铺 0是普通用户 1是店铺',
  `Money` double NOT NULL COMMENT '余额',
  `DianPuMoney` double NOT NULL COMMENT '店铺余额',
  `Image` varchar(9999) NOT NULL COMMENT '头像',
  `birthday` datetime DEFAULT NULL COMMENT '生日'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('123456', '童瑶自营<sapn style=\'color:green\'>【已认证】</span>', '张童瑶', '这是我的店铺<img src=\"http://localhost:8080/YaoLeGou/kuang/plugins/emoticons/images/0.gif\" border=\"0\" alt=\"\" /><img src=\"http://localhost:8080/YaoLeGou/kuang/plugins/emoticons/images/0.gif\" border=\"0\" alt=\"\" />', null, '河北 邯郸 邯山区;哈哈哈', '3200499957@qq.com', '15200142200', '1', '1', '112500', '10282', 'attached/TouXiang/123456.jpg', '2018-09-01 00:00:00');
INSERT INTO `userinfo` VALUES ('000000', '【自营】童瑶自营', '张童瑶', '这是我的店铺，欢迎大家来看。<img src=\"http://localhost:8080/YaoLeGou/kuang/plugins/emoticons/images/22.gif\" border=\"0\" alt=\"\" />', null, '河北 秦皇岛 ;广府镇', '1973689961@qq.com', '15200142201', '2', '1', '50', '2747', 'attached/TouXiang/000000.jpg', '2018-09-01 00:00:00');
INSERT INTO `userinfo` VALUES ('10973654', '爱玩抖音的熊大', null, '这个人很懒，什么留言也没有。', '13029200009123456', null, null, '15200142203', '3', '1', '1000', '0', 'attached/TouXiang/10973654.jpg', '2018-10-08 00:00:00');
INSERT INTO `userinfo` VALUES ('45078733', '王境泽', null, '这个人很懒，什么留言也没有。', null, '河北邯郸邯山区;asdf', null, '15200142204', '3', '0', '0', '0', 'attached/TouXiang/45078733.jpg', '2018-10-09 00:00:00');
INSERT INTO `userinfo` VALUES ('45149307', '会撩妹的小仙女', null, null, null, null, null, '15200142278', '3', '0', '0', '0', 'attached/TouXiang/default.gif', '2018-10-10 00:00:00');
INSERT INTO `userinfo` VALUES ('79719494', '爱听音乐的光头强', null, '这个人很懒，什么留言也没有。', null, '河北 承德 ;', null, '15200142205', '3', '0', '0', '0', 'attached/TouXiang/default.gif', '2018-10-10 00:00:00');

-- ----------------------------
-- Table structure for `xiaoxitongzhi`
-- ----------------------------
DROP TABLE IF EXISTS `xiaoxitongzhi`;
CREATE TABLE `xiaoxitongzhi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `DingDanNumber` varchar(50) NOT NULL COMMENT '订单编号',
  `UserName` varchar(50) NOT NULL COMMENT '卖家账号',
  `Title` varchar(50) NOT NULL COMMENT '信息标题',
  `Context` varchar(200) NOT NULL COMMENT '通知消息内容',
  `State` int(11) NOT NULL COMMENT '通知状态,1未查看，0已查看',
  `CreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '通知时间',
  `MyUser` varchar(50) NOT NULL COMMENT '自己的账号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xiaoxitongzhi
-- ----------------------------
INSERT INTO `xiaoxitongzhi` VALUES ('110', '2082075634734', '123456', '订货通知', '您的商品已被用户购买，收货地址：河北 邯郸 邯山区 滏西大街与学院北路交叉口鹏泰大厦，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '0', '2018-10-12 16:00:25', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('111', '2767344708726', '000000', '订货通知', '您的商品已被用户购买，收货地址：河北 邯郸 邯山区 滏西大街与学院北路交叉口鹏泰大厦，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 13:39:53', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('112', '2767344708726', '123456', '订货通知', '您的商品已被用户购买，收货地址：河北 邯郸 邯山区 滏西大街与学院北路交叉口鹏泰大厦，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 13:39:53', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('113', '2526658607605', '000000', '订货通知', '您的商品已被用户购买，收货地址：河北 邯郸 邯山区 滏西大街与学院北路交叉口鹏泰大厦，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 13:41:04', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('114', '0256665275482', '123456', '订货通知', '您的商品已被用户购买，收货地址：河北 邯郸 邯山区 滏西大街与学院北路交叉口鹏泰大厦，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:30:24', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('115', '5467688760155', '123456', '订货通知', '您的商品已被用户购买，收货地址：河北 邯郸 邯山区 滏西大街与学院北路交叉口鹏泰大厦，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:46:39', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('116', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:55:50', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('117', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:56:32', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('118', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:57:07', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('119', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:57:18', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('120', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:57:26', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('121', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:57:54', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('122', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:58:03', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('123', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:58:19', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('124', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:58:22', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('125', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:58:57', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('126', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:59:12', '123456');
INSERT INTO `xiaoxitongzhi` VALUES ('127', '7584042285403', '123456', '订货通知', '您的商品已被用户购买，收货地址：北京 朝阳区 北京朝阳区交叉口瑶讯科技有限责任公司，手机号：15232045008，买家姓名：张童瑶，买家备注：\'无\'，请尽快发货。', '1', '2018-10-12 15:59:38', '123456');

-- ----------------------------
-- Table structure for `_dingdanstate`
-- ----------------------------
DROP TABLE IF EXISTS `_dingdanstate`;
CREATE TABLE `_dingdanstate` (
  `StateId` int(11) NOT NULL COMMENT '订单状态Id',
  `StateName` varchar(10) NOT NULL COMMENT '订单状态名称',
  PRIMARY KEY (`StateId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of _dingdanstate
-- ----------------------------
INSERT INTO `_dingdanstate` VALUES ('0', '待付款');
INSERT INTO `_dingdanstate` VALUES ('1', '等待发货');
INSERT INTO `_dingdanstate` VALUES ('2', '正在配送');
INSERT INTO `_dingdanstate` VALUES ('3', '交易成功');

-- ----------------------------
-- Table structure for `_isdianpu`
-- ----------------------------
DROP TABLE IF EXISTS `_isdianpu`;
CREATE TABLE `_isdianpu` (
  `DianPuId` int(11) NOT NULL,
  `DingPuName` varchar(50) NOT NULL,
  PRIMARY KEY (`DianPuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of _isdianpu
-- ----------------------------
INSERT INTO `_isdianpu` VALUES ('0', '普通用户');
INSERT INTO `_isdianpu` VALUES ('1', '店铺');

-- ----------------------------
-- Table structure for `_sex`
-- ----------------------------
DROP TABLE IF EXISTS `_sex`;
CREATE TABLE `_sex` (
  `SexId` int(11) NOT NULL AUTO_INCREMENT COMMENT '属性Id',
  `SexName` char(2) NOT NULL COMMENT '性别名称',
  PRIMARY KEY (`SexId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of _sex
-- ----------------------------
INSERT INTO `_sex` VALUES ('1', '男');
INSERT INTO `_sex` VALUES ('2', '女');
INSERT INTO `_sex` VALUES ('3', '保密');

-- ----------------------------
-- Table structure for `_shenfen`
-- ----------------------------
DROP TABLE IF EXISTS `_shenfen`;
CREATE TABLE `_shenfen` (
  `ShenFenId` int(11) NOT NULL AUTO_INCREMENT COMMENT '身份id',
  `ShenFenName` varchar(10) NOT NULL COMMENT '身份名称',
  PRIMARY KEY (`ShenFenId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of _shenfen
-- ----------------------------
INSERT INTO `_shenfen` VALUES ('1', '超级管理员');
INSERT INTO `_shenfen` VALUES ('2', '管理员');

-- ----------------------------
-- Table structure for `_shoptype`
-- ----------------------------
DROP TABLE IF EXISTS `_shoptype`;
CREATE TABLE `_shoptype` (
  `ShopTYpeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `ShopTypeName` varchar(10) NOT NULL COMMENT '商品类别名称',
  PRIMARY KEY (`ShopTYpeId`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of _shoptype
-- ----------------------------
INSERT INTO `_shoptype` VALUES ('1', '上衣');
INSERT INTO `_shoptype` VALUES ('2', '裤子');
INSERT INTO `_shoptype` VALUES ('3', '鞋子');
INSERT INTO `_shoptype` VALUES ('5', '童瑶自营');
INSERT INTO `_shoptype` VALUES ('6', '自营');
INSERT INTO `_shoptype` VALUES ('7', '自营2');
INSERT INTO `_shoptype` VALUES ('14', '居家');
INSERT INTO `_shoptype` VALUES ('15', '运动');
INSERT INTO `_shoptype` VALUES ('16', '学生');
INSERT INTO `_shoptype` VALUES ('18', '帽子');
INSERT INTO `_shoptype` VALUES ('19', '哈哈哈');
INSERT INTO `_shoptype` VALUES ('21', '旅行');
INSERT INTO `_shoptype` VALUES ('28', '222');
INSERT INTO `_shoptype` VALUES ('29', '111');

-- ----------------------------
-- Table structure for `_zhifutype`
-- ----------------------------
DROP TABLE IF EXISTS `_zhifutype`;
CREATE TABLE `_zhifutype` (
  `ZhiFuId` int(11) NOT NULL AUTO_INCREMENT COMMENT '支付方式Id',
  `ZhiFuName` varchar(10) NOT NULL COMMENT '支付方式名称',
  PRIMARY KEY (`ZhiFuId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of _zhifutype
-- ----------------------------
INSERT INTO `_zhifutype` VALUES ('1', '在线支付');
INSERT INTO `_zhifutype` VALUES ('2', '货到付款');
