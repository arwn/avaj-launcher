package arwn.avajlauncher;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int longitude, int latitude, int height){
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    int getLongitude(){return this.longitude;}
    int getLatitude(){return this.latitude;}
    int getHeight(){return this.height;}

    public void addCoordinates(int longitude, int latitude, int height) {
        this.longitude += longitude;
        this.latitude += latitude;
        this.height += height;
        if (this.height < 0) this.height = 0;
        if (this.height > 100) this.height = 100;
    }

    public int dot(){
        return longitude*latitude*height;
    }
}
