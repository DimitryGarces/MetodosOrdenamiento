package principal;

/**
 *
 * @author Diego
 */
public class SelectionSort {

    /*
    Buscar el mínimo elemento de la lista
    Intercambiarlo con el primero
    Buscar el siguiente mínimo en el resto de la lista
    Intercambiarlo con el segundo
     */
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i], pos=i;
            int temp = min;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    pos = j;
                }
            }
            arr[i] = min;
            arr[pos] = temp;
        }
        return arr;
    }
}
