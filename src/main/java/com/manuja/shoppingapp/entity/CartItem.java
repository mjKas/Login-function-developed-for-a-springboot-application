package com.manuja.shoppingapp.entity;

import javax.persistence.*;

@Entity
@Table (name = "cart_item")
public class CartItem {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name = "product_itemid")
    private Integer ProductItemID;
    @Column(name = "quantity")
    private int Quantity;
    @ManyToOne
    @JoinColumn(name = "cartid")
    private Cart cartobj;

    public CartItem() {
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "Id=" + Id +
                ", ProductItemID=" + ProductItemID +
                ", Quantity=" + Quantity +
                ", cartobj=" + cartobj +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Cart getCartobj() {
        return cartobj;
    }

    public void setCartobj(Cart cartobj) {
        this.cartobj = cartobj;
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
