
package calculadora.ayp;

/**
 * Clase hija de la clase Figura, presenta herencia (clase-padre = Figura)
 * @author Yendry Díaz Solís.
 * @version 1
 * 
 */
public class Circulo extends Figura {
    
    
    /**
     * 
     * @param num1
     * 
     */
    protected Circulo (double num1) {
        
        super(num1);
     
    }

     /**
     *
     * @return  Área del círculo
     */   
    @Override
    protected double Area(){

        return Math.PI*Math.pow(this.num1, 2);
    
    }
    
     /**
     *
     * @return  Perímetro del círculo.
     */    
    @Override
    protected double Perimetro(){
        
        return 2*Math.PI*this.num1;
    
    }
    
    
}
