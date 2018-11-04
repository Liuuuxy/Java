import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,4};
        int[] array2 = {3,1,4,1,5,9,2,6,5,3,5,8,9,3,9};
        int[] array3 = {1,1,1,1};
        showNonDuplicateArray(array1);
        showNonDuplicateArray(array2);
        showNonDuplicateArray(array3);
    }
    public static void showNonDuplicateArray(int[] a) {
      int[] b = new int[a.length];
      int n = 0;
      for(int i = 0; i < a.length; i++) {
          int j;
          for (j = 0; j < n; n++) {
              if (a[i] == b[j]) {
                  break;
              }//判断相等否
          }
          if(j == n){
              b[n] = a[i];
              n++;
          }
      }
          for(int j = 0; j < n; n++){
          System.out.print(b[j]);
      }
      System.out.println();

    }



}
