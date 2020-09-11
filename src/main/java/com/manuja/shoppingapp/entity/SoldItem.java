package com.manuja.shoppingapp.entity;

import javax.persistence.*;

@Entity @Table(name = "sold_item")
public class SoldItem {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name = "completed_order_id")
    private Integer CompletedOrderId;
    @Column(name = "product_id")
    private Integer ProductItemId;
    //how to get productItemID, while it's not connected to product_item???????
    @Column(name = "quantity")
    private int Quantity;

    public SoldItem() {
    }

    @Override
    public String toString() {
        return "SoldItem{" +
                "Id=" + Id +
                ", CompletedOrderId=" + CompletedOrderId +
                ", ProductItemId=" + ProductItemId +
                ", Quantity=" + Quantity +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getCompletedOrderId() {
        return CompletedOrderId;
    }

    public void setCompletedOrderId(Integer completedOrderId) {
        CompletedOrderId = completedOrderId;
    }

    public Integer getProductItemId() {
        return ProductItemId;
    }

    public void setProductItemId(Integer productItemId) {
        ProductItemId = productItemId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
