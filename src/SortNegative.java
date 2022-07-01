import java.util.Arrays;


/*
*  Move all the negative elements to one side of the array
*  Without changing the order of appearance.
* */
public class SortNegative {
    public static void main(String args[]){
        int arr[] = {2,4,5,-1,-6,-3,7,8,-4,12,-2};
        moveNegative(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void moveNegative(int arr[]){
        int i=0;
        for(int j=i+1 ; j<arr.length; j++){
            if(arr[j]<0){
               int temp = arr[j];
                shift(arr, i, j);
                arr[i] = temp;
                i++;
            }
        }
    }
    static void shift(int arr[], int i, int j){
        for(int k = j; k>i; k-- ){
            arr[k]=arr[k-1];
        }
    }
}
