package arwn.avajlauncher;


public class WeatherTower extends Tower {
    WeatherProvider w = WeatherProvider.getProvider();

    public String getWeather(Coordinates coordinates){
        return w.getCurrentWeather(coordinates);
    }
    void changeWeather(){
        conditionsChanged();
    }
}
