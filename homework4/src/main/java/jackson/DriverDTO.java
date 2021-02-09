package jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverDTO {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("age")
	private int age;
	
	@JsonProperty("car")
	private Car car;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		return "DriverDTO [id=" + id + ", name=" + name + ", age=" + age + ", car=" + car + "]";
	}

}
