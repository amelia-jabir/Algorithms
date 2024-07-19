package me.ameliajabir.algorithms.config;

import me.ameliajabir.algorithms.model.Algorithm;
import me.ameliajabir.algorithms.model.Problem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProblemConfig {

    private final ApplicationContext applicationContext;

    public ProblemConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    public Problem findBiggestNumber() {

        Problem findBiggestNumber = new Problem(1, "FIND_BIGGEST_NUMBER", "Find Biggest Number", "Finds the biggest number in a list");
        findBiggestNumber.addAlgorithm((Algorithm) applicationContext.getBean("linearSearch"));

        return findBiggestNumber;
    }

}
