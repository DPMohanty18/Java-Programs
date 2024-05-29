import java.util.Scanner;

class Arraysl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int largest = a[0];
        int smallest = a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}