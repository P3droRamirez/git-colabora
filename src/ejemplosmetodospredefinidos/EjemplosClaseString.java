package ejemplosmetodospredefinidos;

public class EjemplosClaseString {

    public static void main(String[] args) {

        String cadena1 = "Hola mundo";
        String cadena2 = "Hola Mundo";
        String cadena3 = "Hola, buenos dias mi nombre es Pedro Ramirez Gonzalez";

        // Concatenación de cadenas
        String concatenacionCadenas = cadena1.concat(cadena3);
        // Longitud de la cadena
        int longitud = cadena3.length();
        // Obtener un carácter en una posición específica, en este caso muestra la posicion 0
        char sitioCaracter = cadena1.charAt(0);
        // Comparar cadenas y ver si son iguales
        boolean sonIguales = cadena1.equals(cadena2);
        boolean sonIguales2 = cadena1.equals(cadena3);
        // Convertir a mayúsculas y minúsculas
        String mayusculas = cadena3.toUpperCase();
        String minusculas = cadena3.toLowerCase();
        // Buscar la posición de una subcadena
        int posicion = cadena3.indexOf("Pedro");
        // Reemplazar parte de la cadena
        String reemplazo = cadena3.replace("Pedro", "Paco");
        // Subcadena de la cadena original
        String subcadena = cadena3.substring(0, 4);
        //ValueOff
        int numero = 1;
        String.valueOf(numero);
        int compara = cadena1.compareTo(cadena2);
        int compara2 = cadena1.compareTo(cadena3);
        
        int compara3 = cadena1.compareToIgnoreCase(cadena2);
        

        
        System.out.println("Concatenar cadena1 y cadena3 -->" + concatenacionCadenas);
        System.out.println("La longitud de la cadena3 : " + longitud);
        System.out.println("La letra en la posicion indicada es :" + sitioCaracter);
        System.out.println("LA cadena 1 y 2 son iguales :" + sonIguales);
        System.out.println("La cadena 1 y 3 son iguales :" + sonIguales2);
        System.out.println("Convierte la cadena en mayuscula : " + mayusculas);
        System.out.println("Convierte la cadena en minuscula : " + minusculas);
        System.out.println("Busca la posicion de la palabra (Pedro) en una cadena y te dice posicion :" + posicion);
        System.out.println("Reemplaza Pedro por Paco en la cadena : " + reemplazo);
        System.out.println("Sacas la cadena desde la posicion 0 a la 4, de la cadena orginal, cadena 3 en este caso :" + subcadena);
        System.out.println("Convierte la cadena correspondiente a ese numero " + String.valueOf(numero));
        System.out.println("Compara devolviendo un 0 si dos cadenas son iguales " + compara);
        System.out.println("Compara devolviendo un  numero negativo si la cadena invocante es menor alfabeticamente " + compara2);
        System.out.println("Compara dos cadenas ignorando mayusculas y minusculas y devuelve 0 si son iguales" + compara3);
        
    }
}
