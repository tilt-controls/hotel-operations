package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Room room1 = new Room(4, 50, false, false);
        System.out.println("Available: " + room1.isAvailable());

        Room room2 = new Room(4, 50, true, true);
        System.out.println("Available: " + room2.isAvailable());

        Room room3 = new Room(4, 50, false, false);

        Reservation reservation1 = new Reservation("king", 1, true);
        System.out.printf("Reservation total: %.2f\n", reservation1.getReservationTotal());

        Reservation reservation2 = new Reservation("king", 3, true);
        System.out.printf("Reservation total for 3 nights: %.2f\n", reservation2.getReservationTotal());

        Employee e1 = new Employee("123456", "Jane", "Front Desk",
                20, 20);

        System.out.printf("Pay without overtime: %.2f\n", e1.getTotalPay());

        Employee e2 = new Employee("098765", "John", "House Keeping",
                20, 45);
        System.out.printf("Pay with overtime: %.2f\n", e2.getTotalPay());

        System.out.println("Clean unoccupied room status: " + room3.isAvailable());
        room3.checkIn();
        System.out.println("Room status after check in: " + room3.isAvailable());
        room3.checkOut();
        System.out.println("Room status after check out: " + room3.isAvailable());
        room3.cleanRoom();
        System.out.println("Room status after clean room: " + room3.isAvailable());

        e1.punchIn(10);
        e1.punchOut(14);
        System.out.println("Hours worked: " + e1.getHoursWorked());

        Employee e3 = new Employee("505050", "Paul", "Cook", 20, 0);
        e3.punchIn();
        e3.punchOut();
        System.out.printf("Hours worked: %.2f\n", e3.getHoursWorked());

        Hotel hotel1 = new Hotel("Lakeside Inn", 2, 10);
        System.out.println("Booking 2 suites: " + hotel1.bookRoom(2, true));

        System.out.println("Booking 1 suite over availability: " + hotel1.bookRoom(1, true));

        System.out.println("Available suites now: " + hotel1.getAvailableSuites());
    }
}
