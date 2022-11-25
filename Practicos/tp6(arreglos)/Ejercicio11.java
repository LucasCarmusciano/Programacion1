// Hacer un programa que dado el arreglo definido y precargado permita encontrar la
// posición de inicio de la secuencia cuya suma de valores sea mayor.
import java.util.Random;
public class Ejercicio11 {
    public static final int MAX=20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
    public static void main (String[] args) {
        int [] arroriginal;
        arroriginal= new int[MAX];
            cargar_arreglo_aleatorio(arroriginal);
            imprimir_arreglo(arroriginal);
            ubico_mayor_secuencia(arroriginal);
    }
    public static void cargar_arreglo_aleatorio(int[]arr) {
        Random r = new Random();
        int j;
        for (int i=0; i<MAX; i++){
            j=r.nextInt(2);
            if (j!=0){
                arr[i]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
            }
            else {
                arr[i]=j;
            }
        }
    }
    public static void imprimir_arreglo(int[]arr) {
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i]+"|");
        }
        System.out.println();
    }
    public static void ubico_mayor_secuencia(int[]arr) {
        int suma=0,mayor_suma=0,pos_mayor_suma=0,pos_suma=0;

        if (arr[0] !=0 ) {
            pos_suma=0;
            suma += arr[0];
            pos_mayor_suma=0;
        }
        
        for (int i=1; i<MAX; i++){
            
            if (arr[i]!=0){
                suma+=arr[i];
                if(suma>mayor_suma){
                    mayor_suma=suma;
                    pos_mayor_suma=pos_suma;
                }
            }
            else {
                suma=0;
                if (i<MAX-1) {
                    pos_suma=i+1;
                }
            }
        }
        System.out.println("La posicion de la mayor suma es: "+pos_mayor_suma);
        System.out.println("La suma es: "+mayor_suma);
    }
}