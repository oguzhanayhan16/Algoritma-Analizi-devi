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
        System.out.println(Arrays.toString(array)+"\n");
    //    int x = rand.nextInt(10);
      //  System.out.println("Aranacak değer "+x+" dir\n");
             HeapSort hs= new HeapSort();
             hs.sort(array);

        hs.printArray(array);
        System.out.println("HeapSort en kötü durumda bile O(nlogn) zaman karmaşıklığına sahip olup, Quick Sort kadar hızlıdır. Lakin Quick Sort en kötü durumda O(n^2) iken" +
                "Heap Sort  O(nlogn)'dir " +
                " Düşük bellek tüketimi nedeniyle büyük veri kümeleri için idealdir.\n");
        BruteForce bf =new BruteForce(array);
    }

}