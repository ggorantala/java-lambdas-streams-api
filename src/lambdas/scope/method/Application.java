package lambdas.scope.method;

import lambdas.scope.Logger;

public class Application {
  public static void main(String[] args) {
    Application app = new Application();
    app.show();
  }

  public static void logger(Logger logger) {
    logger.logMessage("logging message");
  }

  public static void staticMethod() {
    System.out.println("Displaying static message");
  }

  public void show() {
    logger(
        courseTitle -> {
          System.out.println(courseTitle);
          nonStaticMethod();
          staticMethod();
        });
  }

  public void nonStaticMethod() {
    System.out.println("Displaying non-static message");
  }
}
