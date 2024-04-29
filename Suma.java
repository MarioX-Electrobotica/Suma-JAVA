import java.util.Scanner;

/**
 * Write a description of class Suma here.
 * 
 * @author (MarioX Trobotica) 
 * @version (20240425)
 */
//programa que recibe dos numeros y muestra la suma
public class Suma
{
  //el metodo main impieza la ejecucion de la aplicacion en java
  public static void main(String[]args){
    
      //Crear objeto Scanner para obetener la entrada de la ventana de comandos
      Scanner entrada = new Scanner(System.in);
      
      int numero1;//Primer numero para que sume
      int numero2;//Segundo numero para sume
      int resultado;// resultado o suma de nuemero1 y numero2
      
      System.out.println("Dijite el primer numero: ");//identificador
      numero1 = entrada.nextInt();//lee el primer numero de usuario
      
      System.out.println("Dijite el segundo numero: ");//Lee el segundo numero de usuario
      numero2 = entrada.nextInt();
      //suma los numeros despues del almacen el total de la suma
      resultado = numero1 + numero2;// suma los numeros despues del almacen 
      
      System.out.println("LA SUMA ES: "+resultado);//Se muestra la suma
    }//fin de metodo main
}// fin de clase suma
