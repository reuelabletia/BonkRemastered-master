package com.midterm.BonkRemastered.dto;

import com.midterm.BonkRemastered.model.Products;

public class ProductDTO {

    private Long productId;

    private Long inventory;

    private String productName;

    private Integer quantity;

    private Integer price;

    public ProductDTO(){}

    public ProductDTO(Long productId, Long Inventory, String ProductName, Integer Quantity, Integer Price)
    {
        this.productId = productId;
        this.inventory = Inventory;
        this.productName = ProductName;
        this.quantity = Quantity;
        this.price = Price;
    }

    public ProductDTO(Products products){
        this.productId = products.getProductId();
        this.inventory = products.getInventory().getInventoryId();
        this.productName = products.getProductName();
        this.quantity = products.getQuantity();
        this.price =products.getPrice();
    }


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getInventory() {
        return inventory;
    }

    public void setInventory(Long inventory) {
        this.inventory = inventory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getResellPrice() {
        return ResellPrice;
    }

    public void setResellPrice(Integer resellPrice) {
        ResellPrice = resellPrice;
    }

    private Integer ResellPrice;


}
