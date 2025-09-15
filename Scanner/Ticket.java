package java_scanner;
import java.util.Scanner;
public class Ticket {
	static int totalSeats = 10;
	static void display()
	{
		System.out.println("No of tickets booked="+totalSeats);
	}

    // Method to book seats
    void bookSeat(int seats) {
        if (seats <= totalSeats) {
            totalSeats -= seats;
            System.out.println(seats + " seats booked successfully.");
            System.out.println("Remaining seats: " + totalSeats);
        } else {
            System.out.println("Not enough seats available! Only " + totalSeats + " left.");
        }
    }

}
