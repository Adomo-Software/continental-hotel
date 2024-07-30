package com.adomasda;

import org.junit.jupiter.api.Test;

public class HouseTest {

    @Test
    public void SimpleTest(){
        System.err.println("SimpleTest");
        House house = new House(1,2);
        System.out.println(house.isOwenOn());
        System.out.println(house);
    }

    @Test
    public void FloorTest() {
        System.err.println("FloorTest");
        Floor floor = new Floor();
        floor.addRoom(new House(1,2));
        floor.printHouse();
    }
}


