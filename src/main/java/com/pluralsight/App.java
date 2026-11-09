package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Reservation r1 = new Reservation("king", 1, true);
        System.out.println(r1.getReservationTotal());
    }
}
