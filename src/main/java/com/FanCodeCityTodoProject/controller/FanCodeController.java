package com.FanCodeCityTodoProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FanCodeCityTodoProject.model.Todo;
import com.FanCodeCityTodoProject.model.User;
import com.FanCodeCityTodoProject.service.TodoService;
import com.FanCodeCityTodoProject.service.UserService;

@RestController
public class FanCodeController {

    @Autowired
    private UserService userService;

    @Autowired
    private TodoService todoService;

    @GetMapping("/check-fancode-users")
    public String checkFanCodeUsers() {
        User[] users = userService.fetchUsers();
        StringBuilder result = new StringBuilder();

        for (User user : users) {
            if (userService.isUserInFanCodeCity(user)) {
                Todo[] todos = todoService.fetchUserTodos(user.getId());
                if (todoService.isUserCompletingTasks(todos)) {
                    result.append("User ").append(user.getId()).append(" has more than 50% tasks completed.\n");
                } else {
                    result.append("User ").append(user.getId()).append(" does not have more than 50% tasks completed.\n");
                }
            }
        }
        return result.toString();
    }
}
