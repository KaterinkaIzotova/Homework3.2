import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Выберите сложность игры");
        int x = sc.nextInt();

        // Не пон как сделать разные цифры в числе (типа исключить 2234 и подобные)
        if (x == 3) {
            int a=100;
            int b=999;
            int randomNum1 = a + (int)(Math.random() * ((b - a) + 1));
            System.out.println("Случайное число x: " + randomNum1);
            Algorithm myAlgorithm = new Algorithm(randomNum1);
            myAlgorithm.getNumber();

        }
        else if (x == 4) {
            int a = 1000;
            int b = 9999;
            int randomNum2 = a + (int) (Math.random() * ((b - a) + 1));
            System.out.println("Случайное число x: " + randomNum2);
            Algorithm myAlgorithm = new Algorithm(randomNum2);
            myAlgorithm.getNumber();
        }
        else if (x == 5) {
            int a = 1000;
            int b = 99999;
            int randomNum3 = a + (int) (Math.random() * ((b - a) + 1));
            System.out.println("Случайное число x: " + randomNum3);
            Algorithm myAlgorithm = new Algorithm(randomNum3);
            myAlgorithm.getNumber();
        }
        else {
            System.out.println("Вы ввели некорректное число. Конец игры.");
        }
    }
}
