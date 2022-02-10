package tech.appliances.tech;

import tech.Tech;

public class Appliances extends Tech {
    protected String guarantee;
    public Appliances(String name,String weight,int sell,String guarantee){
       super(name,weight,sell);
       this.guarantee = guarantee;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }
    public void breek(){
        System.out.println(name+" упс, кажется она сломалась");
    }

    @Override
    public String toString() {
        return "      /// Бытовая техника ///" +
                "\n Название:" + name +
                "\n Вес:" + weight +
                "\n Цена:" + sell +
                "\n Гарантия:" + guarantee;
    }
}
