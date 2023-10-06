package principal;

/**
 *
 * @author Dimitry
 */
public class Burble {

    public static void main(String[] args) {
        /*
        Cada vuelta deberas recorrer un indice menos hasta llegar a 0
        El primer valor que consideramos nunca podra ser el valor del ultimo indice del arreglo
        El segundo valor jamas llega a ser el primer indice
        Puede terminar antes si realiza un recorrido sin presentar cambios
        Si la condición establecida se cumple, intercambiaran valores entre indices
        */
        
        int[] arr = {4, 6, 8, 2, 1, 6};
        
        boolean intercambio;
        for (int i = 0; i < arr.length - 1; i++) {
            intercambio=false;
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    intercambio=true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
        
    }
}
