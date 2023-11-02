import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista para almacenar las personas
        List<Persona> listaPersonas = new ArrayList<>();

        // Crear 5 objetos Persona con nombres y apellidos aleatorios
        listaPersonas.add(new Persona("Nicolás", "Della Bernarda"));
        listaPersonas.add(new Persona("Guidelines", "Leonidas"));
        listaPersonas.add(new Persona("Ionizado", "Robinson"));
        listaPersonas.add(new Persona("Jancho", "Pancho"));
        listaPersonas.add(new Persona("Tego", "Calderón"));

        // Mostrar la lista original
        System.out.println("Lista original:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        // Ordenar la lista por nombre
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getNombre));

        // Mostrar la lista ordenada por nombre
        System.out.println("\nLista ordenada por nombre:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        // Ordenar la lista por apellido
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido));

        // Mostrar la lista ordenada por apellido
        System.out.println("\nLista ordenada por apellido:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        // Ordenar la lista inversamente por apellido
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido).reversed());

        // Mostrar la lista ordenada inversamente por apellido
        System.out.println("\nLista ordenada inversamente por apellido:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}
