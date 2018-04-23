
package calculadora.ayp;

/**
 * Clase hija de la clase Figura, presenta herencia (clase-padre = Figura)
 * @author Yendry Díaz Solís.
 * @version 1
 */
public class Rectangulo extends Figura {
    protected double altura;
    
    
    /**
     * 
     * @param num1 valor de base
     * @param altura  valor de altura
     */
    protected Rectangulo(double num1, double altura) {
        
        super(num1);
        this.altura = altura;
        
    }
    
    /**
     * get de altura 
     * @return altura
     */
    private double getAltura(){
        
        return altura;
        
    }
    
    /**
     * set de altura
     * @param altura es el atributo se de añade a la clase 
     */
    private void setAltura(double altura){
        
        this.altura=altura;
    }  
    
    /**
     *
     * @return  Área del rectángulo
     */
    @Override
        protected double Area(){
            
            return this.num1*this.altura;
            
        }
        
     /**
     *
     * @return  Perímetro del rectángulo
     */
    @Override
        protected double Perimetro(){
            
            return 2*this.num1+2*this.altura;
            
        }
    }

