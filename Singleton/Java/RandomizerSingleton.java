import java.util.Random;

// Singleton Class to generate Random int, boolean and double
public class RandomizerSingleton {

    // private static instance of this
    private static RandomizerSingleton instance = null;
    private Random random = null;

    //private Constructor
    private RandomizerSingleton() { random = new Random(); }

    // static getter for this
    public static RandomizerSingleton getRandomizerSingleton() {
        if (instance == null) {
            instance = new RandomizerSingleton();
        }
        return instance;
    }

    // other methods...
    public int nextInt(){ return random.nextInt(); }
    public boolean nextBoolean(){ return random.nextBoolean(); }
    public double nextDouble(){
        return random.nextDouble();
    }
}
