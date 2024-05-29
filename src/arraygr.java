import java.util.*;
class Arraygr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int max;
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<5;i++)
        {
            a[i]= sc.nextInt();
        }
        max=a[0];
        for(int i=0;i<5;i++)
        {
            if (a[i]>max)
                max=a[i];
        }
        System.out.println("The highest value is:"+max);
    }

}