// Hacer un programa que dado un arreglo ordenado creciente de enteros
// de tamaño 10 que se encuentra precargado, solicite al usuario un numero
// entero y lo inserte en el arreglo manteniendo su orden. Para ello tendrá
// que realizar un corrimiento a derecha (se pierde el último valor del arreglo)
// y colocar el numero en el arreglo en la posición indicada.
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio7 {
    public static final int MAX=10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
    public static void main (String[] args) {
        int [] arroriginal;
        Integer elemento;
        arroriginal= new int[MAX];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            cargar_arreglo_aleatorio(arroriginal);
            imprimir_arreglo(arroriginal);
            ordenar_arreglo_original(arroriginal);
            imprimir_arreglo(arroriginal);
            System.out.println("INGRESE UN VALOR");
            elemento = Integer.valueOf(entrada.readLine());
            while (elemento>=MINVALOR && elemento<=MAXVALOR){
                ingreso_elemento(elemento, arroriginal);
                imprimir_arreglo(arroriginal);
                System.out.println("INGRESE UN VALOR");
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
    public static void imprimir_arreglo(int[]arr) {
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i]+"|");
        }
        System.out.println();
    }
    public static void ordenar_arreglo_original(int[]arr) {
        int pos_menor,cambio;
        for (int i=0; i<MAX; i++){
            pos_menor=i;
            for (int j=i+1; j<MAX; j++){
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
    public static void ingreso_elemento(int elem,int[] arr){
        for (int i=0; i<MAX; i++){
            if((i==MAX-1)&&(elem>arr[i])||((i==0)&&(elem<arr[i]))){
                for(int j=MAX-1; j>i; j--){
                    arr[j]=arr[j-1];
                }
                arr[i]=elem;
            }
            if((arr[i]<elem)&&(elem<arr[i+1])){
                for(int j=MAX-1; j>i; j--){
                    arr[j]=arr[j-1];
                }
                arr[i+1]=elem;
            }
        }
    }
}