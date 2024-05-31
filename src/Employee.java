public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", "Менеджер", "ivanov@example.com", "+1234567890", 50000.0, 30);
        employee1.printInfo();
        Employee employee2 = new Employee("Петров Петр Петрович", "Инженер", "petrov@example.com", "+98765432101", 37895.46, 45);
        employee2.printInfo();
    }
}