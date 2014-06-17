package demo;

import org.springframework.boot.SpringApplication;

import java.util.Arrays;

//@Configuration        <- commented because is not used
//@ComponentScan
//@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(ReconTool.class, args);
        System.out.printf(String.format("Application.main(%s)",Arrays.toString(args)));

    }
}
