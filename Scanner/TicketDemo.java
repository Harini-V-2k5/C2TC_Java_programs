package java_scanner;
import java.util.Scanner;
public class TicketDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        // Creating multiple users
        Ticket user1 = new Ticket();
        Ticket user2 = new Ticket();
        Ticket user3 = new Ticket();
        user1.display();
        // User 1 booking
        System.out.print("User 1, enter number of seats to book: ");
        int s1 = sc.nextInt();
        user1.bookSeat(s1);

        // User 2 booking
        System.out.print("User 2, enter number of seats to book: ");
        int s2 = sc.nextInt();
        user2.bookSeat(s2);

        // User 3 booking
        System.out.print("User 3, enter number of seats to book: ");
        int s3 = sc.nextInt();
        user3.bookSeat(s3);

        sc.close();

	}

}
