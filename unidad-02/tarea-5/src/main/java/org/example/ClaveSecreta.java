package ies.puerto.es;

/**
 * @author Cristian GP
 */
public class ClaveSecreta {
    static void main() {
Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String sPalabra = teclado.nextLine();
        String SInvertida = reverse(sPalabra);
        System.out.println("Palabra invertida"+Invertida);
    }

    /**
     * Crea una palabra o texto invertida a la original
     * @param palabra String Palara/texto original
     * @return String Cadena invertida
     */
    static String reverse(String palabra) {
StringBuilder resultado = new StringBuilder();
        if (sPalabra == null || palabra.isEmpty()) {
            return "";
        }
        //size /length |0| -> a 8 - 1 = 7 -> a
        //palabra = |a|l|m|e|n|d|r|a| -> |a|r|d|m|e|m|l|a|
      for (int i = 0; i< palabra.length() -1; i >= 0; i--) {
         char caracter = palabra.charAt(i);
         resultado.append(caracter);

        return clave;
    }
}