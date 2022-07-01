import java.util.Arrays;

public class ArrayReverse {

    public static void main(String args[]){
        int arr[] = {5,3,4,2,9,7};
        reverseArray(arr);
//        System.out.println(arr[2]);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int arr[]){
        int i= 0;
        int j = arr.length-1;
        while (i < j){
//            int temp = arr[i];
            arr[i]= arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
    }
}

