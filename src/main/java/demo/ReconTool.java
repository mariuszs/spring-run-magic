package demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
public class ReconTool implements CommandLineRunner {

    @Override
    public void run(String... args)  {
        main(args);
    }

    public static void main(String[] args) {
        System.out.println(String.format("ReconTool.main(%s)",Arrays.toString(args)));
    }
}
