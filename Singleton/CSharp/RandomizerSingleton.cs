namespace random.BuilderPattern.Singleton {

    // Singleton Class to generate Random int, boolean and double
    public class RandomizerSingleton {

        // private static instance of this
        private static RandomizerSingleton instance = new RandomizerSingleton();
        private Random random;

        //private Constructor
        private RandomizerSingleton() { random = new Random(); }

        // static getter for this
        public static RandomizerSingleton Instance {
            get {
                if (instance == null) {
                    instance = new RandomizerSingleton();
                }
                return instance;
            }
        }

        // other methods...
        public int NextInt() { return random.Next(); }
        public double NextDouble() { return random.NextDouble(); }
        public bool NextBool() { return random.Next(2) == 0; }
    }
}
