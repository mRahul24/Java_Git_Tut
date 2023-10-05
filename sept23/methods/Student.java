package sept23.methods;

public class Student {
	static String setName(String name) {
	 return "Hello "+name;
	}
	
	String color;
	int numOfTyres;
	int speed;
	int engineCapacity;
	
	public void run() {
		System.out.println("Running");
	}
	
	
	public static void main(String[] args) {
		//Student.setName();
		String result = setName("Rahul");
		System.out.println(result);
	}

}
