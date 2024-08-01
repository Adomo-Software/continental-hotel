package com.adomasda;

class ServiceRoom implements Room {
    private boolean ovenOn = false;
    private String accessName;
    private String type;

    public ServiceRoom(String type) {
        this.type = type;
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
        return "Service room type: " + type;
    }
}
