package java_scanner;
import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter full name with initial: ");
		String name=sc.nextLine();
		
		System.out.println("Enter roll no :");
		int rollno=sc.nextInt();
		
		System.out.println("Enter grade:");
		float grade=sc.nextFloat();
		
		System.out.println("Enter percentage :");
		int percent=sc.nextInt();
		
		System.out.println("\n-----Student Detail------\n");
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(grade);
		System.out.println(percent);

	}

}
