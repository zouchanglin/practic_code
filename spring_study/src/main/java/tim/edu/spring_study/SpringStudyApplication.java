package tim.edu.spring_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import tim.edu.spring_study.entity.Person;

@SpringBootApplication
public class SpringStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringStudyApplication.class, args);
    }
}