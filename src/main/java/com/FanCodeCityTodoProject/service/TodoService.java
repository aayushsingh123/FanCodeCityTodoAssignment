package com.FanCodeCityTodoProject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.FanCodeCityTodoProject.model.Todo;

@Service
public class TodoService {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/todos?userId=";

    @Autowired
    private RestTemplate restTemplate;

    public Todo[] fetchUserTodos(int userId) {
        return restTemplate.getForObject(BASE_URL + userId, Todo[].class);
    }

    public boolean isUserCompletingTasks(Todo[] todos) {
        int totalTasks = todos.length;
        int completedTasks = 0;

        for (Todo todo : todos) {
            if (todo.isCompleted()) {
                completedTasks++;
            }
        }

        return completedTasks > totalTasks / 2;
    }
}
