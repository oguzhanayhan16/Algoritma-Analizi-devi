import java.util.Arrays;
import java.util.Random;
public class BruteForce {
    BruteForce(int[] array){
        Random rand = new Random();

        int x = rand.nextInt(20000);
        System.out.println("Aranacak değer "+x+" dir");
        int sonuc = search(array,x);
        if(sonuc==-1){
            System.out.println("BruteForce ile aranan değer bulunamadı.");
        }
        else{
            System.out.println("BruteForce ile aranan değer "+sonuc+". indextedir.");
        }
        System.out.println("BruteForce algoritmasının en kötü durumda çalışma hızı (n^2)'dir.\n");
    }
    int search(int[] array,int x){
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                return i;
            }

        }
        return -1;
    }
}
