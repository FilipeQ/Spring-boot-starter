package hello.models;

import org.springframework.data.annotation.Id;

public class Champion {
	@Id
	private String id;
	private String name;
	private String type;
	private String imgUrl;
	
	//Introducing the dummy constructor
    public Champion() {
    }
    
	public Champion(String name, String type, String imgUrl){
		this.name = name;
		this.type = type;
		this.imgUrl = imgUrl;
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getImgUrl() {
		return imgUrl;
	}



	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}



	@Override
	public String toString() {
		return "Champion [id=" + id + ", name=" + name + ", type=" + type + ", imgUrl=" + imgUrl + "]";
	}
}
