package com.manuja.shoppingapp.entity;

import javax.persistence.*;
import java.sql.Blob;
@Entity @Table(name = "product_item_picture")
public class ProductItemPIcture {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(name = "picture")
    private Blob Picture;
    @Column(name = "path")
    private int path;
    @ManyToOne @JoinColumn(name = "product_itemid")
    private ProductItem productItemObj;

    public ProductItemPIcture() {
    }

    @Override
    public String toString() {
        return "ProductItemPIcture{" +
                "id=" + id +
                ", Picture=" + Picture +
                ", path=" + path +
                ", productItemObj=" + productItemObj +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProductItem getProductItemObj() {
        return productItemObj;
    }

    public void setProductItemObj(ProductItem productItemObj) {
        this.productItemObj = productItemObj;
    }

    public Blob getPicture() {
        return Picture;
    }

    public void setPicture(Blob picture) {
        Picture = picture;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }
}
