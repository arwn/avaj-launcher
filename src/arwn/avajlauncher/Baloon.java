package arwn.avajlauncher;

public class Baloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    @Override
    public void updateConditions() {
        String weather = weatherTower.getWeather(coordinates);
        if (weather.equals("SUN")) {
            System.out.println(this + " Ladies and gentlemen, weather looks great, sit tight and enjoy the flight.");
            coordinates.addCoordinates(2, 0, 4);
        } else if (weather.equals("RAIN")) {
            System.out.println(this + " Some turbulence up ahead, sorry for the inconvenience.");
            coordinates.addCoordinates(0, 0, -5);
        } else if (weather.equals("FOG")) {
            System.out.println(this + " Low visibility is gonna force us to delay our landing by a bit.");
            coordinates.addCoordinates(0, 0, -3);
        } else if (weather.equals("SNOW")) {
            System.out.println(this + " Getting a bit chilly....");
            coordinates.addCoordinates(0, 0, -15);
        }

        if (coordinates.getHeight() <= 0) {
            weatherTower.unregister(this);
            System.out.printf("%s landed at Long: %d Lat: %d\n", this, coordinates.getLongitude(), coordinates.getLatitude());
        }
    }

    @Override
    public void registerTower(WeatherTower tower) {
        this.weatherTower = tower;
    }

    @Override
    public String toString() {
        return String.format("Baloon#%s (%d):", name, id);
    }

    Baloon(String name, Coordinates coordinates){
        super(name, coordinates);
    }
}
