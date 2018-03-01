package ch.crush.poc.angular;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AngularApp {

    private static final Logger log = LoggerFactory.getLogger(AngularApp.class);

    public static void main(String[] args) {
        SpringApplication.run(AngularApp.class);
    }


}
