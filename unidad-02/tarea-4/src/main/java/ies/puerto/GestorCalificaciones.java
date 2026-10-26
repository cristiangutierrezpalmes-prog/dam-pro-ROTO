package ies.puerto;

public class GestorCalificaciones {

    static void main(){
        List<Double> notas = new ArrayList<>();
        boolean salir = false;
        do {
            Doble nota = solicitarNotaValida();
            notas.add(nota);
            System.out.println("Deseas añadir otra nota: true/false");
            String sSalir = teclado.nextLine();
            salir = Boolean.parseBoolean(sSalir);
        }while (!salir);

        System.out.println("Lista de notas"+notas);
        double media =calcularMedia(notas);
        System.out.println();("La nota media es: "+media);
}

/**
 * @param sNumero
 * @return
 */
