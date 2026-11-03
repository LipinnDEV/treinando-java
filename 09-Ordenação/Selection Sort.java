import java.util.Arrays;
public class Main {
public static void main(String[] args) {
  
        int[] numeros = {5, 2, 8, 1, 3, 9, 4, 7, 6};
        System.out.println("Array original:");
        System.out.println(Arrays.toString(numeros));
        selectionSort(numeros);
        System.out.println("\nArray ordenado:");
        System.out.println(Arrays.toString(numeros));
    }
    static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i + 1 < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
        }
    }
}
