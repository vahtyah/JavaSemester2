package src.lab_3.FormatString;

public class FormatString {

    public static class EmployeeReport{

    }
    public static class Employee{
        private String fullName;
        private int salary;

        public Employee(String fullName, int salary){
            this.fullName = fullName;
            this.salary = salary;
        }
        public Employee(){
            this("Tuan",2000);
        }
    }
    public static class Report{
        public static void generateReport(){

        }
    }
    public static void main(String[] args) {

    }
}
