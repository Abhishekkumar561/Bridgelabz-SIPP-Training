package Level2;

import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        while (i <= number) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
    }
}
