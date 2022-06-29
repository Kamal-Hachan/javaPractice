///*
//public class MaxHeap {
//    int heapAr[] ;
//    int heapSize;
//    int left(int i) {
//        return ((2 * i )+ 1);
//    }
//    int right(int i) {
//        return ((2 * i) + 2);
//    }
//    MaxHeap(int arr[], int size){
//        heapSize = size;
//        heapAr = arr;
//        int r = (size-1)/2;
//        while(r>0){
//            hipify(r);
//            r--;
//        }
//
//        for (int j = 0; j< heapSize; j++ ){
//            System.out.print(", "+heapAr[j]);
//        }
//    }
//    public void hipify(int i){
//        int max = i;
//        int l = left(i);
//        int r = right(i);
////        int p = parent(i);
//
//        if(l<heapSize && heapAr[l]> heapAr[i]){
//            max = l;
//        }
//        if(r<heapSize && heapAr[r]> heapAr[i]){
//            max = r;
//        }
//        if(max != i){
//            int t = heapAr[i];
//            heapAr[i] = heapAr[max];
//            heapAr[max] = t;
//            hipify();
//        }
//
//    }
//}
//*/
