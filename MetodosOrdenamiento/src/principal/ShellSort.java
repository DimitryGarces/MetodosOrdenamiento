package principal;

/**
 *
 * @author Diego
 */
public class ShellSort {

    /*
    Es una generalización del ordenamiento por inserción
    Paso 1:
    A partir de la longitud del arr, se ira diviendo en 2 para sacar subarreglos de longitud (i) > 0
    Paso 2:
    Iniciando en la longitud resultante, Compararemos el valor en dicha posicion (temp)
    Paso 3:
    Iniciando en la posicion del ciclo anterior, validamos que el arreglo en la posicion 0 (k-i)
    no sea mayor que el valor en la posicion j (3,2,1...), se ira restando el valor de (i)
    Paso 4:
    Dado que se cumpla la condicion, moveremos nuestros datos 1 hacia la derecha haciendo espacio a temp
    Paso 5:
    Colocamos a Temp en la posicion que le corresponde
     */
    public int[] shellSort(int[] arr) {
        for (int i = arr.length / 2; i > 0; i /= 2) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[j];
                int k;
                for (k = j; k >= i && arr[k - i] < temp; k -= i) {
                    arr[k] = arr[k - i];
                }
                arr[k] = temp;
            }
        }
        return arr;
    }
}
