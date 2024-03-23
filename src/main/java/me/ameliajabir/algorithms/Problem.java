package me.ameliajabir.algorithms;

import java.util.List;

public class Problem {

    private int id;
    private String name;
    private String description;
    private List<Algorithm> algorithms;

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

}
