/* Scrivere un programma che contenga un metodo che permette di inizializzare una matrice riempita con dei valori
a vostro piacimento e restituisca la somma degli elementi sulla prima riga. */

public class EsercizioInClasse08_02_2024 {
    public static void main(String[] args) {
        int[][] numbers = createArray();
        int printSum = sumOfArray(numbers);
        System.out.println("La somma dei valori dell'array multidimensionale corrisponde a = " + printSum);
    }

    public static int[][] createArray() {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
        }
        return array;
    }


    public static int sumOfArray(int[][] arr) {
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sum += arr[0][j];
        }
        return sum;
    }
}
