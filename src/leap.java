import java.util.*;
import java.io.*;
class Leap {
    public static void main(String[] args) {
        int yr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        yr = sc.nextInt();
        if ((yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0) {
            System.out.println("It is a Leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }
    }
}
