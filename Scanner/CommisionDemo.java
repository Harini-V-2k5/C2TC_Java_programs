package java_scanner;

public class CommisionDemo {

	public static void main(String[] args) {
		Student s = new Student();  // Constructor runs here

        // Part 2: Commission class
        Commision c = new Commision();

        // Accept details (hardcoded here, can also be taken via Scanner)
        c.acceptDetails("Supriya", "Delhi", "9876543210", 85000);

        // Calculate commission
        c.calculateCommission();

	}

}
