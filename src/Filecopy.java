import java.io.*;

class Filecopy {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("d.txt");
        FileOutputStream fout = new FileOutputStream("e.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        int i;
        while ((i = bin.read()) != -1) {
            bout.write(i);
        }
        bout.close();
        bin.close();
        fin.close();
        fout.close();
        System.out.println("Success");
    }
}
