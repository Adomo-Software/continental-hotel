package com.adomasda;

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

class Garage implements Room {
    private boolean owenOn = false;
    private String accessName;
    private int carCapacity;
    private boolean isEmpty;

    public Garage(int carCapacity) {
        this.carCapacity = carCapacity;
        this.isEmpty = true;
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

    public boolean isEmpty() {
        return isEmpty; // its always empty
    }
}
