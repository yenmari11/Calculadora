
package calculadora.ayp;

/**
 * Clase hija de la clase Figura, presenta herencia (clase-padre = Figura)
 * @author Yendry Díaz Solís.
 * @version 1
 */
public class Triangulo extends Figura{
    
    private double altura;
    private double lado2;
    private double lado3;
    
    
    
   /** 
    * 
    * @param num1  base/lado1
    * @param altura  
    * @param lado2   valor de un lado adyacente a la base
    * @param lado3   valor del otro lado adyacente a la base
    */
    protected Triangulo(double num1, double altura, double lado2, double lado3){
        
        super(num1);
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
        
    }
    
    /**
     * get del altura
     * @return altura
     */
    protected double getAltura() {
        
        return altura;

     
        
    }
   
    /**
     * set de altura, lado2, lado3
     * @param altura
     * @param lado2
     * @param lado3 
     */
    private void setNums(double altura, double lado2, double lado3){
        
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
             
        
    }
    
     /**
     *
     * @return  Área del Triangulo.
     */    
    @Override
    protected double Area(){
        
    return(this.num1*this.altura)/2;
    
    }

     /**
     *
     * @return  Perímetro del Triangulo.
     */    
    @Override
    protected double Perimetro() {
       return this.num1+this.lado2+this.lado3;
    }
    
    
}
