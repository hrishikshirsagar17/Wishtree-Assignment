package com.spring.rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.entity.Restaurant;


public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>{

//	public Restaurant findById(int id);
	public Optional<Restaurant> findByNameAndId(String imgName, int id);
}
