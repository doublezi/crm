/*
Navicat MySQL Data Transfer

Source Server         : myslq
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : db_crm

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-01-02 13:04:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cst_activity`
-- ----------------------------
DROP TABLE IF EXISTS `cst_activity`;
CREATE TABLE `cst_activity` (
  `atv_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '系统自动生成(标识列、主键)',
  `atv_cust_no` char(17) DEFAULT NULL COMMENT '客户编号(cst_customer表cust_no)',
  `atv_date` datetime NOT NULL COMMENT '时间',
  `atv_place` varchar(200) NOT NULL COMMENT '地点',
  `atv_title` varchar(500) NOT NULL COMMENT '概要',
  `atv_desc` varchar(2000) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`atv_id`),
  KEY `FK5doiwb1t92q61abhqlts6pvqe` (`atv_cust_no`),
  CONSTRAINT `FK5doiwb1t92q61abhqlts6pvqe` FOREIGN KEY (`atv_cust_no`) REFERENCES `cst_customer` (`cust_no`),
  CONSTRAINT `cst_activity_ibfk_1` FOREIGN KEY (`atv_cust_no`) REFERENCES `cst_customer` (`cust_no`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cst_activity
-- ----------------------------
INSERT INTO `cst_activity` VALUES ('5', 'jlwqjdl', '2017-10-13 15:58:26', 'BeiJing', 'title test', null);

-- ----------------------------
-- Table structure for `cst_customer`
-- ----------------------------
DROP TABLE IF EXISTS `cst_customer`;
CREATE TABLE `cst_customer` (
  `cust_no` char(17) NOT NULL COMMENT '客户编号(主键)',
  `cust_name` varchar(100) NOT NULL COMMENT '客户姓名（公司名称）',
  `cust_manager_id` bigint(20) DEFAULT NULL COMMENT '客户经理编号',
  `cust_level` int(11) DEFAULT NULL COMMENT '客户等级（数字）',
  `cust_zip` char(10) DEFAULT NULL COMMENT '客户邮政编码',
  `cust_idc` varchar(200) DEFAULT NULL COMMENT '身份证照',
  PRIMARY KEY (`cust_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cst_customer
-- ----------------------------
INSERT INTO `cst_customer` VALUES ('001', '王大锤', '0', '0', '', null);
INSERT INTO `cst_customer` VALUES ('20171228', '郑振宁', '1', '12', '', 'E:\\upload\\2ac9c2a8-12df-4a9a-a9b4-d101bdd7607b-eclipse-git-1.jpg');
INSERT INTO `cst_customer` VALUES ('20171228-2', '郑振宁', '21', '2', '', 'E:\\eclipse-crm\\crm\\WebContent\\fileupload\\20c41ab1-c8c1-4899-9f8f-08dc8687baf5-application_json_格式.png');
INSERT INTO `cst_customer` VALUES ('20171228-3', '郑振宁3', '2', '212', '', 'E:\\eclipse-crm\\crm\\WebContent\\fileupload\\502d3780-d3ea-4e60-abb0-3dd3dba99aba-关注点.jpg');
INSERT INTO `cst_customer` VALUES ('jlwqjdl', '郑大宁', '0', '0', '', null);

-- ----------------------------
-- Table structure for `cst_service`
-- ----------------------------
DROP TABLE IF EXISTS `cst_service`;
CREATE TABLE `cst_service` (
  `svr_id` bigint(20) NOT NULL COMMENT '(客户服务编号)系统自动生成(标识列、主键)',
  `svr_type` varchar(20) NOT NULL COMMENT '服务类型',
  `svr_title` varchar(500) NOT NULL COMMENT '服务概要',
  `svr_cust_no` char(17) DEFAULT NULL COMMENT '客户编号(cst_customer表cust_no)',
  `svr_status` varchar(10) NOT NULL COMMENT '服务状态(新创建、已分配、已处理、已归档)',
  `svr_request` varchar(3000) DEFAULT NULL COMMENT '服务请求',
  `svr_create_id` bigint(20) NOT NULL COMMENT '服务创建人编号(客户经理)',
  `svr_create_name` varchar(50) NOT NULL COMMENT '服务创建人名字',
  `svr_create_date` datetime NOT NULL COMMENT '服务创建时间',
  `svr_due_id` bigint(20) DEFAULT NULL COMMENT '服务分配给的人编号',
  `svr_due_name` varchar(50) DEFAULT NULL COMMENT '服务分配给的人姓名',
  `svr_due_date` datetime DEFAULT NULL COMMENT '服务分配时间',
  `svr_deal` varchar(3000) DEFAULT NULL COMMENT '服务处理',
  `svr_deal_id` bigint(20) DEFAULT NULL COMMENT '服务处理人编号',
  `svr_deal_name` varchar(50) DEFAULT NULL COMMENT '服务处理人姓名',
  `svr_deal_date` datetime DEFAULT NULL COMMENT '服务处理时间',
  `svr_result` varchar(500) DEFAULT NULL COMMENT '服务处理结果',
  `svr_satisfy` int(11) DEFAULT NULL COMMENT '服务满意度',
  PRIMARY KEY (`svr_id`),
  KEY `FK10fasc9qj5p0hqbxmllbpa2h0` (`svr_cust_no`),
  CONSTRAINT `FK10fasc9qj5p0hqbxmllbpa2h0` FOREIGN KEY (`svr_cust_no`) REFERENCES `cst_customer` (`cust_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cst_service
-- ----------------------------
INSERT INTO `cst_service` VALUES ('0', 'null svr type', 'null svr title', 'jlwqjdl', '新创建', null, '4', '小绿', '2017-08-17 11:51:51', '0', null, null, 'null svr deal', '0', null, null, null, '0');
INSERT INTO `cst_service` VALUES ('1', 'update svr type`', 'update svr title`', '001', '重创建`', null, '5', 'update svr create name`', '2017-10-17 13:56:46', '0', null, null, null, '0', null, null, null, '0');

-- ----------------------------
-- Table structure for `sys_right`
-- ----------------------------
DROP TABLE IF EXISTS `sys_right`;
CREATE TABLE `sys_right` (
  `right_code` varchar(50) NOT NULL COMMENT '菜单编码（主键）',
  `right_parent_code` varchar(50) DEFAULT NULL COMMENT '父菜单编码',
  `right_type` varchar(20) DEFAULT NULL COMMENT '菜单类型',
  `right_text` varchar(50) DEFAULT NULL COMMENT '菜单文本',
  `right_url` varchar(100) DEFAULT NULL COMMENT '菜单访问路径',
  `right_tip` varchar(50) DEFAULT NULL COMMENT '菜单提示',
  PRIMARY KEY (`right_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_right
-- ----------------------------
INSERT INTO `sys_right` VALUES ('bd', 'root_catalog', '基本数据', '基本数据', null, 'basic data');
INSERT INTO `sys_right` VALUES ('ccm', 'cm', '客户流失管理', '客户流失管理', null, 'Customer churn management');
INSERT INTO `sys_right` VALUES ('cdp', 'mm', '客户开发计划', '客户开发计划', null, null);
INSERT INTO `sys_right` VALUES ('cim', 'cm', '客户信息管理', '客户信息管理', null, null);
INSERT INTO `sys_right` VALUES ('cm', 'root_catalog', '客户管理', '客户管理', null, 'customer manage');
INSERT INTO `sys_right` VALUES ('mcm', 'mm', '销售机会管理', '销售机会管理', null, null);
INSERT INTO `sys_right` VALUES ('mm', 'root_catalog', '营销管理', '营销管理', null, 'market manage');
INSERT INTO `sys_right` VALUES ('r', 'root_catalog', '权限', '权限', null, 'rights');
INSERT INTO `sys_right` VALUES ('root_catalog', 'is super', '超级目录', '无', null, null);
INSERT INTO `sys_right` VALUES ('serviceAchiving', 'sm', '服务归档', '服务归档', null, null);
INSERT INTO `sys_right` VALUES ('serviceAllocation', 'sm', '服务分配', '服务分配', null, null);
INSERT INTO `sys_right` VALUES ('serviceCreation', 'sm', '服务创建', '服务创建', null, null);
INSERT INTO `sys_right` VALUES ('serviceFeedback', 'sm', '服务反馈', '服务反馈', null, null);
INSERT INTO `sys_right` VALUES ('serviceProcessing', 'sm', '服务处理', '服务处理', null, null);
INSERT INTO `sys_right` VALUES ('sm', 'root_catalog', '服务管理', '服务管理', null, 'service manage');
INSERT INTO `sys_right` VALUES ('sr', 'root_catalog', '统计报表', '统计报表', null, 'statistical report');

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(20) NOT NULL,
  `role_name` varchar(50) NOT NULL COMMENT '角色名称',
  `role_desc` varchar(50) DEFAULT NULL COMMENT '角色描述',
  `role_flag` int(11) DEFAULT NULL COMMENT '角色状态（1或0，1表示可用）',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('0', '客服', '前台客服，后台客服', '0');
INSERT INTO `sys_role` VALUES ('1', '系统管理员', '负责系统用户、角色与权限管理', '0');
INSERT INTO `sys_role` VALUES ('2', '高管', '审查客户贡献数据、客户构成数据、客户服务构成数据和客户流失数据', '1');
INSERT INTO `sys_role` VALUES ('3', '客户经理', '管理客户', '1');
INSERT INTO `sys_role` VALUES ('4', '销售主管', '管理销售、分配销售机会', '1');

-- ----------------------------
-- Table structure for `sys_role_right`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_right`;
CREATE TABLE `sys_role_right` (
  `rf_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '系统自动生成(标识列、主键)',
  `rf_role_id` bigint(20) NOT NULL COMMENT '外键：角色编号（外键为sys_role表role_id）',
  `rf_right_code` varchar(50) NOT NULL COMMENT '外键：菜单编码（外键sys_right表right_code）',
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`rf_id`),
  KEY `FK7lssilmem9jvxvgo1orv133jp` (`rf_role_id`),
  KEY `FKdxjj2j3c9j0rctdq15jln9g7q` (`rf_right_code`),
  KEY `FKd740yl003bsqnp35cx3tckmkp` (`role_id`),
  CONSTRAINT `FK7lssilmem9jvxvgo1orv133jp` FOREIGN KEY (`rf_role_id`) REFERENCES `sys_role` (`role_id`),
  CONSTRAINT `FKd740yl003bsqnp35cx3tckmkp` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`),
  CONSTRAINT `FKdxjj2j3c9j0rctdq15jln9g7q` FOREIGN KEY (`rf_right_code`) REFERENCES `sys_right` (`right_code`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_right
-- ----------------------------
INSERT INTO `sys_role_right` VALUES ('2', '2', 'cm', null);
INSERT INTO `sys_role_right` VALUES ('3', '2', 'sm', null);
INSERT INTO `sys_role_right` VALUES ('4', '2', 'sr', null);
INSERT INTO `sys_role_right` VALUES ('5', '4', 'sr', null);

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '系统自动生成(标识列、主键)',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(50) DEFAULT NULL COMMENT '用户密码',
  `user_role_id` bigint(20) DEFAULT NULL COMMENT '用户权限（外键sys_role表role_id）',
  `user_flag` int(11) unsigned zerofill DEFAULT NULL COMMENT '用户状态（1或0，0是禁用，1是正常）',
  PRIMARY KEY (`user_id`),
  KEY `FKb9mylcv3ycfoucuvgw89i97eh` (`user_role_id`),
  CONSTRAINT `FKb9mylcv3ycfoucuvgw89i97eh` FOREIGN KEY (`user_role_id`) REFERENCES `sys_role` (`role_id`),
  CONSTRAINT `sys_user_ibfk_1` FOREIGN KEY (`user_role_id`) REFERENCES `sys_role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12229 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('8', 'admin', 'admin', '1', '00000000000');
INSERT INTO `sys_user` VALUES ('12228', 'aqsw', '1', '0', '00000000000');
