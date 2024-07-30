package com.adomasda;

import org.junit.jupiter.api.Test;

public class RoomTest {
    @Test
    public void FloorTest() {
        System.err.println("FloorTest");
        Floor floor = new Floor();
        floor.addRoom(new Room(1, 2));
        floor.printRoom();
    }

    @Test
    public void RoomCapacityOf2Test() {
        System.err.println("RoomCapacityOf2Test");
        System.out.println(new Room(2, 0));
    }

    @Test
    public void RoomCapacityOf3Test() {
        System.err.println("RoomCapacityOf3Test");
        System.out.println(new Room(3, 0));
    }

    @Test
    public void KitchenTest() {
        System.err.println("KitchenTest");
        Kitchen kitchen = new Kitchen(3.5);

        System.out.println(kitchen);
    }

    @Test
    public void ServiceRoomTest() {
        System.err.println("ServiceRoomTest");
        ServiceRoom serviceRoom = new ServiceRoom("hair salon");
        System.out.println(serviceRoom);
    }

    @Test
    public void GarageTest() {
        System.err.println("GarageTest");
        Garage garage = new Garage(4);
        System.out.println(garage.enterGarage(new Car("Renault Mégane 2002")));
        System.out.println(garage.enterGarage(new Car("Renault Mégane 2002")));
        System.out.println(garage.enterGarage(new Car("Renault Mégane 2002")));
        System.out.println(garage.enterGarage(new Car("Renault Mégane 2002")));
        System.out.println(garage.enterGarage(new Car("Toyota Yaris")));
        System.out.println(garage.exitGarage());
        System.out.println(garage.enterGarage(new Car("Renault Mégane 2002")));
        System.out.println(garage);
        garage.PrintGarageStorage();
    }
}
