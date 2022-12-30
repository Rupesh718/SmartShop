package com.smartshop.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartshop.users.entity.Manager;
@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer>{

	public Manager findByManagerUserNameAndManagerPassword(String managerUserName, String managerPassword);

}
