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

class Garage extends Room {
    private int carCapacity;
    private boolean isEmpty;

    public Garage(int carCapacity) {
        this.carCapacity = carCapacity;
        this.isEmpty = true;
    }

    public String toString() {
        return "Garage car capacity: " + carCapacity;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
