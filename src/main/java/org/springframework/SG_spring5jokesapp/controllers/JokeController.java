package org.springframework.SG_spring5jokesapp.controllers;

import org.springframework.SG_spring5jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke (Model model){
        model.addAttribute("joke" , jokeService.getJoke());
        return "index";
    }
}