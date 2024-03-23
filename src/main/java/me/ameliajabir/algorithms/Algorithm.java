package me.ameliajabir.algorithms;

public abstract class Algorithm implements Runnable {

    private int id;
    private String name;
    private String description = "No Description";

    private long startTime;
    private long endTime;

    public Algorithm(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public long getStartTime() {
        return startTime;
    }


    public long getEndTime() {
        return endTime;
    }

    public long getDelta() {
        return endTime - startTime;
    }

    @Override
    public void run() {
        startTime = System.currentTimeMillis();
    }

    public void complete() {
        endTime = System.currentTimeMillis();
    }

}
