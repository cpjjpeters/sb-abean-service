package be.ipeters.home.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class GreetingService {
	
	public GreetingService() {
		log.info("https://dzone.com/articles/what-is-a-spring-context");
	}
	public void greet() {
		log.info("Gaurav Bytes welcomes you for your first tutorial on Spring!!!");
	}

}
