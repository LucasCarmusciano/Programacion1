// Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
// precargada, solicite al usuario una posición fila, columna y realice un corrimiento a
// izquierda.
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio3 {
    public static final int MAXFILA=5;
    public static final int MAXCOLUMNA=10;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 0;
    public static void main (String[] args) {
        int fila, columna;
        int [][] matriz;
        matriz= new int[MAXFILA][MAXCOLUMNA];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{      
            cargar_matriz_aleatorio(matriz);
            imprimir_matriz_aleatorio(matriz);
            System.out.println();
            System.out.println("FILA Y COLUMNA PARA CAMBIAR DE POSICION CON SU IZQUIERDA: ");
            fila = Integer.valueOf(entrada.readLine());
            columna = Integer.valueOf(entrada.readLine());
            imprimir_cambiar_pos(matriz,fila,columna);
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
    public static void imprimir_cambiar_pos(int[][]mat,int fila, int columna){
        int valor_guardado=mat[fila][columna];
        mat[fila][columna]=mat[fila][columna-1];
        mat[fila][columna-1]=valor_guardado;
    }
}