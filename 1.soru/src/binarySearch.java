import java.util.Arrays;
import java.util.Random;
public class binarySearch {
    binarySearch(int[] array,int x){
        Random rand = new Random();
        int temp;

        for(int i = 0; i < array.length-1; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // dizinin küçükten büyüğe doğru sıralanmış hali


             int sonuc =Search(array,x);
             if(sonuc==-1){
                 System.out.println("BinarySearch ile aranan değer bulunamadı.");
             }
             else{
                 System.out.println("BinarySearch ile aranan değer "+sonuc+". indextedir.");
             }
             System.out.println("BinarySearch algoritmasının çalışma hızı O(log n)'dir.\n");

    }
    int Search(int[] array,int x){
        // binary search ile değer arama kısmı
        int a =0, arrays = array.length-1;

        while(a<=arrays) {
            int mid = a + (arrays - a) / 2;
            if (array[mid] == x) {
                return mid;
            }

            if (array[mid] < x) {
                a = mid + 1;
            }

            else {
                arrays = mid - 1;
            }
        }
          return -1;

    }
}
