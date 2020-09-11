package com.manuja.shoppingapp.entity;

import javax.persistence.*;

@Entity
@Table (name = "cart_item")
public class CartItem {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name = "cartid")
    private Integer cartId;
    @Column(name = "product_itemid")
    private Integer ProductItemID;
    @Column(name = "quantity")
    private int Quantity;

    public CartItem() {
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "Id=" + Id +
                ", cartId=" + cartId +
                ", ProductItemID=" + ProductItemID +
                ", Quantity=" + Quantity +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getProductItemID() {
        return ProductItemID;
    }

    public void setProductItemID(Integer productItemID) {
        ProductItemID = productItemID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
