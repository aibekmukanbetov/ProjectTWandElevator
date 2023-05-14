package Elevator;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int currentFloor = random.nextInt(1, 18);
        Elevator elevator = new Elevator(currentFloor);
        while (true) {
            elevator.move();
        }
    }
}
