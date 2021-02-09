package jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("age")
	private int age;

	public Car(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", age=" + age + "]";
	}

}
