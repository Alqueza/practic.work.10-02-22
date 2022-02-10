package tech;

public class Tech {
    protected String name;
    protected String weight;
    protected int sell;

    public Tech(String name, String weight, int sell) {
        this.name = name;
        this.weight = weight;
        this.sell = sell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public void on(){
        System.out.println(name+" Включен");
    }
    public void off(){
        System.out.println(name+" Выключен");
    }

    @Override
    public String toString() {
        return "    /// Техника ///    " +
                "\n Название:" + name +
                "\n Вес:'" + weight +
                "\n Цена" + sell ;
    }
}
