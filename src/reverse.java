import java.util.Scanner;

class Reverse{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int rn = 0;
        while (n != 0) {
            int dig = n % 10;
            rn = rn * 10 + dig;
            n /= 10;
        }
        System.out.println("Reversed Number ="+rn);
    }
}