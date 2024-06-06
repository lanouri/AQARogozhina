public class checkSumInRange {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        System.out.println(checkSumInRange(num1, num2));
    }

    public static boolean checkSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        for (int i = 10; i <= 20; i++) {
            if (sum == i) {
                return true;
            }
        }
        return false;
    }
}