package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"in.ashokit.sbIrctcAppApplication"})

public class SbIrctcAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbIrctcAppApplication.class, args);
	}

}
