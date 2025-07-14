import java.util.HashSet;
import java.util.Scanner;

public class Recursion_Examples {
    // Tower of Hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        } else {
            // transfer top n-1 from src to helper using dest as 'helper'
            towerOfHanoi(n - 1, src, dest, helper);
            // transfer nth from src to dest
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            // transfer n-1 from helper to dest using src as 'helper'
            towerOfHanoi(n - 1, helper, src, dest);
        }
    }

    // First and last occurance of an element in a string

    public static int first = -1;
    public static int last = -1;

    public static void findocc(String stri, char e, int idx) {
        if (idx == stri.length()) {
            System.out.println("First occurence : " + first);
            System.out.println("Last occurence : " + last);
            return;
        }
        if (stri.charAt(idx) == e) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findocc(stri, e, idx + 1);
    }

    // Reverse the String

    public static void reverse(String strin, int index){
        if ( index == 0 ){
            System.out.println(strin.charAt(index));
            return;
        }
        System.out.print(strin.charAt(index));
        reverse(strin , --index );
    }

    // Sorting Strictly Increasing
    public static void isStrictlyIncreasing(int[] arr, int index) {
        if  (index == arr.length - 1){
            for (int e:arr){
                System.out.print(e + " ");
            }
            return;
        }
        if (arr[index] < arr[index + 1]){
            isStrictlyIncreasing(arr, index + 1);
        } else {
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
            isStrictlyIncreasing(arr, index + 1);
        }
    }

    // place a particular element at the end
    public static void pushtoend(String str,char e, int i, String selected , String result){
        if (i == str.length()) {
            System.out.println(result + selected);
            return;
        }
    
        if (str.charAt(i) == e) {
            selected = selected + str.charAt(i);
        } else {
            result = result + str.charAt(i);
        }
    
        pushtoend(str, e, i + 1, selected, result);
    }

    // Eliminate the duplicates

    public static boolean isnotDuplicate(char c, String temp) {
        for (int i = 0; i < temp.length(); i++) {
            if (c == temp.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void removeDuplicates(String s, int a, String r , String temp) {
        if (a == s.length()){
            System.out.println(r);
            return;
        }

        if (a == 0){
            temp += s.charAt(a);
            r += s.charAt(a);
        } else {
            if (isnotDuplicate(s.charAt(a), temp)){
                temp += s.charAt(a);
                r += s.charAt(a);
            }
        }
        removeDuplicates(s, a + 1, r, temp);
    }

    // Subsequence of a String (very  important concept)

    public static void Subsequence(String abc , int index , String Newabc){
        if  (index == abc.length()) {
            System.out.print(Newabc + " ");
            return ;
        }

        // to be added
        Subsequence(abc ,index + 1 ,Newabc + abc.charAt(index));
        
        // not to be added
        Subsequence(abc ,index + 1 ,Newabc);
    }

    // Printing unique subsequence of a string
    public static void UniqueSubsequence(String abc , int index , String Newabc, HashSet<String> set){
        if  (index == abc.length()) {
            if(set.contains(Newabc)) {
                return;
                }
            set.add(Newabc);
            System.out.print(Newabc + " ");
            return;
        }
        // to be added
        UniqueSubsequence(abc ,index + 1 ,Newabc + abc.charAt(index), set);
            
        // not to be added
        UniqueSubsequence(abc ,index + 1 ,Newabc , set);
    }

    // Printing keypad combinations

    public static String [] keypad = {"+",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printcombo(String str , int idx , String Combination){
        if(idx == str.length()) {
            System.out.print(Combination + " ");
            return;
        }

        // str.charAt(idx) returns "3" as a string
        // str.charAt(idx) - "0"  gives integer value of "3" which is 3
        for(int i=0; i<keypad[str.charAt(idx)-'0'].length(); i++) {
            char curr = keypad[str.charAt(idx)-'0'].charAt(i);
            printcombo(str, idx+1, Combination+curr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Tower of Hanoi

        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
        System.out.print("\nNumber of steps involved = ");
        System.out.println((int) (Math.pow(2, n)) - 1);

        // First and last occurance of an element in a string

        findocc("asdfghjkasdfghjasasdfgfhfhasdfghja", 'a', 0);
        System.out.println();

        // Reveese the String

        String name = "aryan";
        reverse(name, name.length()-1);
        System.out.println();

        // Sorting Strictly Increasing

        int num [] = {1,2,4,3,5,6,8,7,9,10};
        isStrictlyIncreasing(num, 0);
        System.out.println("\n");

        // place a particular element at the end
        
        pushtoend("axbcxxxdefgxhixxj", 'x', 0,"","");

        // Eliminate the duplicates

        removeDuplicates("aryan bhanot", 0, "", "");

        // Subsequence of a String (very  important concept)

        Subsequence("abc" ,0 ,"");
        System.out.println();

        Subsequence("aaa" ,0 ,"");
        System.out.println();
        System.out.println();

        // Printing unique subsequence of a string

        HashSet<String> set = new HashSet<String>();
        UniqueSubsequence("abc",0,"", set);
        System.out.println();

        // this line would not print small 'a' because we are reusing the old HashSet
        // fix this by commenting out the next line
        // set = new HashSet<>();
        // or you can make a new HashSet too
        UniqueSubsequence("aaa",0,"", set);
        System.out.println();
        System.out.println();

        // Printing keypad combinations

        printcombo("34", 0, "");

        sc.close();
    }
}
