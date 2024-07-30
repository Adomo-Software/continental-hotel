package com.adomasda;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    public void SimpleTest(){
        System.err.println("SimpleTest");
        Room room = new Room(1,2);
        System.out.println(room.isOwenOn());
        System.out.println(room);
    }

    @Test
    public void FloorTest() {
        System.err.println("FloorTest");
        Floor floor = new Floor();
        floor.addRoom(new Room(1,2));
        floor.printRoom();
    }
}


