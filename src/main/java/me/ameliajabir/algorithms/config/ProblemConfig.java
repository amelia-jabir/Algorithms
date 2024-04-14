package me.ameliajabir.algorithms.config;

import me.ameliajabir.algorithms.model.Algorithm;
import me.ameliajabir.algorithms.model.Problem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AlgorithmConfig.class)
public class ProblemConfig {

    final ApplicationContext applicationContext;

    public ProblemConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    public Problem findBiggestNumber() {

        Problem findBiggestNumber = new Problem(1, "Find Biggest Number", "Finds the biggest number in a list");
        findBiggestNumber.addAlgorithm((Algorithm) applicationContext.getBean("linearSearch"));

        return findBiggestNumber;
    }

}
