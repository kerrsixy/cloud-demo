DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`       bigint   NOT NULL AUTO_INCREMENT,
    `username` varchar(100) NULL DEFAULT NULL COMMENT '收件人',
    `address`  varchar(255) NULL DEFAULT NULL COMMENT '地址',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `username` (`username`)
);

INSERT INTO `user` VALUES (1, '张三', '湖南省衡阳市');
INSERT INTO `user` VALUES (2, '李四', '陕西省西安市');
INSERT INTO `user` VALUES (3, '王五', '湖北省十堰市');
INSERT INTO `user` VALUES (4, '赵六', '天津市');
INSERT INTO `user` VALUES (5, '王七', '辽宁省沈阳市大东区');
INSERT INTO `user` VALUES (6, '韩八', '山东省青岛市');