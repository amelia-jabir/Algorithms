package me.ameliajabir.algorithms.model.runnable.findbiggestnumber;

import me.ameliajabir.algorithms.model.runnable.AlgorithmRunnable;

import java.util.List;

public class LinearSearch extends AlgorithmRunnable {

    private final List<Double> list;

    public LinearSearch(List<Double> elements) {
        list = elements;
    }

    @Override
    public void run() {
        super.run();

        double max = list.get(0);

        for(Double d : list) {
            if (max < d) {
                max = d;
            }
        }

        // sleep hack for demonstration
        if(max < 0) {
            try {
                sleep((long) max * -1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        complete(max);
    }


}
