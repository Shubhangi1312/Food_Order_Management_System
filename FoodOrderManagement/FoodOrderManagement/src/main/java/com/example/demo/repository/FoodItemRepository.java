package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long>{
	List<FoodItem> findByNameContainingIgnoreCase(String name);
}
