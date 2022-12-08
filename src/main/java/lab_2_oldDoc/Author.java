package lab_2_oldDoc;

public class Author {
    private String name;
    private String email;
    private char gender; //M - Male / F - Female

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(String name, char gender){
        this(name,"NAN",gender);
    }
    public Author(){
        this("Meos","8268826@gmail.com",'M');
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
