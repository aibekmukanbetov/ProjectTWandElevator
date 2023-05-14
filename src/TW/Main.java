package TW;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(1,5);
        Television television = new Television(rand, 5);
        char remote;
        do {
            Television.displayChannel();
            System.out.println("---------------------------------");
            System.out.println("n. для переключения телевизора на следующий канал");
            System.out.println("p. для переключения телевизора на предыдущий канал");
            System.out.println("s. для переключения телевизора на определенный канал по его порядковому номеру");
            System.out.println("e. для отключения телевизора ");
            System.out.println("---------------------------------");
            Scanner scanner = new Scanner(System.in);
            remote = scanner.next().charAt(0);


            switch (remote) {
                case 'n':
                    Television.nextChannel();
                    break;
                case 'p':
                    Television.previousChannel();
                    break;
                case 's':
                    System.out.print("Выберите канал: ");
                    Scanner sc = new Scanner(System.in);
                    int number = sc.nextInt();
                    Television.goToChannel(number);
                    break;
                case 'e':
                    System.out.println("Выключение телевизора");
                    break;
                default:
                    System.out.println("Неправильно выбран режим, попробуйте еще раз");
            }
        } while (remote != 'e');
    }
}
