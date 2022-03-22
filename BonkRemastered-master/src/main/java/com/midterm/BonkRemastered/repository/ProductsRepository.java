package com.midterm.BonkRemastered.repository;

import com.midterm.BonkRemastered.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Long> {
}
