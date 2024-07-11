package me.ameliajabir.algorithms;

import me.ameliajabir.algorithms.model.runnable.AlgorithmRunnable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class AlgorithmsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AlgorithmsApplication.class, args);

//        Algorithm algorithm = (Algorithm) context.getBean("linearSearch");
//        AlgorithmRunnable algorithmRunnableA;
//        AlgorithmRunnable algorithmRunnableB;
//
//        try {
//            algorithmRunnableA = algorithm.getAlgorithmRunnableClass().getConstructor(List.class).newInstance(
//                    Arrays.asList(-1000D));
//
//            algorithmRunnableB = algorithm.getAlgorithmRunnableClass().getConstructor(List.class).newInstance(
//                    Arrays.asList(-2000D));
//        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//
//        algorithmRunnableA.start();
//        algorithmRunnableB.start();
//
//        while(algorithmRunnableA.isAlive() || algorithmRunnableB.isAlive()) {
//            displayAlgorithmInfo(algorithmRunnableA, algorithmRunnableB);
//        }
//
//        displayAlgorithmInfo(algorithmRunnableA, algorithmRunnableB);

    }

    public static void displayAlgorithmInfo(AlgorithmRunnable algorithmRunnableA, AlgorithmRunnable algorithmRunnableB) {
        if(!algorithmRunnableA.isAlive()) {
            System.out.println("Result A: " + algorithmRunnableA.getResult());
            System.out.println("Runtime A: " + algorithmRunnableA.getRuntime() + "µs");
        } else {
            System.out.println("Algorithm A running...");
        }

        if(!algorithmRunnableB.isAlive()) {
            System.out.println("Result B: " + algorithmRunnableB.getResult());
            System.out.println("Runtime B: " + algorithmRunnableB.getRuntime() + "µs");
        } else {
            System.out.println("Algorithm B running...");
        }
        System.out.println("-------------------------------------");
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AlgorithmsApplication.class);
    }

}
