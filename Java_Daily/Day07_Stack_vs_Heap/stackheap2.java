package Java_Daily.Day07_Stack_vs_Heap;

public class stackheap2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 10;
        System.out.println("Car speed before race: " + myCar.speed);
        accelerate(myCar);
        System.out.println("Main: Speed after race = " + myCar.speed);
    }
    
    public static void accelerate(Car c) {
        c.speed = 100;
        System.out.println("Method: I have changed the speed to 100");

    }
}
class Car {
    int speed;
}
