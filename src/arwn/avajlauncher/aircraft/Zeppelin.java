package arwn.avajlauncher;

import arwn.avajlauncher.aircraft.Baloon;

public class Zeppelin extends Baloon {
    Zeppelin(String name, Coordinates coordinates) {
        super(name, coordinates);
    }
    @Override
    public String toString() {
        return String.format("Zeppelin#%s (%d):", name, id);
    }
}
