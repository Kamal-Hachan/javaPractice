/*
* Find the "Kth" max and min element of an array
* *We can also do it by sorting the Array
* */
public class KthMax {
    public static void main(String args[]){
        int arr[]={3,4,2,8,6,9,12,7,25,13};
        int k = 6;
        int n = arr.length;
        buildHeap(arr, n);
        deleteMax(arr,k);
        System.out.println(k+"th max is "+ arr[0]);

    }

    static void buildHeap(int arr[], int n){
        int root = (n/2)-1;
        for (int i = root; i>=0; i--){
            maxHeapify(arr, n, i);
        }
        int x= 0;
    }

    static  void maxHeapify(int arr[], int n, int i){
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if(l<n && arr[l]>arr[largest]){
            largest = l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest = r;
        }

        if(largest!= i){
            int t= arr[i];
            arr[i] = arr[largest];
            arr[largest]= t;
            maxHeapify(arr, n, largest);
        }
    }

    static  void deleteMax(int arr[], int k){
        int n= arr.length;
        for(int i=1 ; i<k; i++){
            int temp = arr[n-1];
            arr[n-1]= arr[0];
            arr[0] = temp;
            maxHeapify(arr, --n,0);
        }
    }
}
