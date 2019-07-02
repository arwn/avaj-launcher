package arwn.avajlauncher.aircraft;

import arwn.avajlauncher.tower.WeatherTower;

public interface Flyable {
    void updateConditions();
    void registerTower(WeatherTower tower);
}
