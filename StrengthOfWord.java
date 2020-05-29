package codes;
/**	WAP to find the Strength of word
 * Strength of a word means the sum of each alphabets position in 
 * the alphabets series.S
 * Eg; cat now c is 3, a is 1 and t is 20. 
 * So Strength is (3+1+20=24)


 */
import java.util.*;
class StrengthOfWord
{
    public static void main(String[] args) {
		
	
        Scanner in=new Scanner(System.in);
        int i,len,sum=0;
        String s;
        char ch;
        System.out.println("Enter a word");
        s=in.next();
        in.close();
        s=s.toUpperCase();
        len=s.length();
        for(i=0;i<len;i++)
        {
            ch=s.charAt(i);
            sum=sum+(ch-64);
        }
        System.out.println("Strength ="+sum);
    }
}
