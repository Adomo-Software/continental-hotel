package com.adomasda;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

interface RoomInterface {
    boolean isOwenOn(); // getter
    void getAccess(String name); // setter
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

    public void getAccess(String name) {
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

    public void getAccess(String name) {
        accessName = name;
        owenOn = true;
    }
    public String toString() {
        return "Food capacity: " + foodCapacity + " cubic meters";
    }
}

class ServiceRoom implements RoomInterface {
    private boolean owenOn = false;
    private String accessName; // never used idk what to do with it ¯\_ (ツ)_/¯
    private String type;

    public ServiceRoom(String type) {
        this.type = type;
    }

    public boolean isOwenOn() {
        return owenOn;
    }

    public void getAccess(String name) {
        accessName = name;
        owenOn = true;
    }
    public String toString() {
        return "Service room type: " + type;
    }
}

class Car {
    String model;
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
    private String accessName; // never used idk what to do with it ¯\_ (ツ)_/¯
    private int carCapacity;
    private Stack<Car> stack = new Stack<>();

    public Garage(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    public boolean enterGarage(Car car) {
        if (stack.size() <= carCapacity) {
            stack.push(car);
            return true;
        } else {
            return false;
        }
    }

    public Car exitGarage() {
        return stack.pop();
    }

    public void PrintGarageStorage() {
        for (Car car : stack) {
            System.out.println(car);
        }
    }

    public boolean isOwenOn() {
        return owenOn;
    }

    public void getAccess(String name) {
        accessName = name;
        owenOn = true;
    }
    public String toString() {
        return "Garage car capacity: " + carCapacity;
    }
}