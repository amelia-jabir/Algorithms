package me.ameliajabir.algorithms.findbiggestnumber;

import me.ameliajabir.algorithms.Algorithm;

import java.util.List;

public class LinearSearch extends Algorithm {

    private List<Double> list;

    public LinearSearch() {
        super(1, "Linear Search", "This algorithm iterates through each element in a list and compares it to a variable.");
    }

    @Override
    public void run() {
        super.run();

        if (list.size() == 0) {

        }

        double max = list.get(0);

        for(Double d : list) {
            if (max < d) {

            }
        }
    }

    public void setList(List<Double> l) {
        list = l;
    }


}
