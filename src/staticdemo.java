class Staticdemo{
    static int count=0;
    Staticdemo(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Staticdemo c1 = new Staticdemo();
        Staticdemo c2 = new Staticdemo();
        Staticdemo c3 = new Staticdemo();
    }
}