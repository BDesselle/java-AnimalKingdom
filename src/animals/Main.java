package animals;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<AnimalImpl> list = new LinkedList<>();
        list.add(new Mammal("Panda", 1869)); //Mammal
        list.add(new Mammal("Zebra", 1778)); //Mammal
        list.add(new Mammal("Koala", 1816)); //Mammal
        list.add(new Mammal("Sloth", 1804)); //Mammal
        list.add(new Mammal("Raccoon", 1758)); //Mammal
        list.add(new Mammal("Bigfoot", 2021)); //Mammal
        list.add(new Bird("Parrot", 1884)); //Bird
        list.add(new Bird("Pigeon", 1837)); // Bird
        list.add(new Bird("Peacock", 1821)); // Bird
        list.add(new Bird("Toucan", 1758)); // Bird
        list.add(new Bird("Swan", 1758)); // Bird
        list.add(new Fish("Salmon", 1758)); //Fish
        list.add(new Fish("Catfish", 1821)); // Fish
        list.add(new Fish("Perch", 1758)); // Fish


/* DESCENDING - YEAR */
        System.out.println("-Descending By Year");
        list.sort((a1, a2) -> a2.getName().compareToIgnoreCase(a1.getName()));
        list.forEach(name -> System.out.println("  •Name: " + name.getName()));
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");



/* ALPHABETICALLY */
        System.out.println("-Alphabetically");
        list.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        list.forEach(name -> System.out.println("  •Name: " + name.getName()));
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");



/* WAY OF MOVEMENT */
        System.out.println("-Way Of Movement");
        list.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        list.forEach(name -> System.out.println("  •" + name.getName() + " ~ " + name.move()));
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");



/* WITH LUNGS */
        System.out.println("-With Lungs");
        List<AnimalImpl> newList = list.stream().filter(a -> a.breath() == "lungs").collect(Collectors.toList());
        newList.forEach(name -> System.out.println(name.getName() + " | " + name.breath()));
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");



/* LUNGS & 1758 */
        System.out.println("-Lungs And 1758");
        newList = list.stream().filter(a -> a.breath() == "lungs" && a.getYearDiscovered() == 1758)
        .collect(Collectors.toList());
        newList.forEach(name -> System.out.println(name.getName() + " | " + name.breath() + " | " + name.getYearDiscovered()));
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");



/* EGGS & LUNGS */
        System.out.println("-Legs And With Lungs");
        newList = list.stream().filter(a -> a.breath() == "lungs" && a.reproduce() == "eggs").collect(Collectors.toList());
        newList.forEach(name -> System.out.println("  •Name: " + name.getName() + " ~ " + name.breath() + " ~ " + name.reproduce()));
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");

/* ALPHABETICALLY - 1758 */
        System.out.println("-Alphabetically And 1758");
        newList = list.stream().filter(a -> a.getYearDiscovered() == 1758).collect(Collectors.toList());
        newList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        newList.forEach(name -> System.out.println("  •" + name.getName()));
    }
}