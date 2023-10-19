import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите сложность игры: 3, 4, 5");
        int x = sc.nextInt();
        // Не понимаю как сделать разные цифры в числе (типа исключить 2234 и подобные)
        if (x == 3) {
            int a=100;
            int b=999;
            int cnt = 0;
            int cntBulls = 0;
            int randomNum1 = a + (int)(Math.random() * ((b - a) + 1));

            // System.out.println("Случайное число x: " + randomNum1);
            Algorithm myAlgorithm = new Algorithm(randomNum1);
            do {
                cntBulls = myAlgorithm.findNumber(myAlgorithm.getNumber(),randomNum1);
                cnt ++;
            }
            while (cntBulls != 3);
            System.out.println("Количество попыток: " + cnt);

        }
        else if (x == 4) {
            int a = 1000;
            int b = 9999;
            int cnt = 0;
            int cntBulls = 0;
            int randomNum2 = a + (int)(Math.random() * ((b - a) + 1));

            // System.out.println("Случайное число x: " + randomNum1);
            Algorithm myAlgorithm = new Algorithm(randomNum2);
            do {
                cntBulls = myAlgorithm.findNumber(myAlgorithm.getNumber(),randomNum2);
                cnt ++;
            }
            while (cntBulls != 4);
            System.out.println("Количество попыток: " + cnt);

        }
        else if (x == 5) {
            int a = 1000;
            int b = 99999;
            int cnt = 0;
            int cntBulls = 0;
            int randomNum1 = a + (int)(Math.random() * ((b - a) + 1));

            // System.out.println("Случайное число x: " + randomNum1);
            Algorithm myAlgorithm = new Algorithm(randomNum1);
            do {
                cntBulls = myAlgorithm.findNumber(myAlgorithm.getNumber(),randomNum1);
                cnt ++;
            }
            while (cntBulls != 5);
            System.out.println("Количество попыток: " + cnt);
        }
        else {
            System.out.println("Вы ввели некорректное число. Конец игры.");
        }
    }
}
