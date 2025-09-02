import java.util.Scanner;
import java.util.Random;

public class NumeroSecreto{

  public static void main(String args[]) {
  
  Scanner scan=new Scanner(System.in);
  Random random=new Random();
  
  
  
  int numeroSecreto =random.nextInt(100)+1;
  int intento;
    int intentos =0;
    boolean adivinado=false;
    
    
    System.out.println("Estoy pensando un numero entre 1 y 100. Adivinalo");
    
    
    while (adivinado){
    System.out.print("ingrese un número");
    intento = scan.nextInt();  
    intento ++;
    
    if(intento< 1|| intento > 100){
    System.out.println("ingresa un numerientre 1 y 100");
    }else if(intento<numeroSecreto){
    System.out.println("intenta con un numero mas alto");
    }else if (intento> numeroSecreto) {
      System.out.println ("intenta con un numero mas bajo");
    } else {
      adivinado=true;
      System.out.println("Has adivinado el numero secreto"+
                            "\nNumero de intentos:"+intentos);
      
      }
    }
  }
}