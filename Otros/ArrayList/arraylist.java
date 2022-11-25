import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class arraylist {
    public static void main(String[] args) {
        try{
            int i, a, elemento;
            ArrayList nombreArrayList = new ArrayList();
            BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
            for (i=0; i<=3; i++) {
                System.out.println("ingrese el elemnto: "+i);
                elemento= new Integer(entrada.readLine());
                nombreArrayList.add(elemento);
            }
            for (a=0; a<=3; a++) {
                System.out.println(nombreArrayList.get(a));          
           }
            
            System.out.println(nombreArrayList.size());
        }
        catch(Exception e) {
            System.out.println("Tenes que ingresar un numero");
        }
        
    }
}