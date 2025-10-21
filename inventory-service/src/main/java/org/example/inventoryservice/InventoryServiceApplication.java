package org.example.inventoryservice;

import org.example.inventoryservice.entities.Product;
import org.example.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);

    }
    @Bean
    CommandLineRunner start(ProductRepository ProductRepository, RepositoryRestConfiguration repositoryRestConfiguration) {
        repositoryRestConfiguration.exposeIdsFor(Product.class);
        return args -> {
            ProductRepository.save(new Product(null, "Computer", 800, 10));
            ProductRepository.save(new Product(null, "Printer", 200, 5));
            ProductRepository.save(new Product(null, "Smartphone", 300, 20));
            ProductRepository.findAll().forEach(p -> {
                System.out.println(p.getName());
            });
        };
    }

}
