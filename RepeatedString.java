/*
Hacker rank Solution Repeated String

*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

    long max=0;
    int i=0;
    
    char ch[]=s.toCharArray();
    long mod= n%s.length();
    long q = n/s.length();
    
    while(i<s.length())
    {
        if(ch[i++]=='a')
        max++;
    }
    max = max*q;// number of times a in string has same in Quationt
    if(mod!=0)
    {
        i=0;
        while(i<mod)
        {
            if(ch[i++]=='a')
                max++;
        }
    }

    return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
