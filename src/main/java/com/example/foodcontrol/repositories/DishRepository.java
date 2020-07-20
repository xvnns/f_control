package com.example.foodcontrol.repositories;

import com.example.foodcontrol.entities.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<DishEntity, Integer> {

}