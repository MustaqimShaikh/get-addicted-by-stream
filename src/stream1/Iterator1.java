package stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Iterator1 {

    public static void main(String[] args) {

        List<People> peoples = People.getPeoples();
        /**
         * Print all the people in peoples list.
         */
        peoples.forEach(System.out::println);


        /**
         * Print people who is older than 30 year age.
         */
        System.out.println("**********older than 30 age****************");
        peoples.stream()
                .filter(people -> people.getAge() > 30) // filter provide the lazy evaluation
                .forEach(System.out::println);


        /**
         * Print only people name who is older than 30 year age.
         */
        System.out.println("**********only name of older than 30 age****************");
        peoples.stream()
                .filter(people -> people.getAge() > 30)
                .map(People::getName) // map also provide the lazy evaluation
                .forEach(System.out::println); // forEach give here eager evaluation. it also called terminal operation.

        /**
         * Print total sum of all peoples age using reduce.
         */
        System.out.println("**********total age of all people using reduce****************");
        //reduce take a collection and reduces to a single value.
        //reduce convert a Stream to something concrete.
        Integer reduce = peoples.stream()
                .map(People::getAge)
                //.reduce(0, (total, age) -> total + age); //here 0 is initial value,
                //.reduce(0, (total, age) -> Integer.sum(total, age));
                .reduce(0, Integer::sum);
        System.out.println(reduce);
        //Java has reduce in two forms: 1.reduce and 2.collect

        /**
         * Print peoples name in upper case.
         */
        System.out.println("**********people name in upper case****************");
        List<String> name =  peoples.stream()
                .filter(people -> people.getAge() > 30)
                .map(People::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(name);



    }
}
