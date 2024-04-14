package me.ameliajabir.algorithms.model;

import me.ameliajabir.algorithms.model.runnable.AlgorithmRunnable;

public class Algorithm {

    private int id;
    private String name;
    private String description = "No Description";
    private Class<? extends AlgorithmRunnable> algorithmRunnableClass;

    public Algorithm(int id, String name, String description, Class<? extends AlgorithmRunnable> algorithmRunnableClass) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.algorithmRunnableClass = algorithmRunnableClass;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Class<? extends AlgorithmRunnable> getAlgorithmRunnableClass() {
        return algorithmRunnableClass;
    }


}
