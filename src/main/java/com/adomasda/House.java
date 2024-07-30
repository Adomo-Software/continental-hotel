package com.adomasda;

interface HouseInterface {
    boolean isOwenOn();  // getter
    void  getAccess(String name); // setter
}

abstract class AbstractRoom implements HouseInterface {
    protected int roomNumber;
    protected int capacity;

//    public AbstractRoom(int capacity, int roomNumber) {
//        this.roomNumber = roomNumber;
//        this.capacity = capacity;
//    }

    @Override
    public String toString() {
        return "Room capacity: " + capacity + " | Room Number: " + roomNumber;
    }
}

class House extends AbstractRoom {
    private boolean owenOn = false;
    private String accessName; // never used idk what to do with it ¯\_ (ツ)_/¯

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
