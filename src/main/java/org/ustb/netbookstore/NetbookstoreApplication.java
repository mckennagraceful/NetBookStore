package org.ustb.netbookstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.ustb.netbookstore.mapper")
@SpringBootApplication
public class NetbookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetbookstoreApplication.class, args);
    }

}
