
package calculadora.ayp;

/**
 * Clase hija de la clase Figura, presenta herencia (clase-padre = Figura)
 * @author Yendry Díaz Solís.
 * @version 1
 */
public abstract class Cuadrado extends Figura {
    
    /**
     * 
     * @param num1  valor de lado
     */
    protected Cuadrado(double num1) {
     
        super (num1);
      
        
    }
    
 
     /**
     *
     * @return  Área del cuadrado
     */    
    @Override
   protected double Area() {
       
       return Math.pow(this.num1, 2);
               
   }
   
     /**
     *
     * @return  Perímetro del cuadrado
     */   
    @Override
   protected double Perimetro() {
       
       return this.num1*4;
   }
}
