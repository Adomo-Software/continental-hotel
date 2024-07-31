package com.adomasda;

interface Room {
    boolean isOwenOn();
    void getAccess(String name);
}

class SimpleRoom implements Room {
    private boolean owenOn = false;
    private String accessName;
    private int capacity;
    private int roomNumber;

    public SimpleRoom(int capacity, int roomNumber) {
        this.capacity = capacity;
        this.roomNumber = roomNumber;
    }

    public void getAccess(String name) {
        this.accessName = name;
        this.owenOn = true;
    }

    public boolean isOwenOn() {
        return owenOn;
    }

    public String toString() {
        return "Room capacity: " + capacity + " | Room Number: " + roomNumber;
    }
}
