package com.adomasda;


import java.util.ArrayList;
import java.util.List;

interface RoomInterface {
    boolean isOwenOn();  // getter
    void  getAccess(String name); // setter
    String toString(); // Why there isn't a requirement to implement toString???
    // (java doesn't complain if i don't implement it)
}

class Floor {
    private List<RoomInterface> rooms;

    Floor() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(RoomInterface room) {
        rooms.add(room);
    }

    public void printRoom() {
        if (this.rooms.size() > 0) {
            System.out.print("(" + this.rooms.size() + " Rooms)");
        }
        System.out.println();
        for (RoomInterface room : this.rooms) {
            System.out.println(room);
        }
    }
}

class Room implements RoomInterface {
    private boolean owenOn = false;
    private String accessName; // never used idk what to do with it ¯\_ (ツ)_/¯
    int capacity;
    int roomNumber;



    public Room(int capacity, int roomNumber) {
        this.capacity = capacity;
        this.roomNumber = roomNumber;
    }

    public void  getAccess(String name) {
        accessName = name;
        owenOn = true;
    }

    public boolean isOwenOn() {
        return owenOn;
    }

    public String toString() {
        return "Room capacity: " + capacity + " | Room Number: " + roomNumber;
    }
}

class Kitchen implements RoomInterface {
    private boolean owenOn = false;
    private String accessName; // never used idk what to do with it ¯\_ (ツ)_/¯
    double foodCapacity;

    public Kitchen(double foodCapacity) {
        this.foodCapacity = foodCapacity;
    }

    public boolean isOwenOn() {
        return owenOn;
    }

    public void  getAccess(String name) {
        accessName = name;
        owenOn = true;
    }
    public String toString() {
        return "Food capacity: " + foodCapacity + " cubic meters";
    }
}
