public class databaseEmployee {
            private String fullName;
        private String position;
        private String email;
        private String phoneNumber;
        private double salary;
        private int age;

        public databaseEmployee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
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
            Employee[] employees = new Employee[5];
            employees[0] = new Employee("Иванов Иван Иванович", "Менеджер", "ivanov@example.com", "+1234567890", 50000.0, 30);
            employees[1] = new Employee("Петров Петр Петрович", "Инженер", "petrov@example.com", "+9876543210", 60000.0, 35);
            employees[2] = new Employee("Сидоров Александр Иванович", "Дизайнер", "sidorov@example.com", "+111222333", 45000.0, 28);
            employees[3] = new Employee("Смирнова Елена Петровна", "Тестировщик", "smirnova@example.com", "+444555666", 55000.0, 32);
            employees[4] = new Employee("Козлова Ольга Игоревна", "Аналитик", "kozlova@example.com", "+777888999", 70000.0, 40);

            for (Employee employee : employees) {
                employee.printInfo();
                System.out.println();
            }
        }
    }
