package com.example.foodcontrol.repositories;

import com.example.foodcontrol.entities.FoodControlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodControlRepository extends JpaRepository<FoodControlEntity, Integer> {
}
