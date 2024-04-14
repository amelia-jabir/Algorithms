package me.ameliajabir.algorithms.model;

import java.util.ArrayList;
import java.util.List;

public class Problem {

    private final int id;
    private final String name;
    private final String description;
    private List<Algorithm> algorithms = new ArrayList<>();

    public Problem(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Problem(int id, String name, String description, List<Algorithm> algorithms) {
        this(id, name, description);
        this.algorithms = algorithms;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addAlgorithm(Algorithm a) {
        algorithms.add(a);
    }

    public List<Algorithm> getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(List<Algorithm> algorithms) {
        this.algorithms = algorithms;
    }
}
