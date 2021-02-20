import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int first=0;
        int last= str.length()-1;
        
        while(first<last)
        {
            if(str.charAt(first)!=str.charAt(last))
            {
                System.out.println("No");
                return;
            }
            first++;
            last--;
        }
            System.out.println("Yes");
    }
}



