package lab_2_oldDoc;

import static java.lang.System.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Vinh","Vinh@gmail.com",'M');
        Author a2 = new Author("Linh",'F');
        Author a3 = new Author();
        a2.setEmail("Linh@gmail.com");
        out.println(a1);
        out.println(a2);
        out.println(a3);
    }
}
