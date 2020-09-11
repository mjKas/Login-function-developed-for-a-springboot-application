package com.manuja.shoppingapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "product_item")
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "size")
    private String size;
    @Column(name = "color")
    private String color;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private double price;
    @Column(name = "product_id")
    private Integer productId;

    public ProductItem() {
    }

    @Override
    public String toString() {
        return "ProductItem{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", productId=" + productId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}