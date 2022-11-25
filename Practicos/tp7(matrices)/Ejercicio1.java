// Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
// precargada, invierta el orden del contenido por fila. Este intercambio no se debe realizar
// de manera explícita, hay que hacer un método que incluya una iteración de intercambio.
import java.util.Random;
public class Ejercicio1 {
    public static final int MAXFILA=5;
    public static final int MAXCOLUMNA=10;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 0;
    public static void main (String[] args) {
        int [][] matriz;
        matriz= new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio(matriz);
        imprimir_matriz_aleatorio(matriz);
        System.out.println();
        invertir_orden_matriz(matriz);
    }
    public static void cargar_matriz_aleatorio(int[][]matriz) {
        for (int fila=0; fila<MAXFILA; fila++){
            cargar_arreglo_aleatorio(matriz[fila]);
        }
    }
    public static void cargar_arreglo_aleatorio(int[]arr) {
        Random r = new Random();
        for (int i=0; i<MAXCOLUMNA; i++){
            arr[i]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
        }
    }
    public static void imprimir_matriz_aleatorio(int[][]matriz) {
        for (int fila=0; fila<MAXFILA; fila++){
            imprimir_arreglo_aleatorio(matriz[fila]);
        }
    }
    public static void imprimir_arreglo_aleatorio(int[]arr) {
        for (int i=0; i<MAXCOLUMNA; i++){
            System.out.print(arr[i]+"|");
        }
        System.out.println();
    }
    public static void invertir_orden_matriz(int[][]matriz) {
        for (int fila=0; fila<MAXFILA; fila++){
            invertir_orden_arr(matriz[fila]);
        }
    }
    public static void invertir_orden_arr (int[]arr) {
        for (int i=MAXCOLUMNA-1; i>-1; i--) {
            System.out.print(arr[i]+"|");
        }
        System.out.println();
    }
}