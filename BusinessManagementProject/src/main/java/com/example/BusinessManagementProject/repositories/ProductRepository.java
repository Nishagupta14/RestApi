package com.example.BusinessManagementProject.repositories;



import com.example.BusinessManagementProject.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer>
{
    public Product findByPname(String name);

}
