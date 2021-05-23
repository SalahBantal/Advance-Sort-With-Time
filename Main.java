import java.util.Arrays;


public class Main {

  public static void main(String[] args) {
    int data[]={39,49,29,19,59,69};
    int min = data[0];
    int index = 0;
    double hasil = System.nanoTime();

    double start = System.nanoTime();
    for(int j=0;j<data.length-1;j++){
      for(int i = j;i<data.length;i++){
        if(data[i] < min){
          min=data[i];
          index = i;

        }
        System.out.println(Arrays.toString(data));
      }

      if(min<data[j]){
        data[index] = data[j];
        data[j]=min;
      }
      min=data[j+1];
      double finish = System.nanoTime();
      hasil = finish - start;


    }
    System.out.println("Waktu Eksekusi Program adalah:" +hasil);
  }
}