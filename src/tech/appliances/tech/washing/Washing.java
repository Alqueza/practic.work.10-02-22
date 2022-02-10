package tech.appliances.tech.washing;

import tech.appliances.tech.Appliances;

public class Washing extends Appliances {
    public Washing(String name, String weight, int sell,String guarantee) {
    super(name, weight, sell,guarantee);
}
public void moika(){
    System.out.println(name+" Начинает стирку");
}
}