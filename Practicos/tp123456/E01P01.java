import java.io.BufferedReader;
import java.io.InputStreamReader;

class Consigna1TP1 {
  public static void main(String[] args) {
    int i=0;
    int []arreglo= new int[5];
    while (i<=4){
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Ingrese el numero "+ (i+1));
			arreglo[i] = new Integer(entrada.readLine());
		}
      	catch (Exception e) {
			System.out.println("Error");
          	i=i-1;
		}
     	i=i+1;

    }
    System.out.println("Sus numeros ingresados, de forma inversa quedaran:");
    System.out.println(arreglo[4] + ", " + arreglo[3] + ", " + arreglo[2] + ", " + arreglo[1] + ", " + arreglo[0]);
  }
}

