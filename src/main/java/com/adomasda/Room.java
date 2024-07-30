package com.adomasda;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

interface RoomInterface {
    boolean isOwenOn();
    void getAccess(String name);
}

class Floor {
    private List<RoomInterface> rooms;

    public Floor() {
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
        for (RoomInterface room : this.rooms) {nterface
            System.out.println(room);
        }
    }
}

class Room implements RoomInterface {
    private boolean owenOn = false;
    private String accessName;
    private int capacity;
    private int roomNumber;

    public Room(int capacity, int roomNumber) {
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

class Kitchen implements RoomInterface {
    private boolean owenOn = false;
    private String accessName;
    private double foodCapacity;

    public Kitchen(double foodCapacity) {
        this.foodCapacity = foodCapacity;
    }

    public boolean isOwenOn() {
        return owenOn;
    }

    public void getAccess(String name) {
        this.accessName = name;
        this.owenOn = true;
    }
    public String toString() {
        return "Food capacity: " + foodCapacity + " cubic meters";
    }
}

class ServiceRoom implements RoomInterface {
    private boolean owenOn = false;
    private String accessName;
    private String type;

    public ServiceRoom(String type) {
        this.type = type;
    }

    public boolean isOwenOn() {
        return owenOn;
    }

    public void getAccess(String name) {
        this.accessName = name;
        this.owenOn = true;
    }
    public String toString() {
        return "Service room type: " + type;
    }
}

class Car {
    private String model;
    public Car(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return model;
    }
}

class Garage implements RoomInterface {
    private boolean owenOn = false;
    private String accessName;
    private int carCapacity;

    public Garage(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    public boolean isOwenOn() {
        return owenOn;
    }

    public void getAccess(String name) {
        this.accessName = name;
        this.owenOn = true;
    }
    public String toString() {
        return "Garage car capacity: " + carCapacity;
    }
}
