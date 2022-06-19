package functionalinterface.consumer.example.demo;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String> {
  @Override
  public void accept(String str) {
    System.out.println(str.toUpperCase());
  }
}
