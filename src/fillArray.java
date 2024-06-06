public class fillArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);
        printArray(array);
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}