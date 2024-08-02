package com.adomasda;

class SimpleRoom extends Room {
    private int capacity;
    private int roomNumber;

    public SimpleRoom(int capacity, int roomNumber) {
        this.capacity = capacity;
        this.roomNumber = roomNumber;
    }

    public String toString() {
        return "Room capacity: " + capacity + " | Room Number: " + roomNumber;
    }
}
