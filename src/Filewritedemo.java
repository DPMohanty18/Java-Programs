import java.util.Scanner;
import java.io.*;
class Filewritedemo{
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("d.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s="Good Morning";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.close();
        fout.close();
    }
}