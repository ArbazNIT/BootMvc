package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.beans.Robat;
import in.ashokit.beans.Robot;

@SpringBootApplication
public class SprinBoot02ProjApplication {

	public static void main(String[] args) {
		      ConfigurableApplicationContext run = SpringApplication.run(SprinBoot02ProjApplication.class, args);
		      
		         		Robat bean = run.getBean(Robat.class);
		         		bean.doWork();
	}

}
