package com.example.BusinessManagementProject.repositories;


import org.springframework.data.repository.CrudRepository;

import com.example.BusinessManagementProject.entities.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer>
{
    public Admin findByAdminEmail(String email);
}

