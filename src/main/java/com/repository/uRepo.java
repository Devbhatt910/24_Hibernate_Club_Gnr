package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.uEntity;

public interface uRepo extends JpaRepository<uEntity,Integer>{
    
}
