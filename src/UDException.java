class NoMatchException extends Exception{
    public NoMatchException(String message){
        super(message);
    }
}
class UDException{
    public static void main(String[] args) {
        try{
            String s="RAHUL";
            if (!s.equals("BPUT")) {
                throw new NoMatchException("String does not match 'BPUT'");
            }

        }
        catch (NoMatchException e){
            System.out.println(e.getMessage());
        }
    }
}