package project.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication

@RestController
public class SpringApiApplication {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringApiApplication.class, args);
	}

	@GetMapping(value="simple-request")
	public String getMethodName() {
		return "Hello world";
	}
	

}
