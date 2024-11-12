package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FoodItem;
import com.example.demo.service.FoodItemService;

@RestController
@RequestMapping("/api/foods")
public class FoodItemController {
	
	
		@Autowired
	    private FoodItemService foodItemService;

	    @GetMapping
	    public List<FoodItem> getAllFoodItems() {
	        return foodItemService.getAllFoodItems();
	    }

	    @PostMapping
	    public FoodItem addFoodItem(@RequestBody FoodItem foodItem) {
	        return foodItemService.saveFoodItem(foodItem);
	    }
	    @GetMapping("/search")
	    public List<FoodItem> searchFoodItems(@RequestParam String query) {
	        return foodItemService.searchFoodItems(query);
	    }
	}


