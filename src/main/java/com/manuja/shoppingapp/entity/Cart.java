package com.manuja.shoppingapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "price")
    private double price;
    @Column(name = "total_quantity")
    private int Totalquantity;
    @OneToMany (mappedBy = "cartobj")
    private List<CartItem>cartItemList;
   // @Column(name = "cart_item_id")
    //private Integer cartItemId;


    public Cart() {
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", price=" + price +
                ", Totalquantity=" + Totalquantity +
                ", cartItemList=" + cartItemList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalquantity() {
        return Totalquantity;
    }

    public void setTotalquantity(int totalquantity) {
        Totalquantity = totalquantity;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }
}
