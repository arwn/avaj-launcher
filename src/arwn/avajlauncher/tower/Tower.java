package arwn.avajlauncher.tower;

import arwn.avajlauncher.aircraft.Flyable;

import java.util.ArrayList;

public class Tower {
    private ArrayList<Flyable> observers = new ArrayList<Flyable>();
    public void register(Flyable flyable){
        observers.add(flyable);
        System.out.print( flyable + " registered from tower.\n");
    }
    public void unregister(Flyable flyable){
        observers.remove(flyable);
        System.out.print( flyable + " unregistered from tower.\n");

    }
    protected void conditionsChanged(){
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).updateConditions();
        }
    }

}
