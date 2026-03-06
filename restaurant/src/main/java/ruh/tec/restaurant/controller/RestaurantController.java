package ruh.tec.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ruh.tec.restaurant.model.Restaurant;
import ruh.tec.restaurant.service.RestaurantService;

@Controller
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listRestaurants", restaurantService.getAllRestaurants());
        return "index";
    }

    @GetMapping("/new")
    public String showNewRestaurant(Model model){
        model.addAttribute("restaurant", new Restaurant());
        return "new_restaurant";
    }

    @PostMapping("/saveRestaurant")
    public String saveRestaurant(@ModelAttribute("restaurant") Restaurant restaurant) {
        restaurantService.saveRestaurant(restaurant);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model){
        model.addAttribute("restaurant", restaurantService.getRestaurantById(id));
        return "edit";
    }

    @PostMapping("/updateRestaurant/{id}")
    public String updateRestaurant(@PathVariable Integer id, @ModelAttribute("restaurant") Restaurant restaurant) {
        restaurant.setId(id);
        restaurantService.saveRestaurant(restaurant);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteRestaurant(@PathVariable Integer id){
        restaurantService.deleteRestaurantById(id);
        return "redirect:/";
    }

}
