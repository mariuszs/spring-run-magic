package demo;

import org.springframework.stereotype.Component;

@Component
public class Foo {

    public Foo() {
        System.out.println("This code is not invoked");
    }

}
