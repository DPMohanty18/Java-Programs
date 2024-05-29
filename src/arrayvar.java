import java.util.Scanner;

class Arrayvar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Positive elements:");
        for (int i = 0; i < 5; i++) {
            if (a[i] > 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Negative elements:");
        for (int i = 0; i < 5; i++) {
            if (a[i] < 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Even elements:");
        for (int i = 0; i < 5; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd elements:");
        for (int i = 0; i < 5; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}