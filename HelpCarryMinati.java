import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- !=0)
        {
            String x = sc.nextLine();
            
            int n= x.length();
                 int flag=0;
            char s[] = x.toCharArray(); 
            
            
                for(int i=0; i<n; i++)
                {
                    if(s[i] != 'a') {
                        s[i]--;
                        flag=1;
                    } 
                    else 
                    {
                        if(flag==1)
                            break;
                    }
                }

                if(flag==0){
                    s[n-1]='z';
                }

            System.out.println(s);               
            
        }
    }
}
