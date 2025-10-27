package org.example.customerservice;

import org.example.customerservice.config.CustomerConfigParams;
import org.example.customerservice.entities.Customer;
import org.example.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EnableConfigurationProperties(CustomerConfigParams.class)
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(
                    new Customer(null, "amal", "amal@gmail.com")
            );
            customerRepository.save(
                    new Customer(null, "malak", "malak@gmail.com")
            );
            customerRepository.save(
                    new Customer(null, "nouhaila", "nouhaila@gmail.com")
            );
            customerRepository.findAll().forEach(c ->{
                System.out.println(c.toString());
            });

        };
    }

}