// Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
// precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la
// menor posición del arreglo.
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio3 {
    public static final int MAX=10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
    public static void main (String[] args) {
        int [] arroriginal;
        arroriginal= new int[MAX];
        int elemento;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            cargar_arreglo_aleatorio(arroriginal);
            imprimir_arreglo_aleatorio(arroriginal);
            System.out.println("POSICION A CAMBIAR CON SU IZQUIERDA");
            elemento = Integer.valueOf(entrada.readLine());
            if (elemento<=0 && elemento>MAX){
            System.out.println("POSICION A CAMBIAR CON SU IZQUIERDA");
            elemento = Integer.valueOf(entrada.readLine());
            }
            imprimir_cambiar_pos(arroriginal, elemento);
        }
        catch (Exception exc){
			System.out.println(exc);
		}
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
    public static void imprimir_cambiar_pos(int[]arr, int pos) {
        int valor_guardado=arr[pos];
        arr[pos]=arr[pos-1];
        arr[pos-1]=valor_guardado;
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i]+"|");
        }
    }
}
