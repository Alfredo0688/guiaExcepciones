
package pkg02;


public class Clase {
    private int[] arreglo;
    
    Clase(){
        arreglo = new int[5];
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public void probandoError(){
        
        try{
            
            for(int i = 0; i < 6;i++){
                this.arreglo[i]= i;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
              System.out.println("as" + e.toString());
           }
        }
    }
