package src.lab_3.FormatString.task_3;

public class task_3 {
    public static class Employee{
        private String fullName;
        private int salary;

        public Employee(String fullName, int salary){
            this.fullName = fullName;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return String.format("%1$s's employee has a salary of %2$d",fullName,salary);
        }
    }
    public static class Report{
        public static void CreateReport(Employee...employees) {
            for (int i = 0; i < 3; i++)
                System.out.println(employees[i]);
        }
    }
    public static void main(String[] args) {
            Employee[] employees = new Employee[3];
            employees[0] = new Employee("Tuan",100000);
            employees[1] = new Employee("Vinh",140000);
            employees[2] = new Employee("Bang",102000);
            Report.CreateReport(employees);
    }
}
