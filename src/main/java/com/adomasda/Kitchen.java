package com.adomasda;

class Kitchen implements Room {
    private boolean ovenOn = false;
    private String accessName;
    private double foodCapacity;

    public Kitchen(double foodCapacity) {
        this.foodCapacity = foodCapacity;
    }

    public boolean isOvenOn() {
        return ovenOn;
    }

    public void setAccess(String name) {
        this.accessName = name;
        this.ovenOn = true;
    }
    public String getAccess() {
        return this.accessName;
    }
    public String toString() {
        return "Food capacity: " + foodCapacity + " cubic meters";
    }
}
