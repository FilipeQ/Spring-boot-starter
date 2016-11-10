package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import hello.controllers.JobController;
import hello.dao.JobDao;
import hello.models.Job;

@SpringBootApplication
@ComponentScan(basePackageClasses = JobController.class)
public class Application implements CommandLineRunner{

	@Autowired
	private JobDao repository;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("entrou..");
		repository.deleteAll();

		Job job = new Job("test job.");
		Job job2 = new Job("test job2.");
		Job job3 = new Job("test job3.");
		
		// save a couple of customers
		repository.save(job);
		repository.save(job2);
		repository.save(job3);
	}

}
