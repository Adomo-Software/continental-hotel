package com.adomasda;

import java.util.ArrayList;
import java.util.List;

class Floor {
    private List<Room> rooms;

    public Floor() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void printRoom() {
        if (this.rooms.size() > 0) {
            System.out.print("(" + this.rooms.size() + " Rooms)");
        }
        System.out.println();
        for (Room room : this.rooms) {
            System.out.println(room);
        }
    }
}
