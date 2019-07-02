package arwn.avajlauncher;

public class NoSuchAircraftException extends Exception{
    public NoSuchAircraftException(String line) {
        super(line);
    }
}
