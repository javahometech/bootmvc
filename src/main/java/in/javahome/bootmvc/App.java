package in.javahome.bootmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"in.javahome.demo","in.javahome.bootmvc"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
