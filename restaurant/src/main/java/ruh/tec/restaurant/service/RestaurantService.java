package ruh.tec.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruh.tec.restaurant.model.Restaurant;
import ruh.tec.restaurant.repository.RestaurantRepository;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant getRestaurantById(Integer id){
        return restaurantRepository.findById((id)).orElse(null);
    }

    public Restaurant deleteRestaurantById(Integer id){
        Restaurant restaurant = restaurantRepository.findById(id).orElse(null);
        if(restaurant != null){
            restaurantRepository.delete(restaurant);
            return restaurant;
        }
        return null;
    }

    public void saveRestaurant(Restaurant restaurant){
        System.out.println("Saving restaurant: " + restaurant.getName() + " | Location: " + restaurant.getLocation());
        restaurantRepository.save(restaurant);
        System.out.println("Restaurant saved successfully!");
    }
}
