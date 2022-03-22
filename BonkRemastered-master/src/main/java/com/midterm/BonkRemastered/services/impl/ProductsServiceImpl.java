package com.midterm.BonkRemastered.services.impl;

import com.midterm.BonkRemastered.dto.ProductDTO;
import com.midterm.BonkRemastered.model.Products;
import com.midterm.BonkRemastered.repository.ProductsRepository;
import com.midterm.BonkRemastered.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    private ProductsRepository productsRepository;


    @Override
    public void add(ProductDTO products){

        productsRepository.save(new Products(products));
    };

    @Override
    public List<ProductDTO> list() {
        return StreamSupport.stream(productsRepository.findAll().spliterator(),false)
                .map(ProductDTO::new)
                .collect(Collectors.toList());
    }


    @Override
    public ProductDTO get(Long id){
        return new ProductDTO(productsRepository.findById(id).get());
    }

    @Override
    public void update(ProductDTO updatedProduct){
        productsRepository.save(new Products(updatedProduct));
    }

    @Override
    public void delete(Long id){
        productsRepository.deleteById(id);
    }
}
