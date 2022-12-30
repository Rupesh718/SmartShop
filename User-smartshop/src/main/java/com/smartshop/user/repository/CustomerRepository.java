package com.smartshop.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartshop.user.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	Customer findByUserNameAndPassword(String userName, String password);

}
