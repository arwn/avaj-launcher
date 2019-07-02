package arwn.avajlauncher.aircraft;

public class NoSuchAircraftException extends Exception{
    public NoSuchAircraftException(String line) {
        super(line);
    }
}
