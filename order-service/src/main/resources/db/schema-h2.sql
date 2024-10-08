DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `user_id` bigint NOT NULL COMMENT '用户id',
  `name` varchar(100) NULL DEFAULT NULL COMMENT '商品名称',
  `price` bigint NOT NULL COMMENT '商品价格',
  `num` int(10) NULL DEFAULT 0 COMMENT '商品数量',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username`(`name`)
);

INSERT INTO `order` VALUES (101, 1, '手机', 5899, 1);
INSERT INTO `order` VALUES (102, 7, '电动车', 2399, 1);
INSERT INTO `order` VALUES (103, 3, '鞋', 258, 1);
INSERT INTO `order` VALUES (104, 4, '风扇', 32, 1);
INSERT INTO `order` VALUES (105, 5, '照相机', 5499, 1);
INSERT INTO `order` VALUES (106, 6, '冰箱', 6345, 1);
INSERT INTO `order` VALUES (107, 2, '椅子', 158, 1);
INSERT INTO `order` VALUES (108, 3, '彩电', 45, 1);