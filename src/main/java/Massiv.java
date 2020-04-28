import java.util.concurrent.ThreadLocalRandom;

public class Massiv {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(0,1000000);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers["+ i +"] = " + numbers[i]);
        }
    }
}
