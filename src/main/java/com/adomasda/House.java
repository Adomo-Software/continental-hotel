package com.adomasda;

interface HouseInterface {
    boolean isOwenOn();  // getter
    void  getAccess(String name); // setter
}

class House implements HouseInterface {
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
