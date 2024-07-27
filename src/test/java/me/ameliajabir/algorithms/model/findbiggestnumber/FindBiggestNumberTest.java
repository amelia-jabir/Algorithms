package me.ameliajabir.algorithms.model.findbiggestnumber;

import me.ameliajabir.algorithms.model.runnable.findbiggestnumber.LinearSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class FindBiggestNumberTest {

    @Test
    void testLinearSearch() throws InterruptedException {

        ArrayList<Double> elements = new ArrayList<>(Arrays.asList(2D, 14D, -32D, 999D, -24.2D));

        LinearSearch ls = new LinearSearch(elements);

        ls.start();
        ls.join();

        Assertions.assertEquals(999D, ls.getResult());
    }

}
