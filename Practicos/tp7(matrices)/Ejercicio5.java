// Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
// precargada, solicite al usuario un numero entero y elimine la primer ocurrencia de numero
// en la matriz (un número igual) si existe. Para ello tendrá que buscar la posición y si está,
// realizar un corrimiento a izquierda y no continuar buscando.
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio5 {
    public static final int MAXFILA=3;
    public static final int MAXCOLUMNA=5;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 0;
    public static void main (String[] args) {
        int elemento;
        int [][] matriz;
        matriz= new int[MAXFILA][MAXCOLUMNA];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{      
            cargar_matriz_aleatorio(matriz);
            imprimir_matriz_aleatorio(matriz);
            System.out.println();
            System.out.println("VALOR: ");
            elemento = Integer.valueOf(entrada.readLine());
            eliminar_primer_elem_mat(matriz,elemento);
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

    public static void eliminar_primer_elem_mat(int[][]mat, int elem){
        int j=1;
        for (int fila=0; fila<MAXFILA; fila++){
            for (int columna=0; columna<MAXCOLUMNA; columna++){
                if((mat[fila][columna]==elem)&&(j!=0)){
                    for(int k=columna; k<MAXCOLUMNA-1; k++){
                        mat[fila][k]=mat[fila][k+1];
                    }
                    j=0;
                }
            }
        }
    }
}