package com.manuja.shoppingapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @ManyToOne @JoinColumn(name = "category_sub_typeid")
    private CategorySubType categorySubTypeobj;
    @OneToMany(mappedBy = "productObj")
    private List<ProductItem>productItems;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", categorySubTypeobj=" + categorySubTypeobj +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategorySubType getCategorySubTypeobj() {
        return categorySubTypeobj;
    }

    public void setCategorySubTypeobj(CategorySubType categorySubTypeobj) {
        this.categorySubTypeobj = categorySubTypeobj;
    }
}
