/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : script_kill

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 26/12/2021 15:57:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sk_character_story
-- ----------------------------
DROP TABLE IF EXISTS `sk_character_story`;
CREATE TABLE `sk_character_story`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_by` bigint(255) NULL DEFAULT NULL COMMENT '创建人',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(20) NULL DEFAULT NULL COMMENT '修改人',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `del_flag` int(3) NULL DEFAULT NULL COMMENT '删除  0未删除  1删除   ',
  `story_character_id` int(20) NULL DEFAULT NULL COMMENT '故事人物id',
  `story_line` int(255) NULL DEFAULT NULL COMMENT '故事线顺序',
  `character_line_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '故事线名称',
  `character_story` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '人物任务/人物故事 ',
  `status` int(8) NULL DEFAULT NULL COMMENT ' 1任务/0故事   ',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sk_story_answer
-- ----------------------------
DROP TABLE IF EXISTS `sk_story_answer`;
CREATE TABLE `sk_story_answer`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_by` bigint(255) NULL DEFAULT NULL COMMENT '创建人',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(20) NULL DEFAULT NULL COMMENT '修改人',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `del_flag` int(3) NULL DEFAULT NULL COMMENT '删除  0未删除  1删除   ',
  `question_id` int(11) NULL DEFAULT NULL COMMENT '问题id',
  `option` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项',
  `option_val` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sk_story_character
-- ----------------------------
DROP TABLE IF EXISTS `sk_story_character`;
CREATE TABLE `sk_story_character`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_by` bigint(255) NULL DEFAULT NULL COMMENT '创建人',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(20) NULL DEFAULT NULL COMMENT '修改人',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `del_flag` int(3) NULL DEFAULT NULL COMMENT '删除  0未删除  1删除   ',
  `character_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '人物名称',
  `character_synopsis` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '人物简介',
  `character_sex` int(8) NULL DEFAULT NULL COMMENT '人物性别  0未知   1男  2女',
  `character_age` int(8) NULL DEFAULT NULL COMMENT '人物年龄  0未知  ',
  `configuration_id` bigint(20) NULL DEFAULT NULL COMMENT '故事关联id',
  `img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '人物头像',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sk_story_clue
-- ----------------------------
DROP TABLE IF EXISTS `sk_story_clue`;
CREATE TABLE `sk_story_clue`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_by` bigint(255) NULL DEFAULT NULL COMMENT '创建人',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(20) NULL DEFAULT NULL COMMENT '修改人',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `del_flag` int(3) NULL DEFAULT NULL COMMENT '删除  0未删除  1删除   ',
  `clue_type_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地点',
  `value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '线索内容',
  `img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片地址',
  `op_dot` int(8) NULL DEFAULT NULL COMMENT 'op点',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  ` subset` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '子集',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sk_story_clue_type
-- ----------------------------
DROP TABLE IF EXISTS `sk_story_clue_type`;
CREATE TABLE `sk_story_clue_type`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_by` bigint(20) NULL DEFAULT NULL COMMENT '创建人',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(20) NULL DEFAULT NULL COMMENT '修改人',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `del_flag` int(3) NULL DEFAULT NULL COMMENT '删除  0未删除  1删除   ',
  `clue_type_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '线索分类',
  `story_id` int(20) NULL DEFAULT NULL COMMENT '故事id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sk_story_configuration
-- ----------------------------
DROP TABLE IF EXISTS `sk_story_configuration`;
CREATE TABLE `sk_story_configuration`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_by` bigint(255) NULL DEFAULT NULL COMMENT '创建人',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(20) NULL DEFAULT NULL COMMENT '修改人',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `del_flag` int(3) NULL DEFAULT NULL COMMENT '删除  0未删除  1删除   ',
  `story_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '故事名称',
  `story_synopsis` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '故事提要',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sk_story_end
-- ----------------------------
DROP TABLE IF EXISTS `sk_story_end`;
CREATE TABLE `sk_story_end`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_by` bigint(255) NULL DEFAULT NULL COMMENT '创建人',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(20) NULL DEFAULT NULL COMMENT '修改人',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `del_flag` int(3) NULL DEFAULT NULL COMMENT '删除  0未删除  1删除   ',
  `end_version` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '结局版本',
  `story_id` int(20) NULL DEFAULT NULL COMMENT '故事id',
  `is_version` int(2) NULL DEFAULT NULL COMMENT '是否有多结局',
  `problem_id` int(20) NULL DEFAULT NULL COMMENT '触发的问题',
  `answer_id` int(20) NULL DEFAULT NULL COMMENT '触发的答案',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sk_story_question
-- ----------------------------
DROP TABLE IF EXISTS `sk_story_question`;
CREATE TABLE `sk_story_question`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_by` bigint(255) NULL DEFAULT NULL COMMENT '创建人',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(20) NULL DEFAULT NULL COMMENT '修改人',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `del_flag` int(3) NULL DEFAULT NULL COMMENT '删除  0未删除  1删除   ',
  `question_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '问题',
  `serial_number` int(8) NULL DEFAULT NULL COMMENT '序号',
  `type` int(8) NULL DEFAULT NULL COMMENT '0单选   1多选   2文本',
  `story_id` int(20) NULL DEFAULT NULL COMMENT '故事id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sk_user_info
-- ----------------------------
DROP TABLE IF EXISTS `sk_user_info`;
CREATE TABLE `sk_user_info`  (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `create_by` int(255) NULL DEFAULT NULL COMMENT '创建人',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` int(20) NULL DEFAULT NULL COMMENT '修改人',
  `update_date` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `del_flag` int(3) NULL DEFAULT NULL COMMENT '删除  0未删除  1删除   ',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名称',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `sex` int(255) NULL DEFAULT NULL COMMENT '性别  0未知  1男  2女',
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '等级',
  `count_integral` int(255) NULL DEFAULT NULL COMMENT '总积分',
  `new_integral` int(255) NULL DEFAULT NULL COMMENT '现在几分',
  `account_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sk_user_info
-- ----------------------------
INSERT INTO `sk_user_info` VALUES (1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
