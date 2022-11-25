// Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
// precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo
// (posición 0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor
// del arreglo) y colocar el numero en el arreglo en la posición indicada.
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio4 {
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
            System.out.println("INGRESE UN VALOR (del 1 al 9, sino termina el programa)");
            elemento = Integer.valueOf(entrada.readLine());
            while (elemento>=MINVALOR && elemento<MAXVALOR){
                imprimir_new_arreglo(arroriginal, elemento);
                System.out.println("INGRESE UN VALOR (del 1 al 9, sino termina el programa)");
                elemento = Integer.valueOf(entrada.readLine());
            }
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
    public static void imprimir_new_arreglo(int[]arr, int elem) {
        for (int pos=MAX-1; pos>0; pos--){
            arr[pos]=arr[pos-1];
        }
        arr[0]=elem;
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i]+"|");
        }
        System.out.println();
    }
}