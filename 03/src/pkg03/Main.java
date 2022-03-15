/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para 
leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la 
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo 
int. Por ultimo realizar una división con los dos numeros y mostrar el resultado. 
 */
package pkg03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        DivisionNumero dN = new DivisionNumero();
        
        String num1 = "";
        String num2 = "";
        Integer num3 = 0;
        Integer num4 = 0;
        
        System.out.print("Ingrese un número: ");
        num1 = Entrada.next();
        System.out.print("Ingrese un número: ");
        num2 = Entrada.next();
        try{
            num4 = Integer.parseInt(num2);
            num3 = Integer.parseInt(num1);
            
       }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        
        dN.dividirPorCero(num3, num4);
        
    }
    
}
