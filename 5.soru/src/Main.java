import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int dizi1[]= {1,2,3,4,5,6,7,8,9};
      int dizi2[]= {0,-5,15,2,1,30,7,-50,4};
      int top=0;
      for(int i =0;i< dizi1.length;i++){
          top+=dizi1[i];
      }
        System.out.println(top);
        System.out.println("Tek for döngüsü ile oluşturuğum kod algoritmasında bu algoritmanın Big-O gösterimi O(n)'dir ve dizinin" +
                "her boyutu arttığında doğrusal olarak artmaktadır.");

      for(int i=0;i< 9;i++){
          for(int j =i+1;j<9;j++){
              if(dizi2[j]<dizi2[i]){
                  int temp = dizi2[i];
                      dizi2[i]=dizi2[j];
                      dizi2[j]=temp;
                     
              }
          }
      }
        System.out.println(Arrays.toString(dizi2));
        System.out.println("Bu algoritmanın Big-O gösterimi O(n^2)'dir. Çünkü, iç içe iki döngü kullanılır " +
                "ve her bir eleman tüm dizideki diğer elemanlarla karşılaştırılır. " +
                "Bu nedenle, veri  boyutu arttıkça, algoritmanın çalışma süresi kare ile orantılı olarak artacaktır.");
    }
}