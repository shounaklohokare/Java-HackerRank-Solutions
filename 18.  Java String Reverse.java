import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        boolean isPal = true;
        
        int n = A.length()-1;
        int i=0;
        int j = n;
        
        while(i < n && j>=0){
            
            if(A.charAt(i)!=A.charAt(j)) isPal = false;
            i++;
            j--;
        }
        
        String ans = isPal ? "Yes" : "No";
        System.out.print(ans);
        
        
        
    }
}



