package com.manuja.shoppingapp.entity;

import javax.persistence.*;
import java.sql.Blob;
@Entity @Table(name = "product_item_picture")
public class ProductItemPIcture {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(name = "product_item_id")
    private Integer ProductItemId;
    @Column(name = "picture")
    private Blob Picture;
    @Column(name = "path")
    private int path;

    public ProductItemPIcture() {
    }

    @Override
    public String toString() {
        return "ProductItemPIcture{" +
                "id=" + id +
                ", ProductItemId=" + ProductItemId +
                ", Picture=" + Picture +
                ", path=" + path +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductItemId() {
        return ProductItemId;
    }

    public void setProductItemId(Integer productItemId) {
        ProductItemId = productItemId;
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
