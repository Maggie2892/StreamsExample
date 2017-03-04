package com.sdajava.stream;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // PROGRAMOWANIE FUNKCYJNE 01.03.2017


        //Przykład 1
        System.out.println("- - Przykład 1 - -");

        List<String> words = Arrays.asList("hej", "czesc", "hello");
// ALBO words.forEach(s -> System.out.println("Slowo: " + s));

        words.stream().forEach(s -> System.out.println("Slowo: " + s));
        words.forEach(System.out::print); //funkcja print wywołana przez ::  , wywołanie metody referencyjnej
        System.out.println("\n");

        //Przyklad 2
        System.out.println("\n- - Przykład 2 - -");
        List <String> modWords = words.stream().map(z -> z + "!").collect(Collectors.toList()); // map służy do modyfikacji wartości
        modWords.forEach(System.out::println);

        //Przykład 3
        System.out.println("\n- - Przykład 3 - -");
        List<String> replaceWords = words.stream()
                                          .map(s -> s.replace("e", "stodola"))
                                          .collect(Collectors.toList());
        replaceWords.forEach(System.out::println);

        //Przyklad 4
        System.out.println("\n- - Przykład 4 - - ");
        List<String> upperCaseWords = words.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        upperCaseWords.forEach(System.out::println);


        // Przykład 5
        System.out.println("\n- - Przykład 5- - ");
        List<String> shortWords = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        shortWords.forEach(System.out::println);


        // Przykład 6

        System.out.println("\n- - Przykład 6 - -");
        List<String> wordsWithC = words.stream()
                                        .filter(s -> s.contains("c"))
                                        .collect(Collectors.toList());
        wordsWithC.forEach(System.out::println);

        //Przykład 7
        System.out.println("\n- - Przykład 7 - -"); // wyrazy z patrzysta ilością liter
        List<String> evenLenghtWord = words.stream().filter(s -> (s.length()%2) == 0).collect(Collectors.toList());
        evenLenghtWord.forEach(System.out::println);

        // Przykład 8
    }
}
