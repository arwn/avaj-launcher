package arwn.avajlauncher;

import arwn.avajlauncher.aircraft.Coordinates;

import java.util.Random;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();
    private String[] weather = new String[]{"RAIN", "FOG", "SUN", "SNOW"};
    private WeatherProvider(){

    }
    public static WeatherProvider getProvider(){
        return weatherProvider;
    }
    public String getCurrentWeather(Coordinates c) {
        int seed = c.dot();
        Random r = new Random(seed);
        seed = r.nextInt();
        seed = Math.abs(seed);
        return weather[seed % 4];
    }
}
