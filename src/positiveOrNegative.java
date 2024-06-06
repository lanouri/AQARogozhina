public class positiveOrNegative {
    public static void main(String[] args) {
        checkPositiveOrNegative(-5);
        checkPositiveOrNegative(0);
        checkPositiveOrNegative(10);
    }

    public static void checkPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println(number + " положительное число.");
        } else {
            System.out.println(number + " отрицательное число.");
        }
    }
}