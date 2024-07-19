package me.ameliajabir.algorithms.controller;

import me.ameliajabir.algorithms.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class HomeController {

    ProblemService problemService;

    @Autowired
    public HomeController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @GetMapping("/")
    public RedirectView redirectToHome() {
        return new RedirectView("/home");
    }

    @GetMapping("/home")
    public ModelAndView getHome() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("problemList", problemService.getProblemList());
        return mav;
    }

}
