package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !this.occupied && !this.dirty;
    }

    public void checkIn() {
        if (!dirty && !occupied) {
            this.occupied = true;
            this.dirty = true;
        }

    }
    public void checkOut() {
        this.occupied = false;
        this.dirty = true;
    }
    public void cleanRoom() {
        if (!occupied && dirty) {
        this.dirty = false;
        this.occupied = false; }

    }

}
