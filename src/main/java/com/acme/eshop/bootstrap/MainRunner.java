package com.acme.eshop.bootstrap;

import com.acme.eshop.domain.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class MainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("hello");
        double d  =0;
        for (int i = 0 ; i < 10; i++) {
            d += 0.1;
            System.out.println(d);
        }
        Product p = new Product();
        p.setName("abc");
        Product p2 = Product.builder()
                .serial("1234")
                .name("New Product")
                .price(new BigDecimal("0.8"))
                .build();

    }
}
