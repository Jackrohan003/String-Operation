//Longest Common Sub Subsequence Using memoization
import java.util.*;

public class Main 
{ 

/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
int lcs( char[] X, char[] Y, int m, int n,int t[][] ) 
{ 
	if (m == 0 || n == 0) 
	return 0; 
  if(t[m-1][n-1]!=-1)
    return t[m][n];

	if (X[m-1] == Y[n-1]) 
	return t[m][n]= 1 + lcs(X, Y, m-1, n-1,t); 
	else
	return t[m][n]=max(lcs(X, Y, m, n-1,t), lcs(X, Y, m-1, n,t)); 
} 

/* Utility function to get max of 2 integers */
int max(int a, int b) 
{ 
	return (a > b)? a : b; 
} 

public static void main(String[] args) 
{ 
	Main lcs = new Main(); 
	String s1 = "AGGTAB"; 
	String s2 = "GXTXAYB"; 

	char[] X=s1.toCharArray(); 
	char[] Y=s2.toCharArray(); 
	int m = X.length; 
	int n = Y.length; 
  int t[][] = new int[m+1][n+1];

  
        // Fill each row with -1  
        for (int[] row : t) 
            Arrays.fill(row, -1); 

	System.out.println("Length of LCS is" + " " + 
								lcs.lcs( X, Y, m, n,t ) ); 
}

} 


