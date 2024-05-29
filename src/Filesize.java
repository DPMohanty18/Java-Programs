import java.io.FileReader;

public class Filesize {
    public static void main(String[] args) throws Exception
    {

        FileReader f=new FileReader("C:/Users/ts280/Documents/Workspace/Java Programming/e.txt");
        int data, l=0,w=1, lineCount=1;
        while ((data=f.read()) != -1){
            l++;
            if(data==' ' || data=='\n'){
                w++;
            }
            if (data == '\n') {
                lineCount++;
            }
            System.out.print((char)data);
        }
        System.out.println("\n"+"Length of file :"+l);
        System.out.println("Number of words :"+w);
        System.out.println("Number of Lines :"+lineCount);
        f.close();
    }
}