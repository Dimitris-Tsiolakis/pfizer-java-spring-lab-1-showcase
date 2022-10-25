package com.acme.eshop.bootstrap;

import com.acme.eshop.domain.BaseModel;
import com.acme.eshop.domain.Product;
import com.acme.eshop.domain.enumeration.CustomerCategory;
import com.acme.eshop.domain.enumeration.PaymentMethod;
import com.acme.eshop.repository.ProductRepository;
import com.acme.eshop.repository.ProductRepositoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

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

        ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
        //productRepository.create()

        /*Map<String, Long> entityIdCounter = new HashMap<>();
        AtomicLong counter = new AtomicLong(1);
        counter.incrementAndGet()
        Map<Long, BaseModel> productStorage = new HashMap<>();*/
    }
}
