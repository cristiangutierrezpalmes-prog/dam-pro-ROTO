public class AlgoritmoEuclides {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1 = teclado.nextInt();
        System.out.println(Introduce el segundo número);
        int numero2 = teclado.nextInt();

        system
    }
    static int calcularMCD(int numero1, int numero2) {}
    int resultado = 0;

    numero1 = Math.abs(numero1);
    numero2 = Math.abs(numero2);

    while ( numero2 != 0) {
        int resto = numero1 % numero2;
        numero1 = numero2;
        numero2 = resto;
    }
return numero1;