package com.mahabir.restaurantSelection.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestaurantController {

    @Autowired
    private RestaurantChoiceService restaurantChoiceService;

    @GetMapping("restaurant-form")
    public String showRestaurantForm(Model model) {
        model.addAttribute("RestaurantForm", new RestaurantForm());
        return "jsp/restaurant-form";
    }

    @PostMapping("submit-choices")
    public String processRestaurantForm(@ModelAttribute("restaurantForm") RestaurantForm restaurantForm, Model model) {
        String userChoice = restaurantForm.getUserChoice();

        if (userChoice != null && !userChoice.isEmpty()) {
            restaurantChoiceService.addChoice(userChoice.trim());
        }

        String randomChoice = restaurantChoiceService.getRandomChoice();
        model.addAttribute("randomChoice", randomChoice);

        return "jsp/result";
    }
}
