package modul2.Latihan;

public class Car {
    int cadence;
    int speed;
    int gear;

    void changeCadence(int cadenceCar){
        cadence = cadenceCar;
    }

    void speedUp(int speedCar){
        speed = speedCar;
    }

    void changeGear(int gearCar){
        gear = gearCar;
    }

    void printInfo(){
        System.out.println(
            "Cadence Car    : " + cadence + "\n" +
            "Speed Car      : " + speed + "\n" +
            "Gear Car       : " + gear + "\n" +
            "---------------------------------\n"
        );
    }
}
