import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FellowShipOfTheRing {
    public static void main(String[] args) {
        // törpök létrehozása
        Set<String> dwarves = new HashSet<>();

        // egy további tömb hozzáadási a dwarves set-hez
        String[] array = {"Ildikó", "Vince", "Kata", "Csaba"};
        dwarves.addAll(Arrays.stream(array).toList());
        System.out.println(dwarves.toString());

        // törpökhöz hozzáadás
        dwarves.add("Gimli");

        // máshogy is hozzá lehet adni
        // Set<String> dwarves = new HashSet<>(List.of("Gimli"));

        // tündék
        Set<String> elves = new HashSet<>();
        elves.add("Legolas");

        // emberek
        Set<String> humans = new HashSet<>();
        humans.add("Aragorn");
        humans.add("Boromir");
        // egy csomagban így adom hozzá
       //  humans.addAll(List.of("Aragorn", "Boromir"));

        // hobbitok
        // így hozzá lehet adni, mint tömb
        Set<String> hobbitsOther = new HashSet<>(Arrays.asList("Frodo", "Sam", "Merry", "Pippin"));
        // így hozzá lehet adni, mint lista
        Set<String> hobbits = new HashSet<>(List.of("Frodo", "Sam", "Merry", "Pippin"));

        // Mordor
        Set<String> fellowship = new HashSet<>();
        fellowship.addAll(humans);
        fellowship.addAll(hobbits);
        fellowship.addAll(dwarves);
        fellowship.addAll(elves);
        fellowship.addAll(Set.of("Gandalf"));
        System.out.println(fellowship);

        // Itt úgyse jössz át
        fellowship.remove("Gandalf");
        fellowship.add("Gandalf the White");

        // második reggeli
        fellowship.removeAll(hobbits);
        System.out.println(fellowship);
        System.out.println(fellowship.containsAll(hobbits));

        // fehér kéz jele
        System.out.println(fellowship.contains("Boromir"));

    }
}
