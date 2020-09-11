package com.manuja.shoppingapp.repository;

import com.manuja.shoppingapp.entity.ProductItemPIcture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductItemPictureRepository extends JpaRepository<ProductItemPIcture,Integer> {
}
