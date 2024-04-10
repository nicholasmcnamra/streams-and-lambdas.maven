package com.zipcodewilmington.streams;

import com.zipcodewilmington.streams.anthropoid.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by leon on 5/2/17.
 */
public class StreamFilter {
    private final Stream<Person> personStream;
    public final String startingCharacter;

    Random random = new Random();

    /**
     * No arg constructor
     */ //TODO - construct person stream of 100 person objects; startingCharacter is a random capital letter
    public StreamFilter() {
        this.personStream = Stream.<Person>builder().build().limit(100);
        this.startingCharacter = random.ints(65, 90).toString();
    }

    /**
     * @param people - Array of person objects
     * @param startingCharacter - character to filter by
     */ //TODO
    public StreamFilter(Person[] people, Character startingCharacter) {
        this.personStream = Arrays.stream(people);
        this.startingCharacter = String.valueOf(startingCharacter);
    }

    /**
     * @param people - List of person objects
     * @param startingCharacter - character to filter by
     */ //TODO
    public StreamFilter(List<Person> people, Character startingCharacter) {
        this.personStream = people.stream();
        this.startingCharacter = String.valueOf(startingCharacter);
    }


    /**
     * @param people - Stream of person objects
     * @param startingCharacter - character to filter by
     */ // I took care of the easy constructor (͡° ͜ʖ ͡°)
    public StreamFilter(Stream<Person> people, Character startingCharacter) {
        this.personStream = people;
        this.startingCharacter = startingCharacter.toString();
    }


    /**
     * Using multi-line lambda syntax
     * @return a list of person object whose name starts with `this.startingCharacter`
     */ //TODO
    public List<Person> toListMultiLine() {
        return personStream.filter(p ->
                p.getName().startsWith(String.valueOf(startingCharacter)))
                .toList();
    }


    /**
     * Using one-line lambda syntax
     * @return a list of person objects whose name starts with `this.startingCharacter`
     */ //TODO
    public List<Person> toListOneLine() {
        return personStream.filter(p -> p.getName().startsWith(String.valueOf(startingCharacter))).toList();
    }


    /**
     * Using one-line lambda syntax
     * @return an array of person object whose name starts with `this.startingCharacter`
     */ //TODO
    public Person[] toArrayOneLine() {
        Person[] res = personStream.filter(p -> p.getName().startsWith(String.valueOf(startingCharacter))).toArray(Person[]::new);
        return res;
    }


    /**
     * Using multi-line lambda syntax
     *
     * @return an array of person object whose name starts with `this.startingCharacter`
     */ //TODO
    public List<Person> toArrayMultiLine() {
        return personStream.filter(p -> p.getName().startsWith(String.valueOf(startingCharacter))).toList();
    }

}
