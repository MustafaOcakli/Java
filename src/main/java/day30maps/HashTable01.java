package day30maps;

import java.util.Hashtable;

    /*
            1)Hashtable is a Map
            2)Hashtable does not put entries to any order
            3)Hashtable is slower than HashMap
            4)Hashtable is thread-safe and synchronized
            (***Interview***) What is the difference between HashMap and HashTable ? Hashtable is thread-safe and synchronized, HashMap is not.
            Thread-safe: If a structure is possible to be used in multi-thread(multitask) operations, that structure is called thread-safe.
            Synchronized: To create sensible order for multi-thread, it is called synchronization. Java gives you some methods to create synchronization.
            Java gives you some methods to create threads which are available for multi-threads.
     */

    public class HashTable01 {

        public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 85000000);
        countryPopulations.put("Turkey", 81000000);

        System.out.println(countryPopulations);

            //Example 1: Store students names together with their email addresses, ages, grades, nationality
            //           Tom Hanks = th@gmail.com, 21, 2, American
            Hashtable<String, Students> studentsInfo = new Hashtable();

            studentsInfo.put("Tom Hanks", new Students("th@gmail.com", 21, 2, "American"));
            studentsInfo.put("Brad Pitt", new Students("bp@gmail.com", 22, 3, "Colombian"));
            studentsInfo.put("Angelina Julie", new Students("ag@gmail.com", 19, 1, "Peru"));

            System.out.println(studentsInfo);

            //How to see a detail about the students like Tom Hank's age
            Students tomInfo = studentsInfo.get("Tom Hanks"); //"Students" your own classes can be data type
            System.out.println(tomInfo.age);
            System.out.println(tomInfo.nationality);
        }
    }


