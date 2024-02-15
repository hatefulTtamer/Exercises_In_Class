/* Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
L'array ottenuto dovrà essere stampato a video. */

import java.util.Arrays;

public class EsercizioInClasse14_02_2024 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4};
        System.out.println(Arrays.toString(removeDuplicate(array)));
    }


    public static boolean isDuplicate(int[] arr, int i) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j] && i != j) {
                return true;
            }
        }
        return false;
    }

    public static int[] removeDuplicate(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            if (isDuplicate(arr, i)) {
                temp[i] = -1;
            } else {
                temp[i] = arr[i];
            }
        }
        return temp;
    }
}
