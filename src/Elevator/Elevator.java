package Elevator;

import java.util.Scanner;

public class Elevator {
    private int currentFloor;
    private final double maxCapacity= 200;
    private final int maxFloor =18;

    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    public void move() {
        System.out.println("Вы находитесь на " + currentFloor+ " этаже.");
        System.out.print("Введите номер этажа, на который нужно отвезти (1-18): ");
        Scanner scanner1 = new Scanner(System.in);
        int toFloor = scanner1.nextInt();
        if (!isAllowableFloor(toFloor)) {
            System.out.println("Недопустимый номер этажа. Пожалуйста, повторите ввод.");
            return;
        }
        System.out.print("Введите вес груза: ");
        Scanner scanner2 = new Scanner(System.in);
        int weight = scanner2.nextInt();
        if (isAllowableWeight(weight)) {
            System.out.println("Груз принят. Перемещаемся на указанный этаж...");
        }else {
            System.out.println("Превышен максимальный допустимый вес. Пожалуйста, повторите ввод.");
        }
        System.out.println("Начинаем перемещение на этаж " + toFloor + "...");
        while (currentFloor != toFloor) {
            if (toFloor > currentFloor) {
                currentFloor++;
                System.out.println("Проходим через этаж " + currentFloor);
            }else{
                currentFloor--;
                System.out.println("Проходим через этаж " + currentFloor);
            }
        }
        System.out.println("Лифт достиг указанного этажа " + toFloor);
    }


    public boolean isAllowableWeight(int weight) {
        return weight <= maxCapacity;
    }
    public boolean isAllowableFloor(int floor) {
        return floor >= 1 && floor <= maxFloor;
    }

}
