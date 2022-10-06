package src;

public class test {
     public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public static String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for" + key;
    }
    public static void main(String[] args) {
        String key = null;
        printMessage(getDetails(key));
    }// end main
}
