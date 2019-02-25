package com.rjsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ServletComponentScan
@SpringBootApplication
        (exclude = {
                DataSourceAutoConfiguration.class,
                HibernateJpaAutoConfiguration.class,
        })
@ComponentScan({
        "com.rjsoft"
})
public class JpaDataClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaDataClientApplication.class, args);
    }
}
