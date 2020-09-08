package com.manuja.shoppingapp.entity;

import javax.persistence.*;

@Entity
@Table(name="category_type")
public class CategoryType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "product_type")
    private String productType;
    @Column(name = "description")
    private String description;

    public CategoryType() {
    }

    @Override
    public String toString() {
        return "CategoryType{" +
                "productType='" + productType + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
