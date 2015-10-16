package hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner setUp(EmployeeRepository employeeRepository) {
        return args -> employeeRepository.save(Arrays.asList(
                new Employee("FirstName1", "LastName1"),
                new Employee("FirstName2", "LastName2"),
                new Employee("FirstName3", "LastName3")
        ));
    }

}
