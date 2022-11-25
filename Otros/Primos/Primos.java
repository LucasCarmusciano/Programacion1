import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Primos {
    public static void main(String[] args) {
        ArrayList<Integer> nombreArrayList = new ArrayList<>();
        nombreArrayList.add(1);
        nombreArrayList.add(2);
        boolean noPrimo=true;
        int n;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try {
            System.out.println("ingrese un numero");
            n= new Integer(entrada.readLine());
            for (int i=1; i<=n; i++) {
                System.out.println("paso 1");
                for (int a=1; a<=i; a++){
                    System.out.println("paso 2");
                    for (int primo=1; primo<=nombreArrayList.size(); primo++){
                        System.out.println("paso 3");
                        if (((i%a)==0)&&(a==nombreArrayList.get(primo))){
                            noPrimo=true;
                        }
                    }
                }
                if (noPrimo==false){
                    nombreArrayList.add(i);
                }
                noPrimo=true;
            }  
        }
        catch(Exception e) {
            System.out.println("error");
        }
      }
    }    