import java.util.*;
class triangle {

    public static void main(String[] args) {
        double b,h,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth: ");
        b = sc.nextInt();
        System.out.println("Enter the height: ");
        h = sc.nextInt();
        a= 0.5*b*h;
        System.out.println("Area= "+a);

    }
}