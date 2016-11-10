package hello.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.models.Job;

@Controller
public class JobController {

	
	@RequestMapping(value="/jobs", method={RequestMethod.GET})
	public @ResponseBody List<Job> getJobs(){
		System.out.println("entrou no jobs");
		Job job = new Job("test job.");
		Job job2 = new Job("test job2.");
		Job job3 = new Job("test job3.");
		List <Job> jobs = new ArrayList<Job>();
		jobs.add(job);
		jobs.add(job2);
		jobs.add(job3);
		return jobs;
	}
}
