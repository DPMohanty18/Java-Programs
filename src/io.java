import java.io.BufferedReader;
import java.io.InputStreamReader;

class Io{
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String s = br.readLine();
        System.out.println("welcome "+s);
    }
}