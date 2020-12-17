package jdbc.connection;

public class Student {

	private int id;
	private String name;
	private String value;
	
	public Student(int id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", value=" + value
				+ "]";
	}
	
}
