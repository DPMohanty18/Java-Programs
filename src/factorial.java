import java.util.*;
class Factorial{
    public static void main(String[] args){
        int fact=1,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        while(n>0){
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial= "+fact);
    }
}
