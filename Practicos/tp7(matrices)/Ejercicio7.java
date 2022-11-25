// Hacer un programa que dado una matriz ordenada creciente por filas de
// enteros de tamaño 4*5 que se encuentra precargada, solicite al usuario un
// numero entero y una fila, y luego inserte el numero en la matriz en la fila
// indicada manteniendo su orden.
import java.util.Random;
public class Ejercicio7 {
    public static final int MAXFILA=3;
    public static final int MAXCOLUMNA=5;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 0;
    public static void main (String[] args) {
        int [][] matriz;
        matriz= new int[MAXFILA][MAXCOLUMNA];
        try{      
            cargar_matriz_aleatorio(matriz);
            imprimir_matriz_aleatorio(matriz);
            System.out.println();
            ordenar_matriz(matriz);
            imprimir_matriz_aleatorio(matriz);
        }
        catch (Exception exc){
			System.out.println(exc);
		}
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

    public static void ordenar_matriz(int[][]mat){
        for (int fila=0; fila<MAXFILA; fila++){
            ordenar_arreglo(mat[fila]);
        }
    }
    public static void ordenar_arreglo(int[]arr){
        int pos_menor,cambio;
        for (int i=0; i<MAXCOLUMNA; i++){
            pos_menor=i;
            for (int j=i+1; j<MAXCOLUMNA; j++){
                if(arr[j]<arr[pos_menor]){
                    pos_menor=j;
                }
            }
            if(pos_menor!=i){
                cambio=arr[i];
                arr[i]=arr[pos_menor];
                arr[pos_menor]=cambio;
            }
        }
    }
}