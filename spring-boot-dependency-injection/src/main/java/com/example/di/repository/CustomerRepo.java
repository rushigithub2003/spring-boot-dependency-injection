package com.example.di.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.di.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
