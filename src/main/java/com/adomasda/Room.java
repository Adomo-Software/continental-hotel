package com.adomasda;


import java.util.ArrayList;
import java.util.List;

interface RoomInterface {
    boolean isOwenOn();  // getter
    void  getAccess(String name); // setter
    String toString();
}

class Floor {
    private List<RoomInterface> rooms;

    Floor() {
        this.rooms = new ArrayList<>();
    }

//    private void addRoom(int capacity, int roomNumber) {
//        AbstractRoom newRoom = new AbstractRoom(capacity, roomNumber);
//        rooms.add(newRoom);
//    }

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

    @Override
    public void  getAccess(String name) {
        accessName = name;
        owenOn = true;
    }

    @Override
    public boolean isOwenOn() {
        return owenOn;
    }

    @Override
    public String toString() {
        return "Room capacity: " + capacity + " | Room Number: " + roomNumber;
    }
}
