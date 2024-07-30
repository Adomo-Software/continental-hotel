package com.adomasda;

import org.junit.jupiter.api.Test;

public class HouseTest {

    @Test
    public void SimpleTest(){
        House house = new House();
        System.out.println(house.isOwenOn());
    }
}
