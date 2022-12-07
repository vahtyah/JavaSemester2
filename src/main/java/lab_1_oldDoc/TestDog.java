import static java.lang.System.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Box",4);
        Dog d2 = new Dog("Vinh");
        Dog d3 = new Dog();
        d3.setAge(3);
        out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}

class Dog{
        private String name;
        private int age;

        public Dog(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Dog(String name){
            this(name,0);
        }
        public Dog() {
            this("Ki",0);
        }

        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }

        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }

        @Override
        public String toString() {
            return "Name: " + this.name + ", age: " + this.age;
        }

        public void intoHumanAge(){
            out.println(this.name + "'s age in human years is " + age * 7 + " years");
        }
    }
