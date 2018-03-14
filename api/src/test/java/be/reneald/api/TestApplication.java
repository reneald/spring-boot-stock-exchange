package be.reneald.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"be.reneald.springdi"})
public class TestApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestApplication.class, args);
    }
}
