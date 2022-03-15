
package pkg03;

public class DivisionNumero {
    
    
    public void dividirPorCero(int num1, int num2){
        try{
            System.out.println("Division: " + num1 / num2);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage() + " " + e.toString());
        }
    }
}
