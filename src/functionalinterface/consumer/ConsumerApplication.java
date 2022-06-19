package functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerApplication {
  public static void main(String[] args) {
    acceptFI(100);
    andThenFunctionalInterface(100);
  }

  // accept
  private static void acceptFI(int number) {
    Consumer<Integer> consumer = n -> System.out.println(n * 2);
    consumer.accept(number);
  }

  // andThen
  private static void andThenFunctionalInterface(int number) {
    Consumer<Integer> firstConsumer = n -> System.out.println(n * 2);
    Consumer<Integer> secondConsumer = n -> System.out.println(n * 5);

    firstConsumer
            .andThen(secondConsumer)
            .accept(number);
  }
}
