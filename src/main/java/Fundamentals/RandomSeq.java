package main.java.Fundamentals;

import java.util.Random;

public class RandomSeq {
    private static Random random = new Random(1);
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i = 0; i < N; i++) {
            double x = lo + random.nextDouble() * (hi - lo);
            System.out.printf("%.2f\n", x);
        }
    }
}
