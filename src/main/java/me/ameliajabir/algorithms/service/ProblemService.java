package me.ameliajabir.algorithms.service;

import me.ameliajabir.algorithms.model.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemService {

    List<Problem> problemList;

    @Autowired
    public ProblemService(List<Problem> problemList) {
        this.problemList = problemList;
    }

    public List<Problem> getProblemList() {
        return problemList;
    }
}
