package sep26;

public class Computer {
	String color;
	int ram;
	
	void calculate() {
		System.out.println("Computer is calculating");
	}
	
	void surfInternet() {
		System.out.println("Opening the internet");
	}
	
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.color="Blue";
		computer.ram=512;
	}

}
