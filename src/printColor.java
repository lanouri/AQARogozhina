public class printColor {

    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 75; // Инициализация переменной value значением 75

        if (value < 0) {
            System.out.println("Красный"); // Вывод сообщения, если value меньше 0
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый"); // Вывод сообщения, если value в пределах от 0 до 100
        } else {
            System.out.println("Зеленый"); // Вывод сообщения, если value больше 100
        }
    }
}