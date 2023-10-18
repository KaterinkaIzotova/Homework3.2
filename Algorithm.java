import java.util.Scanner;
public class Algorithm {
    int number;
    public Algorithm (int number) {
        this.number = number;
    }
    public int getNumber () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int t;
        String x;
        var l = Integer.toString(number);

        while ((t = String.valueOf(x = scan.nextLine()).length()) > l.length() || t < l.length())   {
            System.out.println("Неверное число. Повторите попытку:");
        }
        System.out.println("Введенное число:" + x);

        char[] myNumber = x.toCharArray();
        char[] pkNumber = l.toCharArray();
        int bulls = 0;

        String[] result = new String[myNumber.length];
        for (int i = 0; i < myNumber.length; i++) {
            if (myNumber[i] == pkNumber[i]) {
                bulls++;
            }
            result[i] = String.valueOf(i);
        }
        int cows = 0;

        return t;
    }
}
