package ruh.tec.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ruh.tec.restaurant.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
