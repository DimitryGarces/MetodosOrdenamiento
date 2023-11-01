package principal;

import java.util.Arrays;

/**
 *
 * @author Diego
 */
public class Exe {

    static Burble bur = new Burble();
    static InsertionSort inser = new InsertionSort();
    static SelectionSort sele = new SelectionSort();

    public static void main(String[] args) {
        //Arreglo de ejemplo
        int[] arr = {4, 6, 8, 2, 1, 6}, arrOrden;
//        arrOrden = bur.burbleSort(arr);
//        arrOrden = inser.insersionSort(arr);
        arrOrden = sele.selectionSort(arr);
        System.out.println(show(arrOrden, ""));
    }

    //Metodo recursivo para mostrar el arreglo ordenado de acuerdo al metodo solicitado
    public static String show(int[] arr, String cad) {
        if (arr.length > 0) {
            cad += arr[arr.length - 1] + " - ";
            int[] newArr = Arrays.copyOf(arr, arr.length - 1);
            return show(newArr, cad);
        } else {
            return cad;
        }
    }
}
