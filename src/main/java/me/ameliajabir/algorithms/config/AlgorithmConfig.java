package me.ameliajabir.algorithms.config;

import me.ameliajabir.algorithms.model.Algorithm;
import me.ameliajabir.algorithms.model.runnable.findbiggestnumber.LinearSearch;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgorithmConfig {

    @Bean
    public Algorithm linearSearch() {
        return new Algorithm(1, "Linear Search", "This algorithm iterates through each element in a list and compares it to a variable.", LinearSearch.class);
    }

}
