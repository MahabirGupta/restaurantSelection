package com.mahabir.restaurantSelection.restaurant;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RestaurantChoiceService {

    private List<String> restaurantChoices = new ArrayList<>();

    public void addChoice(String choice) {
        restaurantChoices.add(choice);
    }

    public List<String> getChoices() {
        return restaurantChoices;
    }

    public String getRandomChoice() {
        if (restaurantChoices.isEmpty()) {
            return "No choices available.";
        }
        Random random = new Random();
        int randomIndex = random.nextInt(restaurantChoices.size());
        return restaurantChoices.get(randomIndex);
    }
}
