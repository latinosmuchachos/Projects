package Sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{1, 3, 2, 4, 6, 5};

        selectionSort(array1);
        selectionSort(array2);
        printList(array1);
        printList(array2);
    }

    /**
     * Меняет местами элементы в индексах i и j.
     */
    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Находит индекс с наименьшим значением,
     * начиная с индекса при запуске (включительно)
     * и двигаясь к концу массива
     */
    public static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    /**
     * Сортирует элементы (на месте) с помощью сортировки выбором
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }

    /**
     * Выводит массив в консоль
     */
    public static void printList(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
