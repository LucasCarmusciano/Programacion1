// Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
// precargada, obtenga la cantidad de números pares que tiene y la imprima.
import java.util.Random;
public class Ejercicio2 {
    public static final int MAXFILA=3;
    public static final int MAXCOLUMNA=5;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 0;
    public static void main (String[] args) {
        int [][] matriz;
        matriz= new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio(matriz);
        imprimir_matriz_aleatorio(matriz);
        System.out.println();
        System.out.println("La cantidad de pares es: "+cantidad_pares_matriz(matriz));
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
    public static int cantidad_pares_matriz(int[][]matriz) {
        int cant_pares=0;
        for (int fila=0; fila<MAXFILA; fila++){
            cant_pares+=pares_arreglo(matriz[fila]);
        }
        return cant_pares;
    }
    public static int pares_arreglo(int[]arr) {
        int cant_pares=0;
        for (int i=0; i<MAXCOLUMNA; i++){
            if ((arr[i]%2)==0){
                cant_pares++;
            }
        }
        return cant_pares;
    }
}