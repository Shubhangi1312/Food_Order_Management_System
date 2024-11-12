package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FoodItem;
import com.example.demo.repository.FoodItemRepository;

@Service
public class FoodItemService {
	 @Autowired
	    private FoodItemRepository foodItemRepository;

	    public List<FoodItem> getAllFoodItems() {
	        return foodItemRepository.findAll();
	    }

	    public FoodItem saveFoodItem(FoodItem foodItem) {
	        return foodItemRepository.save(foodItem);
	    }
	    public List<FoodItem> searchFoodItems(String query) {
	        return foodItemRepository.findByNameContainingIgnoreCase(query);
	    }

}
