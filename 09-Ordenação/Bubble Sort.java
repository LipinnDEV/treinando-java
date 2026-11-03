import java.util.Arrays;
public class Main {
public static void main(String[] args) {
  
        int[] numeros = {5, 2, 8, 1, 3, 9, 4, 7, 6};
        System.out.println("Array original:");
        System.out.println(Arrays.toString(numeros));
        bubbleSort(numeros);
        System.out.println("\nArray ordenado:");
        System.out.println(Arrays.toString(numeros));
    }
    static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i + 1 < n; i++) {
            boolean swapped = false;
            for (int j = 0; j + 1 < n - i; j++) {
              
            if (a[j] > a[j + 1]) {
            int tmp = a[j];
            a[j] = a[j + 1];
            a[j + 1] = tmp;
            swapped = true;
                }
            }
            if (!swapped) {
            break;
            }
        }
    }
}
