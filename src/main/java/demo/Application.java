package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
//      SpringApplication.run(String.class, args); <- This works too :)
        SpringApplication.run(ReconTool.class, args);
        System.out.printf("Application.main(" + Arrays.toString(args) + ")");

    }
}
