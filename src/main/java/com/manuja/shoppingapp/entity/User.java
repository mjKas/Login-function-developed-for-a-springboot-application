package com.manuja.shoppingapp.entity;

import com.manuja.shoppingapp.service.DbEncryptionService;

import javax.persistence.*;

@Entity @Table(name = "user")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    @Convert(converter = DbEncryptionService.class)
    private String password;
    @Column(name = "confirm_password")
    private String confirmPassword;
    private String userType;
//    @OneToOne @JoinColumn(name = "user_typeid",referencedColumnName = "id")
//    private SUserType userType;
    @OneToOne (mappedBy = "user")
    private Employee employee;
    @OneToOne (mappedBy = "user")
    private Customer customer;

    public User() {
    }

    public User(String name, String password, String rePassword) {
        this.username = name;
        this.password = password;
        this.confirmPassword = rePassword;
    }

    public User(String username, String password) {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", userType=" + userType +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
  // public SUserType getUserType() {
//        return userType;
//    }
//
//    public void setUserType(SUserType userType) {
//        this.userType = userType;
//    }
}
