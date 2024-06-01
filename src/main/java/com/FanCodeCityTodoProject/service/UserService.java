package com.FanCodeCityTodoProject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.FanCodeCityTodoProject.model.User;

@Service
public class UserService {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/users";

    @Autowired
    private RestTemplate restTemplate;

    public User[] fetchUsers() {
        return restTemplate.getForObject(BASE_URL, User[].class);
    }

    public boolean isUserInFanCodeCity(User user) {
        double lat = Double.parseDouble(user.getAddress().getGeo().getLat());
        double lng = Double.parseDouble(user.getAddress().getGeo().getLng());

        return lat > -40 && lat < 5 && lng > 5 && lng < 100;
    }
}

