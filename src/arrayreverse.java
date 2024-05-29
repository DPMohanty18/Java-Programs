import java.util.Scanner;

class Arrayreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements of the array in reverse order:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
