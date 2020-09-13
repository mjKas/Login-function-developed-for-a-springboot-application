package com.manuja.shoppingapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column (name="first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "shipping_address_l1")
    private String shippingAdressL1;
    @Column(name = "shipping_address_l2")
    private String getShippingAdressL2;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "cotact_no")
    private String contactNo;
    @Column(name = "userid")
    private Integer userId;

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", shippingAdressL1='" + shippingAdressL1 + '\'' +
                ", getShippingAdressL2='" + getShippingAdressL2 + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShippingAdressL1() {
        return shippingAdressL1;
    }

    public void setShippingAdressL1(String shippingAdressL1) {
        this.shippingAdressL1 = shippingAdressL1;
    }

    public String getGetShippingAdressL2() {
        return getShippingAdressL2;
    }

    public void setGetShippingAdressL2(String getShippingAdressL2) {
        this.getShippingAdressL2 = getShippingAdressL2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}