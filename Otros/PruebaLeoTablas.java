import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PruebaLeoTablas {
    public static void main(String[] args) {
        int numero1;
        int i=0;
        int numero2;
        int rta;
        int bien=0;
        try {
            while (i<10) {
                numero1= (int)((Math.random()*(10))+1);
                numero2= (int)((Math.random()*(10))+1);
                if ((numero1>=3)&&(numero2>=3)&&(numero1<=9)&&(numero2<=9)) {
                    BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
                    System.out.println(numero1+" x "+numero2);
                    rta= new Integer(entrada.readLine());
                    if (rta==(numero1*numero2)) {
                        System.out.println("bien");
                        ++bien;
                    }
                    else {
                        System.out.println("mal");
                    }
                    ++i;
                }
            }
            System.out.println("su resultado fue "+bien+"/10");
        }
        catch (Exception e) {
            System.out.println("Tenes que ingresar un numero");
        }
    }
}
