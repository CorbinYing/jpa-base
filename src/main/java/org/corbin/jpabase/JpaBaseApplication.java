package org.corbin.jpabase;

import org.corbin.jpabase.base.BaseRepositoryFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
@SpringBootApplication
public class JpaBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaBaseApplication.class, args);
    }

}
