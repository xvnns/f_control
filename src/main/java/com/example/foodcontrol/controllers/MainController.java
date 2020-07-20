package com.example.foodcontrol.controllers;

import com.example.foodcontrol.repositories.ClientRepository;
import com.example.foodcontrol.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class MainController {

    @Autowired
    DishRepository dishRepository;

    @Autowired
    ClientRepository clientRepository;

    @RequestMapping("/index" )
    public String index(Model model) {
        String message = "Hello Spring Boot + JSP";
        model.addAttribute("message", message);
        return "index";
    }

    @RequestMapping("/dishes")
    public String getAllDishes(Model model) {
        model.addAttribute("dishes", dishRepository.findAll());
        return "dishes";
    }

    @RequestMapping("/clients")
    public String getAllClients(Model model) {
        model.addAttribute("clients", clientRepository.findAll());
        return "clients";
    }

    @RequestMapping("/findClientById")
    public String findClientById(Model model) {
        model.addAttribute("randclient", clientRepository.findById(new Random().nextInt(3)));
        return "findClientById";
    }
}