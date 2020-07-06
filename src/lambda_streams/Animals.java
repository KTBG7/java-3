package lambda_streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Animals {
    // This class will be using streams.
    static List<String> animals = Arrays.asList("peacoCK", "rabbit", "chiwawa", "OranguTAN", "vipeR", "cobra", "paNDa",
            "bUffalo", "DeeR", "maLLard");
    static List<String> newAnimalList = Arrays.asList();

    public static void main(String[] args) {
        System.out.println("original animals : " + animals);
        // clean up the animals array by using the capsFirst() method. follow
        // instructions in the method definition.
        List<String> cleaned = capsFirst(animals, false);
        System.out.println("The List 'cleaned' contains: " + cleaned);

        // do not modify these addAnimal() method invocations
        addAnimal("rEIndeeR");
        addAnimal("Platypus");
        addAnimal("frOg");
        addAnimal("lEOpArD");
        // ---------------------------------------

        capsFirst(animals, true);

        List<String> lowered = lowerFirst(animals, false);
        System.out.println("The List 'lowered' contains: " + lowered);

        Twice reverseList = (mutate) -> {
            if (mutate == true) {
                Collections.reverse(animals);
                System.out.println("The reversedList 'animals' contains: " + animals);
            }
            return animals;
        };
        Twice reverseNewList = (mutate) -> {
            if (mutate == false) {
                newAnimalList = animals;
                Collections.reverse(newAnimalList);
                System.out.println("The new reversedList 'newAnimalList' contains: " + newAnimalList);
            }
            return newAnimalList;
        };
        flipAnimals(reverseList, true);
        flipNewAnimals(reverseNewList, false);
    }

    static List<String> capsFirst(List<String> animaList, boolean mutate) {
        // clean up the animals list so that the first letter is capitalized, and all
        // the other letters are lowercased. Use a stream to accomplish this task. Also,
        // the 2nd parameter of this function is a boolean. use this boolean 'flag' to
        // determine whether or not to 'mutate' the original animals array stored as a
        // static class field. if the flag is set to 'true', mutate the animals and
        // return the animals out of the function. if it is false, create a copy of the
        // animals, perform your stream operations on the copy, and return the copy of
        // animals out of the function, WITHOUT modifying the original animals array.

        for (String animal : animals) {
            String newAnimal = animal;
            newAnimal = animal.substring(0, 1).toUpperCase() + animal.substring(1).toLowerCase();
            animal = newAnimal;
            Stream<String> newAnimalCaps = Stream
                    .of(animal.substring(0, 1).toUpperCase() + animal.substring(1).toLowerCase());
            newAnimalList = Stream.concat(newAnimalList.stream(), newAnimalCaps).collect(Collectors.toList());
            // newAnimal.add(animal.substring(0, 1).toUpperCase() +
            // animal.substring(1).toLowerCase());
        }
        if (mutate == true) {
            animals = newAnimalList;
            System.out.println("The List 'animals' contains: " + animals);
            return animals;
        } else if (mutate == false) {
            System.out.println("The new List 'newAnimalList' contains: " + newAnimalList);
            return newAnimalList;
        }
        return animals;
    }

    static String addAnimal(String animal) {
        // add an animal to the animal list.
        Stream<String> newAnimal = Stream.of(animal);
        animals = Stream.concat(animals.stream(), newAnimal).collect(Collectors.toList());
        return animal;
    };

    static List<String> lowerFirst(List<String> animaList, boolean mutate) {
        // lowercase the first letter, and uppercase the rest of the letters, using
        // streams. Also, depending on the value of the boolean flag 'mutate', mutate
        // the original animals list, or perform your stream operations on a 'copy' of
        // the animals list. return the list out of hte function in both cases.
        List<String> newAnimalList = Arrays.asList();

        for (String animal : animals) {
            String newAnimal = animal;
            newAnimal = animal.substring(0, 1).toLowerCase() + animal.substring(1).toUpperCase();
            animal = newAnimal;
            Stream<String> newAnimalCaps = Stream
                    .of(animal.substring(0, 1).toLowerCase() + animal.substring(1).toUpperCase());
            newAnimalList = Stream.concat(newAnimalList.stream(), newAnimalCaps).collect(Collectors.toList());
            // newAnimal.add(animal.substring(0, 1).toUpperCase() +
            // animal.substring(1).toLowerCase());
        }
        if (mutate == true) {
            animals = newAnimalList;
            System.out.println("The List 'animals' contains: " + animals);
            return animals;
        } else if (mutate == false) {
            System.out.println("The new List 'newAnimalList' contains: " + newAnimalList);
            return newAnimalList;
        }
        return animaList;
    }

    static List<String> flipAnimals(Twice reverseList, boolean mutate) {
        // reverse the order of the animals in the animal list. If the booleaen
        // parameter is true, reverse the static animals array list by mutating the
        // array. if the mutate boolean is false, flip a 'copy' of the animals list,
        // then return that list of flipped animals, WITHOUT mutating the static animals
        // array. return the flipped list in both cases.

        List<String> instructions = Arrays.asList("Flip", "the", "animals", "list", ".", " ", "Mutate", "the",
                "animals", "only", "if", "flag", "true");
        return reverseList.modify(mutate);
    }

    static List<String> flipNewAnimals(Twice reverseNewList, boolean mutate) {
        // reverse the order of the animals in the animal list. If the booleaen
        // parameter is true, reverse the static animals array list by mutating the
        // array. if the mutate boolean is false, flip a 'copy' of the animals list,
        // then return that list of flipped animals, WITHOUT mutating the static animals
        // array. return the flipped list in both cases.

        List<String> instructions = Arrays.asList("Flip", "the", "animals", "list", ".", " ", "Mutate", "the",
                "animals", "only", "if", "flag", "true");

        return reverseNewList.modify(mutate);
    }

    static List<String> sortAnimals(boolean mutate) {
        // sort the animals in alphabetical order. If the booleaen parameter is true,
        // mutating the animals list. if the mutate boolean is false, sort a 'copy' of
        // the animals list, then return that list of sorted animals, WITHOUT mutating
        // the static animals array. return the sorted list in both cases.
        return animals;
    }

}

interface Twice {
    public List<String> modify(boolean mutate);
}
