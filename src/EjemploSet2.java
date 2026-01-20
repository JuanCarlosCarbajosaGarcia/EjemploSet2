import java.util.HashSet;
import java.util.Set;

public class EjemploSet2 {
    public static void main(String[] args) {
        Set<Persona> personas = new HashSet<>();

        Persona p1 = new Persona("ana",30);
        Persona p2 = new Persona("pedro",45);
        personas.add(p1);
        personas.add(p2);

        System.out.println(personas.size());
    }
}
