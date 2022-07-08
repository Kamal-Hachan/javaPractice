import java.io.*;

/**
 * largest contiguous sum
 */
public class LargestContiguousSum {
    public static void main(String[] args) {
        int arr[] = {2, -1, 1, -5, 4, -1, -2, 3, 5};
        int maxSeq = maxSubArraySum(arr, arr.length);
    }

    static int maxSubArraySum(int arr[], int size) {
        int max = arr[0];
        int maxSeqSum = arr[0];
        for (int i = 1; i < size; i++) {
            maxSeqSum = maximum(arr[i], maxSeqSum + arr[i]);
            max = maximum(max, maxSeqSum);
        }
        return max;
    }

    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else return b;
    }
}

