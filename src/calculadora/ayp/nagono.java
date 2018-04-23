
package calculadora.ayp;

/**
 * Clase hija de la clase Figura, presenta herencia (clase-padre = Figura)
 * @author Yendry Díaz Solís.
 * @version 1
 */
public class nagono  extends Figura{
    private double apotema;
    private double CantidadLados;
    
    
    /**
     * 
     * @param num1  valor de lado
     * @param apotema  
     * @param CantidadLados  cantidad de lados
     */
    protected nagono (double num1,double apotema, double CantidadLados) {
        
        super(num1);
        this.apotema = apotema;
        this.CantidadLados = CantidadLados;
        
    }
    
    /**
     * get de apotema
     * @return apotema
     */
       private double getApotema() {
        
        return apotema;
        
    }
   
       /**
        * set de apotema y CantidadLados
        * @param apotema
        * @param CantidadLados 
        */
    private void setNums(double apotema, double CantidadLados){
        
        this.apotema = apotema;
        this.CantidadLados = CantidadLados;  
        
    }
    
     /**
     *
     * @return  Área del n-ágono.
     */    
    @Override
    protected double Area(){
        
        return(this.num1*this.apotema*this.CantidadLados)/2;
    
    }

     /**
     *
     * @return  Perímetro del n-ágono.
     */    
    @Override
    protected double Perimetro() {
        
       return this.num1*this.CantidadLados;
       
    }
    
    
    
}
