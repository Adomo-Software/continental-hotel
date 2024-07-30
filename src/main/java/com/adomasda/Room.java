package com.adomasda;


import java.util.ArrayList;
import java.util.List;

interface RoomInterface {
    boolean isOwenOn();  // getter
    void  getAccess(String name); // setter
}

abstract class AbstractRoom implements RoomInterface {
    protected int roomNumber;
    protected int capacity;

    public AbstractRoom(int capacity, int roomNumber) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room capacity: " + capacity + " | Room Number: " + roomNumber;
    }
}

class Floor {
    private List<AbstractRoom> rooms;

    Floor() {
        this.rooms = new ArrayList<>();
    }

//    private void addRoom(int capacity, int roomNumber) {
//        AbstractRoom newRoom = new AbstractRoom(capacity, roomNumber);
//        rooms.add(newRoom);
//    }

    public void addRoom(AbstractRoom room) {
        rooms.add(room);
    }

    public void printRoom() {
        if (this.rooms.size() > 0) {
            System.out.print("(" + this.rooms.size() + " Rooms)");
        }
        System.out.println();
        for (AbstractRoom room : this.rooms) {
            System.out.println(room);
        }
    }
}

class Room extends AbstractRoom {
    private boolean owenOn = false;
    private String accessName; // never used idk what to do with it ¯\_ (ツ)_/¯

    public Room(int capacity, int roomNumber) {
        super(capacity, roomNumber);
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
}
