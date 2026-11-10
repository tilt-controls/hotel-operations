package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_should_makeRoomDirtyAndOccupied() {
        // arrange
        Room room = new Room(2, 30, false, false);

        // act
        room.checkIn();

        // assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    public void checkOut_should_makeRoomUnoccupiedAndStayDirty() {
        // arrange
        Room room = new Room(2, 30, true, true);

        // act
        room.checkOut();

        // assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }
    @Test
    public void cleanRoom_should_makeRoomAvailable() {
        // arrange
        Room room = new Room(2, 30, false, true);

        // act
        room.cleanRoom();

        // assert
        assertTrue(room.isAvailable());
        assertFalse(room.isDirty());
    }
}