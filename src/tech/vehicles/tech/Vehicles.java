package tech.vehicles.tech;

import tech.Tech;

public class Vehicles extends Tech {
    protected int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Vehicles(String name, String weight, int sell, int speed){
    super(name,weight,sell);
    this.speed = speed;
}
public void turnOn(){
        System.out.println(name+" Завелся");
    }
    public void turnOff(){
        System.out.println(name+" Заглушен");
    }

    @Override
    public String toString() {
        return "  /// Техника ///" +
                "\n Название:" + name +
                "\n Вес:" + weight +
                "\n Цена:" + sell +
                "\n Скорость:" + speed;
    }
}
