public class printStringMultipleTimes {
    public static void main(String[] args) {
        printStringMultipleTimes("Hello", 3);
        printStringMultipleTimes("Java", 5);
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}