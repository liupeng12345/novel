/*
 Navicat Premium Data Transfer

 Source Server         : dockermysql
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : 192.168.140.128:3306
 Source Schema         : novel

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 18/12/2019 18:58:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `icon` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `nick_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `note` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `login_time` datetime(0) NULL DEFAULT NULL COMMENT '最后登录时间',
  `status` int(1) NULL DEFAULT 1 COMMENT '帐号启用状态：0->禁用；1->启用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '后台用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (5, 'admin', '$2a$10$xtZMTG28jtABkIJ7Ps0nZOGwvrSZXJUP6g/sdrv0xGauhQ46x7OG2', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3007876045,592289661&fm=26&gp=0.jpg', '750733178@qq.com', '老子是管理员', '阿斯蒂芬，阿萨德克雷登斯卡夫卡', '2019-10-04 21:42:14', '2019-10-04 21:41:43', 1);
INSERT INTO `admin` VALUES (6, 'admin1', '$2a$10$my/zM7GAaqS8PJDbYSmkVecfA2xNqTIslbXlNADrbp47r4A9ag7Jy', 'http://www.520touxiang.com/uploads/allimg/2018041208/u3eyyvm4p2c.jpg', '750733178@qq.com', '测试账户', '大是大非', '2019-10-05 18:15:57', '2019-10-05 18:14:29', 1);

-- ----------------------------
-- Table structure for admin_permission_relation
-- ----------------------------
DROP TABLE IF EXISTS `admin_permission_relation`;
CREATE TABLE `admin_permission_relation`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(20) NULL DEFAULT NULL,
  `permission_id` bigint(20) NULL DEFAULT NULL,
  `type` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '后台用户和权限关系表(除角色中定义的权限以外的加减权限)' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for admin_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `admin_role_relation`;
CREATE TABLE `admin_role_relation`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(20) NULL DEFAULT NULL,
  `role_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '后台用户和角色关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for book_ticket
-- ----------------------------
DROP TABLE IF EXISTS `book_ticket`;
CREATE TABLE `book_ticket`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `number` int(11) NOT NULL DEFAULT 0 COMMENT '书券数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '书券' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for carousel
-- ----------------------------
DROP TABLE IF EXISTS `carousel`;
CREATE TABLE `carousel`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '图片url地址',
  `novel_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '小说的链接',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '轮播图' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of carousel
-- ----------------------------
INSERT INTO `carousel` VALUES (4, 'http://file02.16sucai.com/d/file/2014/0829/372edfeb74c3119b666237bd4af92be5.jpg', '5def5f468d9ab7b707a13f45');
INSERT INTO `carousel` VALUES (5, 'http://big5.wallcoo.com/photograph/summer_feeling/images/%5Bwallcoo.com%5D_summer_feeling_234217.jpg', '5def5f468d9ab7b707a13f45');
INSERT INTO `carousel` VALUES (6, 'http://file02.16sucai.com/d/file/2015/0128/8b0f093a8edea9f7e7458406f19098af.jpg', '5def5f468d9ab7b707a13f45');
INSERT INTO `carousel` VALUES (7, 'http://g.hiphotos.baidu.com/zhidao/pic/item/c83d70cf3bc79f3d6e7bf85db8a1cd11738b29c0.jpg', '5def5f468d9ab7b707a13f45');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '富文本内容',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `operating_equipment` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '操作设备',
  `type` tinyint(4) NULL DEFAULT 0 COMMENT '0是小说评论，1是章节评论',
  `target_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '评论目标id',
  `operator` int(11) NOT NULL COMMENT '操作者',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for novel_mark
-- ----------------------------
DROP TABLE IF EXISTS `novel_mark`;
CREATE TABLE `novel_mark`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `novel_id` int(11) NOT NULL COMMENT '小说id',
  `rater_id` int(11) NOT NULL COMMENT '评分者',
  `score` int(11) NOT NULL COMMENT '评分数',
  `create_time` datetime(0) NOT NULL COMMENT '评分时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '小说评分' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for novel_shelf
-- ----------------------------
DROP TABLE IF EXISTS `novel_shelf`;
CREATE TABLE `novel_shelf`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '书架名',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `introduction` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '介绍',
  `owner` int(11) NOT NULL COMMENT '主人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '书架' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for novel_shelf_row
-- ----------------------------
DROP TABLE IF EXISTS `novel_shelf_row`;
CREATE TABLE `novel_shelf_row`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `novel_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '书籍名',
  `novel_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '小说在数据库id',
  `create_time` datetime(0) NOT NULL COMMENT '加入书单时间',
  `novel_shelf_id` int(11) NOT NULL COMMENT '书架id',
  `read_log_id` int(11) NOT NULL COMMENT '阅读记录id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '书架书籍对应' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for novel_spider_xpath_config
-- ----------------------------
DROP TABLE IF EXISTS `novel_spider_xpath_config`;
CREATE TABLE `novel_spider_xpath_config`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `website_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '小说站点名',
  `website_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '小说爬虫站点url',
  `website_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '小说站点图标',
  `search_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '搜索地址',
  `search_info` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '搜索结果',
  `novel_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '文章类型',
  `novel_author` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '文章作者',
  `word_count` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '字数',
  `novel_img_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '封面',
  `novel_description` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '内容简介',
  `novel_latest_chapter` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '最新章节',
  `novel_latest_chapter_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '最新章节地址',
  `novel_status` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '文章状态',
  `novel_last_update_time` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '最后更新时间',
  `novel_chapters_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '章节列表',
  `chapter_list_info` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '小说章节列表信息',
  `chapter_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '章节名信息',
  `chapter_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '章节链接',
  `content_info` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '小说内容',
  `content_previous_page` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '上一页url',
  `content_next_page` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '下一页url',
  `novel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '小说名字',
  `novel_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '小说链接',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '小说爬虫站点' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of novel_spider_xpath_config
-- ----------------------------
INSERT INTO `novel_spider_xpath_config` VALUES (1, '顶点小说', 'https://www.23wx.cc', 'https://www.x23us.com/themes/xiaoshuo/logo.gif', 'https://www.23wx.cc/modules/article/search.php?searchkey=%s', '//*[@id=\"nr\"]', '/html/head/meta[10]/@content', './/td[3]/text()', './/td[4]/text()', '//*[@id=\"fmimg\"]/img/@src', '//*[@id=\"intro\"]/p', './/td[2]/a/text()', './/td[2]/a/@href', './/td[6]/text()', '/html/head/meta[15]/@content', 'null', '//*[@id=\"list\"]//dd', './a/text()', './a/@href', '//*[@id=\"content\"]', '//*[@class=\"bottem1\"]/a[2]/@href', '//*[@class=\"bottem1\"]/a[4]/@href', './/td[1]/a/text()', './/td[1]/a/@href', 'gbk');
INSERT INTO `novel_spider_xpath_config` VALUES (2, '笔趣阁', 'https://www.biquge.com.cn', 'https://www.biquge.com.cn/favicon.ico', 'https://www.biquge.com.cn/search.php?keyword=%s', '/html/body/div[2]/div', '/html/head/meta[12]/@content', '/html/head/meta[13]/@content', 'null', './div[1]/a/img/@src', '//*[@id=\"intro\"]', '/html/head/meta[19]/@content', '/html/head/meta[20]/@content', '/html/head/meta[17]/@content', '/html/head/meta[18]/@content', 'null', '//*[@id=\"list\"]/dl/dd', './a/text()', './a/@href', '//*[@id=\"content\"]', '//*[@class=\"bottem1\"]/a[1]/@href', '//*[@class=\"bottem1\"]/a[3]/@href', './div[2]/h3/a/span/text()', './div[2]/h3/a/@href', 'utf-8');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) NULL DEFAULT NULL COMMENT '父级权限id',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `value` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限值',
  `icon` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图标',
  `type` int(1) NULL DEFAULT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
  `uri` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '前端资源路径',
  `status` int(1) NULL DEFAULT NULL COMMENT '启用状态；0->禁用；1->启用',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `sort` int(11) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '后台用户权限表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for proxy_spider_xpath_config
-- ----------------------------
DROP TABLE IF EXISTS `proxy_spider_xpath_config`;
CREATE TABLE `proxy_spider_xpath_config`  (
  `id` int(11) NOT NULL,
  `website` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '代理站点',
  `url` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '代理ip地址',
  `ip_list` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'ip列表',
  `merge` tinyint(1) NULL DEFAULT 0 COMMENT '是否合并 ip和端口',
  `ip` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'ip信息',
  `port` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '端口信息',
  `sleep` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '请求间隔(单位：s)',
  `page` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '查询页数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '代理爬虫配置表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for read_log
-- ----------------------------
DROP TABLE IF EXISTS `read_log`;
CREATE TABLE `read_log`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '阅读记录表',
  `user_id` int(11) NOT NULL COMMENT '读者',
  `novel_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '小说id',
  `chapter_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '章节id',
  `update_time` datetime(0) NOT NULL COMMENT '更新时间',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '阅读记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `target_id` int(11) NOT NULL COMMENT '回复目标',
  `content` text CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '回复内容',
  `creat_time` datetime(0) NOT NULL COMMENT '创建时间',
  `operating_equipment` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '操作设备',
  `operator` int(11) NOT NULL COMMENT '操作者',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '回复表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `description` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `admin_count` int(11) NULL DEFAULT NULL COMMENT '后台用户数量',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `status` int(1) NULL DEFAULT 1 COMMENT '启用状态：0->禁用；1->启用',
  `sort` int(11) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '后台用户角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for role_permission_relation
-- ----------------------------
DROP TABLE IF EXISTS `role_permission_relation`;
CREATE TABLE `role_permission_relation`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) NULL DEFAULT NULL,
  `permission_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '后台用户角色和权限关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '存储用户的其他信息' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
