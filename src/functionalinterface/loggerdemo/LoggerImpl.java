package functionalinterface.loggerdemo;

public class LoggerImpl implements Logger {

  @Override
  public void logMessage(String message) {
    System.out.println(message);
  }
}
