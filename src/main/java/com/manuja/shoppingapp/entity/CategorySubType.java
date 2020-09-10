package com.manuja.shoppingapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "category_sub_type")
public class CategorySubType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name = "category_typeid")
    private Integer categoryTypeId;
    @Column(name = "sub_type_name")
    private String subTypeName;

    public CategorySubType() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getCategoryTypeId() {
        return categoryTypeId;
    }

    public void setCategoryTypeId(Integer categoryTypeId) {
        this.categoryTypeId = categoryTypeId;
    }

    public String getSubTypeName() {
        return subTypeName;
    }

    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }
}
