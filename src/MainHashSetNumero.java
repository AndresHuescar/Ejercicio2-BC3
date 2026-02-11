import java.util.HashSet;

public class MainHashSetNumero {

    public static void main(String[] args) {

        /* Crear un HashSet de tipo Integer
        Un HashSet no permite elementos duplicados, por lo que los números repetidos se ignoran automáticamente */

        HashSet<Integer> numeros = new HashSet<>();

        // Añado números al HashSet
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2); // Número repetido, NO se añade
        numeros.add(1); // Número repetido, NO se añade

        // Muestro los elementos del HashSet
        System.out.println("Contenido del HashSet:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
