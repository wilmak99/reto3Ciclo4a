package com.mahecha.william.reto3ciclo4a.repositorio;

import com.mahecha.william.reto3ciclo4a.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
}
