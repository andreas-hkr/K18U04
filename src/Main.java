import java.util.List;

public class Main {
    static double calcLength(List<Double> list) {
        double sum = 0;

        for (double d : list) {
            sum += d*d;
        }

        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        // Beräkna längden av en vektor
        //  - Metod som vi döper till calcLength
        //  - Lista med doubles som parameter
        //  - Returnerar längden --> roten ut (e1² + e2² + ... eN²)

    }
}