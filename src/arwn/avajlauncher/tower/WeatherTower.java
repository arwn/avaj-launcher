package arwn.avajlauncher;


import arwn.avajlauncher.aircraft.Coordinates;

public class WeatherTower extends Tower {
    WeatherProvider w = WeatherProvider.getProvider();

    public String getWeather(Coordinates coordinates){
        return w.getCurrentWeather(coordinates);
    }
    void changeWeather(){
        conditionsChanged();
    }
}
