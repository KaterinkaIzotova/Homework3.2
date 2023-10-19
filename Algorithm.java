import java.util.Scanner;
public class Algorithm {
    int number;
    public Algorithm(int number) {
        this.number = number;
    }
    public char[] getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int t;
        String x;
        var l = Integer.toString(number);
        while ((t = String.valueOf(x = scan.nextLine()).length()) > l.length() || t < l.length()) {
            if (x.equals("сдаюсь")) {
                System.out.println("Игра окончена");
                System.exit(0);
            } else {
                System.out.println("Неверное число. Повторите попытку:");
            }
        }
        System.out.println("Введенное число:" + x);
        char[] myNumber = x.toCharArray();
        return myNumber;
    }
    public int findNumber(char[] myNumber, int t) {
        var k = Integer.toString(t);
        char[] pkNumber = k.toCharArray();
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < myNumber.length; i++) {
            if (myNumber[i] == pkNumber[i]) {
                bulls++;
            }
            for (int j = 0; j < myNumber.length; j++) {
                if (myNumber[i] == pkNumber[j]) {
                    cows++;
                }
            }
        }
        if (bulls == pkNumber.length) {
            System.out.println("Количество быков:" + bulls);
            System.out.println("Загаданное число: " + number);
            System.out.println("Вы выиграли!");
        } else {
            System.out.println("Количество быков:" + bulls);
            System.out.println("Количество коров:" + (cows - bulls));
        }
        return bulls;
    }
}