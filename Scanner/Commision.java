package java_scanner;

public class Commision {
	String name, address;
    String phone;
    double salesAmount;

    // Method to accept details
    void acceptDetails(String n, String addr, String ph, double sales) {
        name = n;
        address = addr;
        phone = ph;
        salesAmount = sales;
    }

    // Method to calculate commission
    void calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("Employee Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }

}
