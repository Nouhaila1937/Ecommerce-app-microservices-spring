package org.example.billingservice.feign;

import org.example.billingservice.model.Customer;
import org.example.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="INVENTORY-SERVICE")
public interface ProductItemRestClient {
    @GetMapping(path = "/api/products")
    PagedModel<Product> pageProducts();

    //PagedModel<Product> pageProducts(@QueryParam(value="page") int page,@QueryParam(value = "size") int size);

    @GetMapping(path = "/api/products/{id}")
    Product getProductById(@PathVariable Long id);

    @GetMapping(path = "/api/products")
    PagedModel<Product> getAllProducts();
}