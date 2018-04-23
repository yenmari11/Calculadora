
package calculadora.ayp;

/**
 *
 * clase main de la calculadora de perímetro y área.
 * @author Yendry Díaz Solís.
 * @version 1
 *
 */
public class CalculadoraAyP {

    /**
     * 
     * Método que imprime el área y el perímetro de las figuras.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Figura figura;
        
        /**
         * CÍRCULO: se calcula el área y el perímetro.
         * en esta clase es una clase-hija de la clase Figura
         * Los conceptos que involucra es: herencia, atributos,
         * métodos, abstracción por la clase Figura  (padre),polimorfirmo
         * con override.
         * 
         * Se debe ingresar en cada casilla del paréntesis el  
         * siguiente orden para obtener el valor deseado:
         * 
         * Primer ingreso: valor del radio; (num1)
         * 
         * instancia: figura = new Circulo(num1);
         */
        figura = new Circulo(5);
        System.out.println("El área del circulo es:"+figura.Area());
        System.out.println("El perimetro del circulo es:"+figura.Perimetro());
        
        
        
        /** 
         * TRIANGULO: se calcula el área y el perímetro.
         * en esta clase es una clase-hija de la clase Figura
         * Los conceptos que involucra es: herencia, atributos,
         * métodos, abstracción por la clase Figura  (padre),polimorfirmo
         * con override.
         * 
         * Se debe ingresar en cada casilla del paréntesis el  
         * siguiente orden para obtener el valor deseado:
         * 
         * Primer ingreso: valor de la base;  
         * segundo ingreso: valor de la altura; 
         * tercer ingreso: valor de un lado adyacente a la base; 
         * cuarto ingreso: valor del otro lado adyacente a la base; 
         * 
         * 
         * instancia: figura = new Triangulo(num1, altura, lado2, lado3);
         */
        figura = new Triangulo(5,2,3,4);
        System.out.println("El área del triangulo es:"+figura.Area());
        System.out.println("El perimetro del triangulo es:"+figura.Perimetro());

        
        
        /** 
            * CUADRADO: se calcula el área y el perímetro.
            * en esta clase es una clase-hija de la clase Figura
            * Los conceptos que involucra es: herencia, atributos,
            * métodos, abstracción por la clase Figura  (padre),polimorfirmo
            * con override.
            * 
            * Se debe ingresar en cada casilla del paréntesis el  
            * siguiente orden para obtener el valor deseado:
            * 
            * Primer ingreso: valor del lado; (num1)
            * 
            * instancia: figura = new Cuadrado(num1);
        */
        figura = new Cuadrado(6) {} ;
        System.out.println("El área del cuadrado es:"+figura.Area());
        System.out.println("El perimetro del cuadrado es:"+figura.Perimetro());
        
        
        
        /**
            *RECTÁNGULO se calcula el área y el perímetro.
            * en esta clase es una clase-hija de la clase Figura
            * Los conceptos que involucra es: herencia, atributos,
            * métodos, abstracción por la clase Figura  (padre),polimorfirmo
            * con override.
            * 
            * Se debe ingresar en cada casilla del paréntesis el  
            * siguiente orden para obtener el valor deseado:
            * 
            * Primer ingreso: valor de la base; 
            * Segundo ingreso: valor de la altura; 
            * 
            * instancia:  figura = new Rectangulo(num1, altura);
        */
        figura = new Rectangulo(5,2);
        System.out.println("El área del rectangulo es:"+figura.Area());
        System.out.println("El perimetro del rectangulo es:"+figura.Perimetro());
    
        
      
         /**
            * n-ágono: Sirve para sacar el área y el perímetro de 
            * figuras geométricas con 5 o más lados.
            * 
            * en esta clase es una clase-hija de la clase Figura
            * Los conceptos que involucra es: herencia, atributos,
            * métodos, abstracción por la clase Figura  (padre),polimorfirmo
            * con override.
            * 
            * Se debe ingresar en cada casilla del paréntesis el  
            * siguiente orden para obtener el valor deseado:
            * 
            * Primer ingreso: valor del lado; (num1)
            * segundo ingreso: valor de la apotema; 
            * tercer ingreso: cantidad de lados. 
            * 
            * instancia: figura = new nagono(num1, apotema, CantidadLados);
         */
        figura = new nagono(5,2,5);
        System.out.println("El área es:"+figura.Area());
        System.out.println("El perimetro es:"+figura.Perimetro());

    
    
    }
    
    
}
