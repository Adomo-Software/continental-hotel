package com.adomasda;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    public void FloorTest() {
        System.err.println("FloorTest");
        Floor floor = new Floor();
        floor.addRoom(new Room(1,2));
        floor.printRoom();
    }

    @Test
    public void RoomCapacityOf2Test() {
        System.err.println("RoomCapacityOf2Test");
        System.out.println(new Room(2,0));

    }

    @Test
    public void RoomCapacityOf3Test() {
        System.err.println("RoomCapacityOf3Test");
        System.out.println(new Room(3,0));
    }

    @Test
    public void KitchenTest() {
        System.err.println("KitchenTest");
        Kitchen kitchen = new Kitchen(3.5);

        System.out.println(kitchen);
    }
}


