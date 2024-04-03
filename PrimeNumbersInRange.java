package practice_java_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int x = s.nextInt();
        System.out.print("Enter ending range: ");
        int y = s.nextInt();
        s.close();

        List<Integer> primeNumbers = getPrimeNumbers(x, y);
        System.out.println("Prime numbers in the range [" + x + ", " + y + "]: " + primeNumbers);
    }

    public static List<Integer> getPrimeNumbers(int x, int y) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int number = x; number <= y; number++) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

