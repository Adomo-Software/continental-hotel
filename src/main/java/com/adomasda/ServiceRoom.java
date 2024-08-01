package com.adomasda;

class ServiceRoom extends Room {
    private boolean ovenOn = false;
    private String type;
    private String accessName;

    public ServiceRoom(String type) {
        this.type = type;
    }

    public boolean isOvenOn() {
        return ovenOn;
    }

    @Override
    public void setAccess(String name) {
        this.accessName = name;
        this.ovenOn = true;
    }

    public String toString() {
        return "Service room type: " + type;
    }
}
