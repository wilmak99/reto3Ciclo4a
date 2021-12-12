package com.mahecha.william.reto3ciclo4a;

import com.mahecha.william.reto3ciclo4a.repositorio.OrderCrudRepository;
import com.mahecha.william.reto3ciclo4a.repositorio.ProductCrudRepository;
import com.mahecha.william.reto3ciclo4a.repositorio.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Reto3Ciclo4aApplication implements CommandLineRunner {
    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(Reto3Ciclo4aApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
    }
}
