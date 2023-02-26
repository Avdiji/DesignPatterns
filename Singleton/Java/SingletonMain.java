public class SingletonMain {
    public static void main(String... args){


        RandomizerSingleton random = RandomizerSingleton.getRandomizerSingleton();
        System.out.println(random.nextBoolean());
        System.out.println(random.nextInt());
        System.out.println(random.nextDouble());
    }
}
