package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Reservation r1 = new Reservation("king", 1, true);
        System.out.println(r1.getReservationTotal());

        Employee e1 = new Employee("123456", "Jane", "Front Desk",
                20, 20);

        System.out.println(e1.getTotalPay());

        Employee e2 = new Employee("098765", "John", "House Keeping",
                20, 45);
        System.out.println(e2.getTotalPay());
    }
}
