import java.util.Scanner;

class Sinterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int p = sc.nextInt();
        int t = 5;
        int r = 5;
        int si = (p *t *r)/100;
        System.out.println("Simple Interest= "+si);
    }
}