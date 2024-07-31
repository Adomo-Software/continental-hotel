package com.adomasda;

class ServiceRoom implements Room {
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
