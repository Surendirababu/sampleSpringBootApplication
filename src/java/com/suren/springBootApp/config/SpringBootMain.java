package com.suren.springBootApp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

/**
 * Created by SYSTEM on 3/30/2017.
 */
@SpringBootApplication(scanBasePackages = "com.suren.springBootApp")
public class SpringBootMain {

    public static void main(String[] args) throws Exception {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        SpringApplication.run(SpringBootMain.class, args);
        stopWatch.stop();


        System.out.println(stopWatch.getTotalTimeSeconds());
    }

}