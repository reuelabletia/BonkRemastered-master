package com.midterm.BonkRemastered.model;

import com.midterm.BonkRemastered.dto.ProductDTO;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "Inventory", nullable = false)
    private Inventory inventory;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Integer price;

    @Column (nullable = false)
    private Integer resellPrice;

    public Products(){}

    public Products(Long productId){

        this.productId = productId;
    }

    public Products (ProductDTO productDTO){
        this.productId = productDTO.getProductId();
        this.inventory = new Inventory(productDTO.getInventory());
        this.productName = productDTO.getProductName();
        this.quantity = productDTO.getQuantity();
        this.price = productDTO.getPrice();
        this.resellPrice = productDTO.getResellPrice();

    }
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
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
        return resellPrice;
    }

    public void setResellPrice(Integer resellPrice) {
        this.resellPrice = resellPrice;
    }



}
