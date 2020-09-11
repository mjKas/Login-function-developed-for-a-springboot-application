package com.manuja.shoppingapp.repository;

import com.manuja.shoppingapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
