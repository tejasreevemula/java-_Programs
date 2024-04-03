package practice_java_programs;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        s.close();

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("NotPrime");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

