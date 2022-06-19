package functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierInterface {
  public static void main(String[] args) {
    stringType();
    otherTypes();
  }

  // string type
  private static void stringType() {
    Supplier<String> s = () -> "Learn Java Programming";

    System.out.println(s.get());
  }

  // other types
  private static void otherTypes() {
    String fruit = "APPLE";

    Supplier<Boolean> booleanSupplier = () -> fruit.length() == 5;
    Supplier<Integer> integerSupplier = () -> fruit.length() * 5;
    Supplier<String> stringSupplier = () -> fruit.toLowerCase();

    System.out.println(booleanSupplier.get());
    System.out.println(integerSupplier.get());
    System.out.println(stringSupplier.get());
  }
}
