package com.adomasda;

class SimpleRoom implements Room {
    private String accessName;
    private int capacity;
    private int roomNumber;

    public SimpleRoom(int capacity, int roomNumber) {
        this.capacity = capacity;
        this.roomNumber = roomNumber;
    }

    public void setAccess(String name) {
        this.accessName = name;
    }
    public String getAccess() {
        return this.accessName;
    }
    public String toString() {
        return "Room capacity: " + capacity + " | Room Number: " + roomNumber;
    }
}
