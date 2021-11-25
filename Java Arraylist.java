import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        String s = scanner.nextLine();
        
        ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>(n);
        
        for(int i=0; i<n; i++){
            
            s = scanner.nextLine();
            
            al.add(new ArrayList<String>(Arrays.asList(s.split("\\s"))));
        }
        
        
        int m = scanner.nextInt();
        for(int i=0; i<m; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            if(x < al.size() && y<al.get(x-1).size() && y>=0){
                System.out.println(al.get(x-1).get(y));
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}
