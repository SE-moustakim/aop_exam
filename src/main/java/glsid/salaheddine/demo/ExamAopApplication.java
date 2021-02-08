package glsid.salaheddine.demo;

import glsid.salaheddine.demo.aspect.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamAopApplication {

    public static void main(String[] args) {
        ApplicationContext.authenticateUser("salah","salah",new String[]{"USER"});
        SpringApplication.run(ExamAopApplication.class, args);
    }

}
