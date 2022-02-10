package tech.vehicles.tech.car;

import tech.vehicles.tech.Vehicles;

public class Car extends Vehicles {
    public Car(String name, String weight, int sell, int speed) {
        super(name, weight, sell, speed);
    }
    public void speed(){
        System.out.println(name+" Набрал бешеную скорость и летит словно пуля!");
    }
}