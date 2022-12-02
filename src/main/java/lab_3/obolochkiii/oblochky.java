package lab_3.obolochkiii;

public class oblochky {
    public static void main(String[] args) {
        //1
        Double db = Double.valueOf(2.4);
        //2
        String str = "2.5";
        Double dbr = Double.parseDouble(str);
        //3
        int i = db.intValue();
        float f = db.floatValue();
        byte b = db.byteValue();
        short s = db.shortValue();
        //4
        System.out.println(db+ " " + i);
        //5
        String str1 = Double.toString(db);
    }
}
