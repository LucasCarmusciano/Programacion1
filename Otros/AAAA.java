import java.util.Random;

public class AAAA{
    public static final int MAX=10;
    public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
    public static void main (String[]args){
        int[]ARR=new int [MAX];
        cargar_ARR(ARR);
        imprimir_ARR(ARR);
        System.out.println();
        puto(ARR);
        
    }
    public static void cargar_ARR(int[]arr) {
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
    public static void imprimir_ARR(int[]arr) {
        for (int i=0; arr[i]!=0; i++){
            System.out.print(arr[i]+"|");
        }
        System.out.println();
    }
    public static void puto(int[]arr) {
        for (int i=0; i<MAX;i++){
            System.out.println(i);
        }
    }
}