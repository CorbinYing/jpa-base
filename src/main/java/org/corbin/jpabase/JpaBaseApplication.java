package org.corbin.jpabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类，
 * base service 方法未测试
 *
 * 可以尝试将commentscan 扫描引入包的bean，
 * 减少代码开发量
 */
@SpringBootApplication
public class JpaBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaBaseApplication.class, args);
    }

}
