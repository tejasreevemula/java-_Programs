package practice_java_programs;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        int N = s.nextInt();
        int K = s.nextInt();

        
        int[] arr = new int[N];

        
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }

        
        rotateArray(arr, K);

        
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    
    private static void rotateArray(int[] arr, int K) {
        int N = arr.length;
        K %= N; 
        reverseArray(arr, 0, N - 1);
        reverseArray(arr, 0, K - 1);
        reverseArray(arr, K, N - 1);
    }

    
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
