package tech.vehicles.tech.truck;

import tech.vehicles.tech.Vehicles;

public class Truck extends Vehicles {
    public Truck(String name, String weight, int sell, int speed) {
        super(name, weight, sell, speed);
    }

    @Override
    public String toString() {
        return "  /// Грузовик ///" +
                "\n Название:" + name +
                "\n Вес:" + weight +
                "\n Цена:" + sell +
                "\n Скорость:" + speed;
    }
}