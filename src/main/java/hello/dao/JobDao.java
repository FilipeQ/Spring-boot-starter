package hello.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import hello.models.Job;

public interface JobDao extends MongoRepository<Job, String>{

	public Job findByDescription(String description);
}
