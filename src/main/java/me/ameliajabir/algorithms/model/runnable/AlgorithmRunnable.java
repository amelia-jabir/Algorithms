package me.ameliajabir.algorithms.model.runnable;

import me.ameliajabir.algorithms.util.TimeUtils;

public class AlgorithmRunnable extends Thread implements Runnable {

    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getRuntime() {
        return endTime - startTime;
    }

    private Object result;

    @Override
    public void run() {
        startTime = TimeUtils.getMicroTime();
    }

    public void complete(Object result) {
        endTime = TimeUtils.getMicroTime();
        this.result = result;
    }

    public Object getResult() {
        return result;
    }
}
