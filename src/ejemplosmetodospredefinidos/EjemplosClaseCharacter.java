
package ejemplosmetodospredefinidos;

public class EjemplosClaseCharacter {
 
    public static void main(String[] args) {
        char caracter = 'A';
        //Muy bine pedro
        
        // Verificar si un carácter es una letra
        boolean esLetra = Character.isLetter(caracter);

        // Verificar si un carácter es un dígito
        boolean esDigito = Character.isDigit(caracter);

        //Verifica si es caracter o digito
        boolean esLetraOdigito = Character.isLetterOrDigit(caracter);
        
        // Verificar si un carácter es un espacio en blanco
        boolean esEspacioBlanco = Character.isWhitespace(caracter);

        // Convertir un carácter a minúscula
        char aMinuscula = Character.toLowerCase(caracter);

        // Convertir un carácter a mayúscula
        char aMayuscula = Character.toUpperCase(caracter);
        

        // Obtener el tipo de un carácter
        byte tipo = (byte) Character.getType(caracter);

        // Imprimir resultados
        System.out.println("Es letra: " + esLetra);
        System.out.println("Es dígito: " + esDigito);
        System.out.println("Es digito o letra: " + esLetraOdigito);
        System.out.println("Es espacio en blanco: " + esEspacioBlanco);
        System.out.println("Convertir a minúscula: " + aMinuscula);
        System.out.println("Convertir a mayúscula: " + aMayuscula);
        System.out.println("Tipo de carácter: " + tipo);
    }
}
