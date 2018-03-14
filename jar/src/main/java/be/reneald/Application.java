package be.reneald;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//This class should be in [...]/java/be/reneald
    //NOT in [...]/java/be/reneald/jar
    //otherwise Spring won't be able to find any of the other classes.
    //he's looking in this class's path and any subpaths
    //The other classes are in e.g. [...]/java/be/reneald/api
    //if this class would be in [...]/java/be/reneald/jar, the other classes wouldn't be in a subpath of this one's path.
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
