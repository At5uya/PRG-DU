import java.util.Arrays;

public class Whydis {
    public static void main(String[] args) {
        int[] cislo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        double between = mezi(cislo);
        System.out.println(between);
    }

    static double between(int[] cislo) {
        Arrays.sort(cislo);
        double between;

        int total = cislo.length;

        if (total % 2 == 0) {
            double suma = cislo[total / 2] +
                    cislo[total / 2 - 1];
            between = (suma) / 2;
        } else {
            between = (int) cislo[cislo.length / 2];
        }
        return between;
    }

}