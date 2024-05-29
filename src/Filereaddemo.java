import java.util.Scanner;
import java.io.*;
class Filereaddemo{
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("d.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        StringBuilder stringBuilder = new StringBuilder();
        int i;
        while((i= bin.read())!=-1){
            System.out.print((char)i);
            //stringBuilder.append((char) i);
        }
        //System.out.println(stringBuilder.toString());
        bin.close();
        fin.close();
    }
}