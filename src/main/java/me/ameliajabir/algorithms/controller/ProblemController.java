package me.ameliajabir.algorithms.controller;

import me.ameliajabir.algorithms.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/problem")
public class ProblemController {

    ProblemService problemService;

    @Autowired
    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @GetMapping("/{problem}")
    public ModelAndView getProblemAlgorithms(@PathVariable String problem) {
        System.out.println("problem: " + problem);
        return null; // todo problem visualization view
    }

}
