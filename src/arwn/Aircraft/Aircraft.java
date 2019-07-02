package arwn.avajlauncher;

public class Aircraft {
    // vars
    protected long id;
    protected String name;
    protected Coordinates coordinates;

    private static long idCounter = 0;

    // functions
    protected Aircraft(String name, Coordinates coordinates){
        this.name = name;
        this.coordinates = coordinates;
        this.id = nextId();
    }

    // increase counter and return it.
    private long nextId(){
        return ++idCounter;
    }
}
