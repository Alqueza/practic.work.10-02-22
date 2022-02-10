package tech.militarty.tech.tank;

import tech.militarty.tech.MilitaryEquipment;

public class Tank extends MilitaryEquipment {
    public Tank(String name, String weight, int sell, int damage) {
        super(name, weight, sell, damage);
    }
    public void on(){
        System.out.println(name +" завелся и готов к бою!");
    }
    public void off(){
        System.out.println(name+" заглушен и прекратил движение");
    }
    public void benz(){
        System.out.println(name+" Бензин закончился, тащи канистру а то не сдвинешься");
    }
}