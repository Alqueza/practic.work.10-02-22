package tech.militarty.tech.gun;

import tech.militarty.tech.MilitaryEquipment;

public class Gun extends MilitaryEquipment {
    public Gun(String name, String weight, int sell,int damage){
        super(name,weight,sell,damage);
    }
    public void clin(){
        System.out.println(name+" заклинил");
    }
}
