import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Diziyi rastgele bir şekilde sırala

        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];

            array[i] = array[j];
           array[j] = temp;
        }

        // 1 den 10000 e kadar olan sayıların rastgele sıralanmış hali
        System.out.println(Arrays.toString(array));
        int x = rand.nextInt(20000);
        System.out.println("Aranacak değer "+x+" dir\n");
        binarySearch binary = new binarySearch(array,x);

        BruteForce force = new BruteForce(array,x);
        System.out.println("Bu durumda BinarySearch algoritması daha hızlıdır.");
    }

}