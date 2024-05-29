import java.util.*;
public class vowel{

    public static void main(String[] args) {

        char ch,al;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter: ");
        ch = sc.next().toLowerCase().charAt(0);
        al = Character.toUpperCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  )
            System.out.println(al + " is vowel");
        else
            System.out.println(al + " is consonant");

    }
}
