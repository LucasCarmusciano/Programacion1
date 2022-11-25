import java.util.Random;

public class ssss{
    public static final int MAX=10;
    public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
    public static void main (String[]args){
        int[]ARR=new int [MAX];
        int[]PAR=new int [MAX];
        cargar_ARR(ARR);
        imprimir_ARR(ARR);
        busco_secuencia(ARR,PAR);
        System.out.println();
        imprimir_ARR(ARR);
        imprimir_ARR(PAR);
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
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i]+"|");
        }
        System.out.println();
    }

    public static void busco_secuencia(int ARR[], int PAR[]){
        int pos_inicial=0, cuenta=0, pos_PAR=0;
        if (ARR[0]!=0){
            pos_inicial=0;
            cuenta++;
        }
        for(int i=1; i<MAX; i++){
            if(ARR[i]!=0){
                if (ARR[i-1]==0){
                    pos_inicial=i;
                }
                cuenta++;
            }
            if(((ARR[i]==0)&&(ARR[i-1]!=0))||(i==(MAX-1))){
                if ((cuenta%2)==0){
                    extraer_secuencia(ARR,PAR,pos_inicial,pos_PAR,cuenta);
                    pos_PAR+=cuenta+1;
                }
                cuenta=0;
            }
        }
    }
    public static void extraer_secuencia(int ARR[],int PAR[], int pos_inicial, int pos_PAR, int cuenta){
        for (int j=pos_inicial;j<pos_inicial+cuenta;j++){
            System.out.println("AAAAAAAAAAA");
            PAR[j-pos_inicial+pos_PAR]=ARR[j];
            ARR[j]=0;
        }
    }
}