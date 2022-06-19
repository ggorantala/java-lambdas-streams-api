package functionalinterface.loggerdemo;

@FunctionalInterface
public interface Logger {
    void logMessage(String message);
}