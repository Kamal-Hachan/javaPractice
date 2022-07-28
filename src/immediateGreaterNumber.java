import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class immediateGreaterNumber {
    public static void main(String[] args) {
        int number =794432000;
//        System.out.println("Please Enter The number");
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
        System.out.println("Number : " + number);
        int x = 0;
        int i = number%10;
        int j=0;
        List<Integer> list = new ArrayList<>();
        while(x == 0){
            j = i;
            number = number/10;
            i= number%10;
            list.add(j);
            if(i<j){
                x++;
            }
        }
        if(number>0){
            int k=0;
            while (i>=list.get(k)){
                k++;
            }
            int next = list.get(k);
            list.set(k,i);
            number = number/10;
            number=number*10+next;
            for (int p: list){
                number=number*10+ p;
            }
            System.out.println("Next  :" + number);
        }
        else{
            System.out.println("No grater Number is possible");
        }
    }
}
