import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s=s.trim();
        if(s.length()==0) System.out.println(0);
        else{
            
            
            String[] s_arr = s.split("[!?,._'@ ]+");
            
            System.out.println(s_arr.length);
            for(String str : s_arr) System.out.println(str);
        }
        
    }
}

