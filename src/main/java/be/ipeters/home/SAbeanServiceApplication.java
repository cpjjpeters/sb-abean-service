package be.ipeters.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.ipeters.home.service.GreetingService;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SAbeanServiceApplication {
//	this comes from https://dzone.com/articles/what-is-a-spring-context
//	simple spring does not work, so changed into sb
//	bad one is s-bean-service

	public static void main(String[] args) {
//		SpringApplication.run(SAbeanServiceApplication.class, args);
		try(ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("be.ipeters.home");){
			GreetingService greetingService = context.getBean(GreetingService.class);
			greetingService.greet();
			context.close();
		}finally {
			log.info("finally");
		}
	}

}
