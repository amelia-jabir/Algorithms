package me.ameliajabir.algorithms.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HomeController {

    @GetMapping("/")
    public RedirectView redirectToHome() {
        return new RedirectView("/home");
    }

    @GetMapping("/home")
    public ModelAndView getHome() {
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }

}
