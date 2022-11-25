/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, invierta el orden del contenido (por ejemplo: el que está en 0 se intercambia
con el que está en 9, el que está en 1 con el que está en 8...) */
import java.util.Random;
public class Ejercicio1 {
    public static final int MAX=10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
    public static void main (String[] args) {
        int [] arroriginal;
        arroriginal= new int[MAX];
        cargar_arreglo_aleatorio(arroriginal);
        imprimir_arreglo_aleatorio(arroriginal);
        invertir_orden_arr(arroriginal);
    }
    public static void cargar_arreglo_aleatorio(int[]arr) {
        Random r = new Random();
        for (int i=0; i<MAX; i++){
            arr[i]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
        }
    }
    public static void imprimir_arreglo_aleatorio(int[]arr) {
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i]+"|");
        }
        System.out.println();
    }
    public static void invertir_orden_arr (int[]arr) {
        for (int i=MAX-1; i>-1; i--) {
            System.out.print(arr[i]+"|");
        }
    }
}