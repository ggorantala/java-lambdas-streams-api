package functionalinterface.loggerdemo;

public class Application {
  public static void main(String[] args) {
    logger(new LoggerImpl());
  }

  public static void logger(Logger logger) {
    logger.logMessage("A message is sent");
  }
}
