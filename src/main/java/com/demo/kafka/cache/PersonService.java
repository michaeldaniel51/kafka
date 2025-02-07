package com.demo.kafka.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {


    @Cacheable("persons")
    public List<Person> getPersons() {
    //    simulateSlowService(); // Simulating a time-consuming operation
        List<Person> personList = Arrays.asList(
                new Person(1, "John", "New York", "Singer", "Rock", 25, "Blue", "Villa"),
                new Person(2, "Alice", "London", "Actor", "Pop", 30, "Green", "Apartment"),
                new Person(3, "Bob", "Paris", "Scientist", "Jazz", 45, "Brown", "Cottage"),
                new Person(4, "Grace", "Tokyo", "Politician", "Classical", 50, "Gray", "Mansion"),
                new Person(5, "Eve", "Berlin", "Athlete", "Hip-hop", 35, "Blue", "Penthouse"),
                new Person(6, "Charlie", "Sydney", "Actor", "Rock", 29, "Green", "Apartment"),
                new Person(7, "Diana", "Paris", "Scientist", "Jazz", 40, "Brown", "Villa"),
                new Person(8, "Alex", "London", "Singer", "Classical", 22, "Blue", "Cottage"),
                new Person(9, "Clara", "Tokyo", "Politician", "Hip-hop", 27, "Gray", "Penthouse"),
                new Person(10, "Henry", "Berlin", "Athlete", "Rock", 31, "Green", "Mansion"),
                new Person(11, "Emily", "New York", "Singer", "Pop", 25, "Brown", "Villa"),
                new Person(12, "Oliver", "Sydney", "Actor", "Jazz", 33, "Blue", "Apartment"),
                new Person(13, "Ava", "Paris", "Politician", "Classical", 45, "Gray", "Mansion"),
                new Person(14, "Lucas", "London", "Scientist", "Hip-hop", 50, "Green", "Cottage"),
                new Person(15, "Mia", "Tokyo", "Athlete", "Rock", 36, "Brown", "Penthouse"),
                new Person(16, "Leo", "Berlin", "Singer", "Pop", 29, "Blue", "Apartment"),
                new Person(17, "Sophie", "New York", "Actor", "Jazz", 42, "Green", "Villa"),
                new Person(18, "Ethan", "Sydney", "Politician", "Classical", 28, "Brown", "Cottage"),
                new Person(19, "Isabella", "Paris", "Scientist", "Hip-hop", 39, "Gray", "Mansion"),
                new Person(20, "Jack", "London", "Athlete", "Rock", 31, "Blue", "Penthouse"),
                new Person(21, "Harper", "Tokyo", "Singer", "Pop", 24, "Green", "Apartment"),
                new Person(22, "Noah", "Berlin", "Actor", "Jazz", 47, "Brown", "Villa"),
                new Person(23, "Ella", "New York", "Politician", "Classical", 29, "Blue", "Cottage"),
                new Person(24, "James", "Sydney", "Scientist", "Hip-hop", 34, "Gray", "Mansion"),
                new Person(25, "Amelia", "Paris", "Athlete", "Rock", 41, "Green", "Penthouse"),
                new Person(26, "William", "London", "Singer", "Pop", 32, "Brown", "Apartment"),
                new Person(27, "Evelyn", "Tokyo", "Actor", "Jazz", 37, "Blue", "Villa"),
                new Person(28, "Mason", "Berlin", "Politician", "Classical", 48, "Green", "Cottage"),
                new Person(29, "Sofia", "New York", "Scientist", "Hip-hop", 30, "Brown", "Mansion"),
                new Person(30, "Logan", "Sydney", "Athlete", "Rock", 26, "Gray", "Penthouse"),
                new Person(31, "Emily", "Paris", "Singer", "Jazz", 40, "Blue", "Apartment"),
                new Person(32, "Alexander", "London", "Actor", "Classical", 33, "Green", "Villa"),
                new Person(33, "Scarlett", "Tokyo", "Politician", "Hip-hop", 45, "Brown", "Cottage"),
                new Person(34, "Benjamin", "Berlin", "Scientist", "Rock", 29, "Gray", "Mansion"),
                new Person(35, "Chloe", "New York", "Athlete", "Pop", 36, "Blue", "Penthouse"),
                new Person(36, "Liam", "Sydney", "Singer", "Jazz", 39, "Green", "Apartment"),
                new Person(37, "Layla", "Paris", "Actor", "Classical", 34, "Brown", "Villa"),
                new Person(38, "Daniel", "London", "Politician", "Hip-hop", 46, "Gray", "Cottage"),
                new Person(39, "Zoe", "Tokyo", "Scientist", "Rock", 31, "Blue", "Mansion"),
                new Person(40, "Aiden", "Berlin", "Athlete", "Pop", 25, "Green", "Penthouse"),
                new Person(41, "Bella", "New York", "Singer", "Jazz", 40, "Brown", "Apartment"),
                new Person(42, "Matthew", "Sydney", "Actor", "Classical", 29, "Gray", "Villa"),
                new Person(43, "Grace", "Paris", "Politician", "Hip-hop", 33, "Blue", "Cottage"),
                new Person(44, "Nathan", "London", "Scientist", "Rock", 50, "Green", "Mansion"),
                new Person(45, "Lily", "Tokyo", "Athlete", "Pop", 26, "Brown", "Penthouse"),
                new Person(46, "Anthony", "Berlin", "Singer", "Jazz", 44, "Gray", "Apartment"),
                new Person(47, "Maya", "New York", "Actor", "Classical", 28, "Blue", "Villa"),
                new Person(48, "Joshua", "Sydney", "Politician", "Hip-hop", 35, "Green", "Cottage"),
                new Person(49, "Ella", "Paris", "Scientist", "Rock", 38, "Brown", "Mansion"),
                new Person(50, "Caleb", "London", "Athlete", "Pop", 24, "Gray", "Penthouse")
        );


//      return List.of(new Person(1,"kehk","kwjdfn","sjdnfkjw","dnfj",5,"sljlwe","weiokd"),
//        new Person(2,"kehk","kwjdfn","sjdnfkjw","dnfj",6,"sljlwe","weiokd"),
//        new Person(3,"kehk","kwjdfn","sjdnfkjw","dnfj",7,"sljlwe","weiokd"),
//        new Person(4,"kehk","kwjdfn","sjdnfkjw","dnfj",8,"sljlwe","weiokd"),
//        new Person(5,"kehk","kwjdfn","sjdnfkjw","dnfj",9,"sljlwe","weiokd")
//        );
        return personList;
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }






}
