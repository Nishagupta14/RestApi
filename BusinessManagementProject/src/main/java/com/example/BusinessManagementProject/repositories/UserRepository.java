package com.example.BusinessManagementProject.repositories;



import org.springframework.data.repository.CrudRepository;

import com.example.BusinessManagementProject.entities.Admin;
import com.example.BusinessManagementProject.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>
{
    public User findUserByUemail(String email);
}
