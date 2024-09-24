package byog.Core;

public class Seed {
    private static long seed = 1;

    public static long getSeed() {
        return seed;
    }

    public static void setSeed(long n) {
        seed = n;
    }
}
