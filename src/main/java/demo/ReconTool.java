package demo;

import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

public class ReconTool implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        main(args);
    }

    public static void main(String[] args) {
        System.out.printf("ReconTool.main(" + Arrays.toString(args) + ")");
    }
}
