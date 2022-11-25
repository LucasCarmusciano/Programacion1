import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lunar {
    public static void main(String[] args) {
        int dia;
        int mes;
        int anio;
        int aureo;
        int epacta;
        int edadlunar;
        try{
            BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresa el dia, mes y año (en ese orden)");
            dia= new Integer(entrada.readLine());
            mes= new Integer(entrada.readLine());
            anio= new Integer(entrada.readLine());
            if ((((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12))&&((dia>0)&&(dia<=31)))||(((mes==4)||(mes==6)||(mes==9)||(mes==11))&&((dia>0)&&(dia<=30)))||((mes==2)&&((dia>0)&&(dia<=28)))){
                aureo=(anio+1)%19;
                epacta=((aureo-1)*11)%30;
                if ((mes==1)||(mes==2)){
                    edadlunar=(mes+10)+epacta+dia;
                }
                else {
                    edadlunar=(mes-2)+epacta+dia;
                }
                edadlunar=edadlunar%30;
                System.out.println("Cantidad de días desde la ultima luna llena: "+edadlunar);
                System.out.println("Dias para la proxima luna llena: "+(30-edadlunar));
            }
            else {
                System.out.println("EL DIA INGRESADO NO CORRESPONDE");
            }
        }
          catch (Exception e) {
            System.out.println("Error");
        }
    }        
}    

