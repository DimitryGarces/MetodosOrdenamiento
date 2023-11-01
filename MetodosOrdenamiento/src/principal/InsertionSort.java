package principal;

/**
 *
 * @author Diego
 */
public class InsertionSort {

    /*
    Las iteraciones inician con el elemento [1] y se ira recorriendo uno a la vez hasta llegar al ultimo elemento
    Los elementos iterados se compararan con todos los demas elementos previamente recorridos
    Cuando encuentre el elemento que cumpla la condicion de ser menor, este tendra que recorrer de posicion 
    todos esos datos que tuvo que pasar antes de llegar ahí
     */
    public int[] insersionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int elemt = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < elemt) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = elemt;
        }
        return arr;
    }

}
