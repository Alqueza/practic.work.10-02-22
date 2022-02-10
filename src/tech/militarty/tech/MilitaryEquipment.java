package tech.militarty.tech;

import tech.Tech;

public class MilitaryEquipment extends Tech {
private int damage;
    public MilitaryEquipment(String name, String weight, int sell,int damage) {
        super(name, weight, sell);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void shoot(){
        System.out.println(name+" Выстрелил");
    }

    @Override
    public String toString() {
        return "     /// Военное снаряжение ///" +
                "\n Название:" + name +
                "\n Вес:" + weight +
                "\n Цена:" + sell +
                "\n Урон:" + damage;
    }
}