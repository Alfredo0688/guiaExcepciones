/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado 
puede causar  una  excepción  de  tipo  InputMismatchException, el  método 
Integer.parseInt() si la cadena  no  puede  convertirse  a  entero,  arroja  una 
NumberFormatException y  además,  al  dividir  un  número  por  cero  surge  una 
ArithmeticException.  Manipule todas las  posibles  excepciones  utilizando bloques 
try/catch para las distintas excepciones
 */
package pkg04;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Integer numero;
        try{
            
            
            numero = Entrada.nextInt();
        
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
