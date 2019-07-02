package arwn.avajlauncher;


import arwn.avajlauncher.aircraft.Baloon;

public class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) throws NoSuchAircraftException {
        Coordinates cords = new Coordinates(longitude, latitude, height);

        if (type.equals("Helicopter")) {
            return new Helicopter(name, cords);
        } else if (type.equals("JetPlane")) {
            return new JetPlane(name, cords);
        } else if (type.equals("Baloon")) {
            return new Baloon(name, cords);
        } else if (type.equals("Zeppelin")) {
            return new Zeppelin(name, cords);
        } else {
            throw new NoSuchAircraftException("Spel better please");
        }
    }
}
