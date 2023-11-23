package ejemplosmetodospredefinidos;
import java.util.Random;
public class EjemplosClaseMath {

    public static void main(String[] args) {
      
        int numero1 = 10;
        int numero2 = 15;
        int numero3 = 3;
        
        //Aqui podemos ver las operaciones basicas de suma, resta, multiplicacion y division
        int suma = Math.addExact(numero1, numero2);
        int resta = Math.subtractExact(numero2,numero1);
        int multiplicacion = Math.multiplyExact(numero1, numero2);
        int division = Math.floorDiv(numero2, numero3);
        
        //Este metodo calcula la potencia(Se castea a int porque se trabaja con double)
        int potencia = (int) Math.pow(numero1, numero3);
        
        //Este metodo clacula la raiz cuadrada
        int raizCuadrada = (int)Math.sqrt(numero3);
        //Metodos para calcular los numeros maximo y minimo segun dos numeros que se les pasa por parametro
        int maximo = Math.max(numero3, numero2);
        int minimo = Math.min(numero3, numero2);
        
        
        System.out.println("La suma de " +numero1+ " mas " + numero2 + " es igual a :" + suma);
        System.out.println("La resta de " +numero2+ " menos " + numero1 + " es igual a :" + resta);
        System.out.println("El resultado de multiplicar " +numero1+ " por " + numero2 + " es igual a :" + multiplicacion);
        System.out.println("El resultado de dividir " +numero2+ " entre " + numero3 + " es igual a :" + division);
        System.out.println("El resultado calcular la potencia de  " +numero1+ " multiplicado " + numero2 + " es igual a :" + potencia);
        System.out.println("El resultado de la raiz cuadrada de  " +numero3 + " es igual a :" + raizCuadrada);
        System.out.println("El maximo entre los numeros " + numero3 + " y el numero " + numero2 + " es igual a :" + maximo);
        System.out.println("El minimo entre los numeros " + numero3 + " y el numero " + numero2 + " es igual a :" + minimo);
        
    }
    
}
