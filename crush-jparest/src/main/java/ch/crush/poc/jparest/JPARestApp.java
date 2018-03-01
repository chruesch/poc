package ch.crush.poc.jparest;

import ch.crush.poc.jparest.resource.DemoResource;
import ch.crush.poc.jparest.entity.Demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JPARestApp {

    private static final Logger log = LoggerFactory.getLogger(JPARestApp.class);

    public static void main(String[] args) {
        SpringApplication.run(JPARestApp.class);
    }

    @Bean
    public CommandLineRunner demo(DemoResource dao) {
        return (args) -> {
            // save a couple of customers
            dao.save(new Demo("Jack", "Bauer"));
            dao.save(new Demo("Chloe", "O'Brian"));
            dao.save(new Demo("Kim", "Bauer"));
            dao.save(new Demo("David", "Palmer"));
            dao.save(new Demo("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Demo demo : dao.findAll()) {
                log.info(demo.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Demo demo = dao.findOne(1);
            log.info("Customer found with findOne(1):");
            log.info("--------------------------------");
            log.info(demo.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            for (Demo bauer : dao.findByLastname("Bauer")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }

}
