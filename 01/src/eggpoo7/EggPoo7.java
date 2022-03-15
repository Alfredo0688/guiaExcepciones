/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de 
invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código 
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.

*/
package eggpoo7;


public class EggPoo7 {

    public static void main(String[] args) {
        
        Persona objeto = null;
        //objeto.esMayorEdad();
        try{
            objeto.esMayorEdad();
        }
        catch(NullPointerException e){
            System.out.println("Exception: "+ e.toString());
        }  
    }
        
    
}
