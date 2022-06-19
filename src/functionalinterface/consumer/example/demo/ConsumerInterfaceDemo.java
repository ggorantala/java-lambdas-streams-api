package functionalinterface.consumer.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
  public static void main(String[] args) {
    List<String> fruits = Arrays.asList("apple", "orange", "Guava", "mango", "banana", "kiwi");

    // Using user-defined implementation class
    helperImpl(fruits);

    // anonymous inner class implementation
    helper01(fruits);

    // After refactoring above method (recommended approach)
    helper02(fruits);
  }

  // Using custom impl class
  private static void helperImpl(List<String> fruits) {
    Consumer<String> fruitsConsumer = new ConsumerImpl();
    fruits.forEach(fruitsConsumer); // print
  }

  private static void helper01(List<String> fruits) {
    // anonymous inner class implementation
    Consumer<String> fruitsConsumer =
        new Consumer<String>() {
          @Override
          public void accept(String s) {
            System.out.println(s.toUpperCase());
          }
        };
    fruits.forEach(fruitsConsumer);
  }

  private static void helper02(List<String> fruits) {
    Consumer<String> fruitsConsumer = s -> System.out.println(s.toUpperCase());
    fruits.forEach(fruitsConsumer);
  }
}
