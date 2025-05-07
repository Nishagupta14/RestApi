package com.example.BusinessManagementProject.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BusinessManagementProject.entities.Orders;
import com.example.BusinessManagementProject.entities.User;

public interface OrderRepository extends JpaRepository<Orders, Integer>
{
    List<Orders> findOrdersByUser(User user);
}
