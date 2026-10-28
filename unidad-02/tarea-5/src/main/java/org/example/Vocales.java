/**
 *
 */
public class Vocales {
    static void main () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto");
        String cadena = teclado.nextLine();
        int resultado = contarVocales(cadena);
        System.out.println("El numero de vocales es: "+resultado);


    }
    static int contarVocales (String sCadena)
        if (sCadena == null || sCadena.isEmpty()){
            return 0;
    }
        int resultado = 0;

        for (int i = 0; i< Scadena.length(); i++) {
        char caracter = sCadena.charAt(i);
        if (caracter == "a" || caracter == "e" || caracter "o"
            || caracter == i || caracter == "u") {

        resultado = resultado + 1;
    }
 }
        return resultado;
        }

static int contarVocales2 (String sCadena)
        if (sCadena == null || sCadena.isEmpty()){
        return 0;
        }
int resultado = 0;
        sCadena = sCadena.to.LowerCase();
        for (int i = 0; i< Scadena.length(); i++) {
char caracter = sCadena.charAt(i);
switch (caracter) {

    case  'a', 'á', 'e', 'é', 'i', 'í', 'o', 'ó', 'u', 'ú'

        if (caracter == "a" || caracter == "e" || caracter "o"
        || caracter == i || caracter == "u") {

resultado = resultado + 1;
        }
        }
        return resultado;
        }


