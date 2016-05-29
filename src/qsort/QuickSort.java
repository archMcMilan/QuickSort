package qsort;

/**
 * Created by Артем on 25.05.2016.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] mass = {1, 3, 7, 5, 2, 6, 1, 7, 0};
        mass = qSort(mass, 0, mass.length - 1);
        print(mass, 0);
    }

    public static int[] qSort(int[] mas, int start, int finish) {
        int left = start, right = finish;
        int op = mas[(left + right) / 2];
        System.out.println("op="+op);
        while (left <= right) {
            while (mas[left] < op){
                left++;
            }
            while (mas[right] > op){
                right--;

            }
            if (left <= right) {
                int temp = mas[left];
                mas[left] = mas[right];
                mas[right] = temp;
                left++;
                right--;
            }
        }
        if (start < right)
            mas = qSort(mas, start, right);
        if (finish > left)
            mas = qSort(mas, left, finish);
        return mas;
    }

    private static void print(int[] mas, int i) {
        if (i < mas.length) {
            System.out.println(mas[i]);
            i++;
            print(mas, i);
        }
    }
}
