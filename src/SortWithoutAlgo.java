/*
* Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
*
* */

public class SortWithoutAlgo {
    public static void main (String []args){
        System.out.println("working");
        int ar[]={3,1,2,2,1,1,3,2,1,3};
        display(ar);
    }
    static void display(int arr[]){
        for (int n : arr){
            System.out.print(n);
        }
        int ar1[] = sortArr(arr);
        System.out.println("  ::::::::");
        for (int n : ar1){
            System.out.print(n);
        }
    }
    static int[] sortArr(int ar[]){
      int frequency[]= {0,0,0};
      for(int i=0; i<ar.length;i++){
          if(ar[i]==1){
              frequency[0]=frequency[0]+1;
          }
          else if(ar[i]==2){
              frequency[1]=frequency[1]+1;
          }
          else{
              frequency[2]=frequency[2]+1;
          }
      }
      int y = 0;
      while (y<ar.length){
          for(int p = 0 ;p< frequency.length;p++){
              for(int i = frequency[p];i>0;i--){
                  ar[y]=p+1;
                  y++;
              }
          }
      }
//     while(x<max) {
//         for (int i = j+1; i < ar.length; i++) {
//             if ((ar[i] == x) && (ar[i] != ar[j])) {
//                 temp = ar[i];
//                 ar[i] = ar[j];
//                 ar[j] = temp;
//                 j++;
//             }
//             System.out.print(" " + i + " : " + j);
//         }
//         x++;
//     }
//        int k = 0;
//      while (k< frequency.length){
//          for(int l = frequency[k]; l>0 ; l--){
//
//          }
//      }
      return ar;
    }


}
