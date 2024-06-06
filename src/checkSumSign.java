public class checkSumSign {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = -10; // Инициализация переменной a значением 10
        int b = -5; // Инициализация переменной b значением -5

        int sum = a + b; // Сложение переменных a и b

        if (sum >= 0) {
            System.out.println("Сумма положительная"); // Вывод сообщения, если сумма положительная
        } else {
            System.out.println("Сумма отрицательная"); // Вывод сообщения, если сумма отрицательная
        }
    }
}