package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Room room1 = new Room(4, 50, false, false);
        System.out.println("Available: " + room1.isAvailable());

        Room room2 = new Room(4, 50, true, true);
        System.out.println("Available: " + room2.isAvailable());

        Reservation reservation1 = new Reservation("king", 1, true);
        System.out.println("Reservation total: " + reservation1.getReservationTotal());

        Reservation reservation2 = new Reservation("king", 3, true);
        System.out.printf("Reservation total for 3 nights: %.2f\n", reservation2.getReservationTotal());

        Employee e1 = new Employee("123456", "Jane", "Front Desk",
                20, 20);

        System.out.println("Pay without overtime: " + e1.getTotalPay());

        Employee e2 = new Employee("098765", "John", "House Keeping",
                20, 45);
        System.out.println("Pay with overtime: " + e2.getTotalPay());
    }
}
