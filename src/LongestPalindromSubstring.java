
/*
* Largest pelindrom substring
* */

import java.util.Scanner;

public class LongestPalindromSubstring {
    public static void main(String args[]) {
        int l = 1;
        while (l == 1) {
            System.out.println("Please type end to END");
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            if (s.equals("end")) {
                l = 0;
            }
            allSubstrings(s);
        }
    }

    public static void allSubstrings(String s) {
        int count = 0;
        String longestPal = "";
        int maxPalLength = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
//                for(int k = i ; k<= j ; k++){
//                    System.out.print(s.charAt(k));
//                }
                String ts = s.substring(i, j);
                int currentSubLength = ts.length();
                int isPal = isPalindrome(ts);
				//someeeee
                if (isPal == 1) {
                    count++;
                    if (currentSubLength > maxPalLength) {
                        maxPalLength = currentSubLength;
                        longestPal = ts;
                    }
                }
            }
        }
        System.out.println("Longest palindrome is--:::" + longestPal + ":::: Maximum Length -- ::::" + maxPalLength + ":::: total no of pal --::::" + count);
    }

    public static int isPalindrome(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 = s1 + s.charAt(i);
        }
        if (s1.equals(s)) {
            return 1;
        } else return 0;
    }
}
