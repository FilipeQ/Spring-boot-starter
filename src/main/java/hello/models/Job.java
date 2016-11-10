package hello.models;

import org.springframework.data.annotation.Id;

public class Job {
	@Id
	private String id;
	private String description;
	
	public Job(String description){
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
    public String toString() {
        return String.format("Customer[id=%s, description='%s']",id, description);
    }
}
