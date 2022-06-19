package lambdas.scope.variable;

import lambdas.scope.Logger;

public class Application {
  static String fruitName = "apples"; // static variable
  Long id = 100L; // instance variable

  public static void main(String[] args) {
    Application app = new Application();
    app.show();
  }

  public static void logger(Logger logger) {
    logger.logMessage("logging message");
  }

  public void show() {
    boolean flag = true; // local variable
    logger(
        courseTitle -> {
          // instance variable is accessible through this keyword
          System.out.println("instance variable: " + this.id);

          // static methods are accessible.
          System.out.println("static variable: " + fruitName);

          // local variable is also accessible
          System.out.println("Local variable: " + flag);

          // lambda input parameter
          System.out.println(courseTitle);
        });
  }
}
