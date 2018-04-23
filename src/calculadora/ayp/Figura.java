
package calculadora.ayp;

/**
 * Clase padre donde contiene los métodos de Area, Perimetro, Figura, get del num1 y set del num1.
 * @author Yendry Díaz Solís.
 * @version 1
 */

public abstract class Figura {
    
    protected double num1;

    /**
     * 
     * @param num1 es el atributo que se hereda
     */
    protected Figura(double num1){
        
        this.num1 = num1;

    }
    
    /**
     * 
     * @return num1
     */
    protected double getNum1() {
        
    return num1;
    
    }
   
    /**
     * 
     * @param num1 es el atributo que se hereda
     */
    protected void setNum1(double num1){
        
        this.num1 = num1;
        
    }
    
 
    protected abstract double Area();
    
    protected abstract double Perimetro();
    
    
}
