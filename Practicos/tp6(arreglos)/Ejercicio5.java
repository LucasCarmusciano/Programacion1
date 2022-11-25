// Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
// precargado, solicite al usuario un numero entero y elimine la primer ocurrencia del numero
// (un número igual) en el arreglo (si existe). Para ello tendrá que buscar la posición y si está,
// realizar un corrimiento a izquierda (queda una copia de la última posición del arreglo en la
// anteúltima posición).
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio5 {
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
            System.out.println("INGRESE EL VALOR A ELIMINAR");
            elemento = Integer.valueOf(entrada.readLine());
            while (elemento>=MINVALOR && elemento<=MAXVALOR){
                eliminar_ocurrencia(arroriginal, elemento);
                System.out.println("INGRESE EL VALOR A ELIMINAR");
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
    public static void eliminar_ocurrencia(int[]arr, int elem) {
        int valor=0;
        for (int i=0; i<MAX-1; i++){
            if ((arr[i]==elem)&&(valor==0)){
                valor=0;
                for (int pos=i; pos<MAX-1; pos++){
                    arr[pos]=arr[pos+1];
                    valor=1;
                }
            }
        }
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i]+"|");
        }
        System.out.println();
    }
}