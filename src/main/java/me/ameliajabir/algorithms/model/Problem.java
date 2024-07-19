package me.ameliajabir.algorithms.model;

import java.util.ArrayList;
import java.util.List;

public class Problem {

    private final int id;
    private final String name;
    private final String displayname;
    private final String description;
    private List<Algorithm> algorithms = new ArrayList<>();

    public Problem(int id, String name, String displayname, String description) {
        this.id = id;
        this.name = name;
        this.displayname = displayname;
        this.description = description;
    }

    public Problem(int id, String name, String description, String displayname, List<Algorithm> algorithms) {
        this(id, name, displayname, description);
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

    public String getDisplayname() {
        return displayname;
    }

    public String getUri() {
        return name.trim().replaceAll("(\\s|_)+", "-").toLowerCase();
    }
}
