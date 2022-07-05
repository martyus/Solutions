
//singleton
public class World {

    private int population;
    private final double mass = 5.97e24;
    private final double orbitSeconds = 3.16e7;
    //the only instance
    private static World theWorld = new World();
    //private constructor
    private World(){}
    //return the only instance
    public static World getTheWorld(){
        return theWorld;
    }
}
