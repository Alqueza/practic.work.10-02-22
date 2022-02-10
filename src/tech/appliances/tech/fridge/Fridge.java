package tech.appliances.tech.fridge;

import tech.appliances.tech.Appliances;

public class Fridge extends Appliances {
    public Fridge(String name, String weight, int sell,String guarantee) {
        super(name, weight, sell,guarantee);
    }
    public void freez(){
        System.out.println(name+" Охлаждает блюда");
    }
}