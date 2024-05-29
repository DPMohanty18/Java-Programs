import java.util.*;

class Rectangle {
    int l;
    int b;

    void getdata(int a, int c) {
        l = a;
        b = c;
    }

    void area() {
        int ar = l * b;
        System.out.println("Area is = " + ar);
    }

    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        re.getdata(10, 20);
        re.area();
    }
}
