import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamIterator {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //External Iterator
    System.out.println("Using External iterator by for loop");
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }

    //also External Iterator
    System.out.println("Using External iterator by without boundary/increment condition");
    for (int a : numbers) {
      System.out.println(a);
    }

    //Internal Iterator
    System.out.println("Using Internal iterator by anonymous class");
    numbers.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        System.out.println(integer);
      }
    }); //here you calling function in object itself. it internally use the polymorphism,
    // because we don't know the internal implementation.

    //Internal Iterator
    System.out.println("Using Internal iterator by lambda function");
    numbers.forEach((Integer integer) ->
            System.out.println(integer)); //Here we remove the noisy part.

    System.out.println("Using Internal iterator by lambda function in type inference");
    numbers.forEach((integer) ->
            System.out.println(integer));
    // java 8 has type inference, finally, hold your tweets, but only for lambda expressions.

    //Internal Iterator
    System.out.println("Using Internal iterator by method reference");
    numbers.forEach(System.out::println); //Here we remove the noisy part.
  }
}
