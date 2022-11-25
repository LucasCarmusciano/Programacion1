import java.io.BufferedReader;
import java.io.InputStreamReader;

// Escribir un programa que permita el ingreso de un car�cter y realice:
// imprima es car�cter d�gito si el car�cter ingresado es car�cter
// d�gito,
// o imprima no es car�cter d�gito

public class CaracterNumero {
    public static void main(String[] args) {
        char valor;
        try{
            BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresa un valor");
            valor= entrada.readLine().charAt(0);
            if ( ( ( ('ñ'==valor)  ||  ('Ñ'==valor) ) ||  (('a'<=valor)&&(valor<='z')) ) ||  (('A'<=valor)&&(valor<='Z'))){
                System.out.println("Es letra");
            }
            else if (('0'<=valor)&&(valor<='9')){
                System.out.println("Es un numero");
            }
            else {
                System.out.println("Es otra cosa");
            }
        }
          catch (Exception e) {
            System.out.println("Error");
        }
    }        
}
