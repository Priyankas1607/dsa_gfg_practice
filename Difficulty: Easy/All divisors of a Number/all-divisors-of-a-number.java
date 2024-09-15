//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            obj.print_divisors(n);
            System.out.println();
        }
    }
}

// } Driver Code Ends






class Solution {
    public static void print_divisors(int n) {
     
        ArrayList <Integer> al = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                if(n/i == i){
                    al.add(i);
                }
                else{
                     al.add(i);
                     al.add(n/i);
                }
            }
        }
        Collections.sort(al);
        
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i) + " ");
        }
    }
}
