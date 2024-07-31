package com.adomasda;

class Kitchen implements Room {
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
