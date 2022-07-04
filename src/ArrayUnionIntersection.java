import java.util.Arrays;
import java.util.HashSet;

public class ArrayUnionIntersection {
    public static void main(String args[]){
        int ar1[] = {2,4,7,9,13,15};
        int ar2[] = {1,4,6,13,16,18,25,31};
        intersection(ar1,ar2);
        union(ar1, ar2);
    }

    static void intersection(int ar1[], int ar2[]){
//        HashSet<Integer> inter = new HashSet<>();
        int i=0,j=0,k=0;
        while(i<ar1.length && j< ar2.length){
            k++;
            if(ar1[i]<ar2[j]){
                i++;
            }
            else if(ar2[j]<ar1[i]){
                j++;
            }
            else{
//                inter.add(ar1[i]);
                System.out.print(ar1[i] + " ");
                i++;
                j++;
            }
        }
        System.out.println(" ");
    }

    static void union(int ar1[], int ar2[]){
//        HashSet<Integer> union = new HashSet<>();
        int i=0,j=0,k=0;
        while(i<ar1.length && j< ar2.length){
            k++;
            if(ar1[i]<ar2[j]){
                System.out.print(ar1[i] + " ");
//                union.add(ar1[i]);
                i++;
            }
            else if(ar2[j]<ar1[i]){
                System.out.print(ar2[j] + " ");
//                union.add(ar2[j]);
                j++;
            }
            else{
                System.out.print(ar1[i] + " ");
//                union.add(ar1[i]);
                i++;
                j++;
            }
        }
        while (i<ar1.length){
            System.out.print(ar1[i] + " ");
//            union.add(ar1[i]);
            i++;
        }
        while (j<ar2.length){
            System.out.print(ar2[j] + " ");
//            union.add(ar2[j]);
            j++;
        }
//        System.out.println("Union Is "+  Arrays.toString(inter.toArray()));
    }
}
