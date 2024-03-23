package me.ameliajabir;

import me.ameliajabir.algorithms.Algorithm;
import me.ameliajabir.algorithms.Problem;
import me.ameliajabir.algorithms.findbiggestnumber.LinearSearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@SpringBootApplication
public class AlgorithmsApplication {

    private static List<Problem> problems = new ArrayList<>();

    public static void main(String[] args) {
        //SpringApplication.run(AlgorithmsApplication.class, args);

        problems.add(new Problem(1, "Find Biggest Number", "Finds the biggest number in a list", Arrays.asList(new LinearSearch())));

    }

    public static List<Problem> getProblems() {
        return problems;
    }
}
