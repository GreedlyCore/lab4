package helper;

import java.util.Random;

public final class RandomGenerator {

    private final double prob;

    /**
     * from 0.0 --> 1.0 only
     *
     * @param prob
     * @return
     */
    private RandomGenerator(float prob) {
        this.prob = prob;
    }

    public static RandomGenerator generateInstance(float prob) {
        RandomGenerator result = new RandomGenerator(prob);
        return result;
    }

    public static char generateRandomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }

    public boolean getResult() {

        Random rand = new Random();
        return rand.nextFloat() <= prob;
    }
}
