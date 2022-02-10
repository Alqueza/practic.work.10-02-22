import tech.Tech;
import tech.appliances.tech.Appliances;
import tech.appliances.tech.fridge.Fridge;
import tech.appliances.tech.washing.Washing;
import tech.militarty.tech.MilitaryEquipment;
import tech.militarty.tech.gun.Gun;
import tech.militarty.tech.tank.Tank;
import tech.vehicles.tech.Vehicles;
import tech.vehicles.tech.car.Car;
import tech.vehicles.tech.truck.Truck;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Формула 1","200kg",1000,1000);
    car.turnOn();
    car.speed();
    car.turnOff();
    System.out.println();
    Vehicles truck = new Truck("Kamaz","1000kg",500,300);
    truck.turnOn();
    truck.turnOff();
    System.out.println();

    Fridge fridge = new Fridge("Холодильник","20kg",150,"Гарантия 1 год");
    fridge.on();
    fridge.freez();
    fridge.off();
    System.out.println();

    Washing washing = new Washing("Стиральная машина","15 kg",1999,"гарантия 3 года");
    washing.on();
    washing.moika();
    washing.off();
    washing.breek();
    System.out.println();

    Tank tank = new Tank("T34","200 kg",36000,300);
    tank.on();
    tank.shoot();
    tank.benz();
    System.out.println();

    Gun gun = new Gun("Sniper","6 kg",15000,150);
    gun.shoot();
    gun.clin();
  }
}
