public class fillDiagonal {
    public static void main(String[] args) {
        int size = 5; // Размер квадратного массива
        int[][] array = new int[size][size];
        fillDiagonal(array, size);
        printArray(array, size);
    }

    public static void fillDiagonal(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1; // Заполнение второй диагонали (если нужно)
        }
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}