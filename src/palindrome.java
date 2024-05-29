import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int a=n;
        int rn = 0;
        while (n != 0) {
            int dig = n % 10;
            rn = rn * 10 + dig;
            n /= 10;
        }
        if(a==rn){
            System.out.println("It is a plaindrome.");
        }
        else
            System.out.println("It is not a palindrome.");
    }
}