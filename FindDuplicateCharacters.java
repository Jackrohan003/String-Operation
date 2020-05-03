import java.io.*;
import java.util.*;

public class FindDuplicateCharacters{
    
    public static void main(String args[])
    {
        printDuplicate("Programming");
    }
    
    public static void printDuplicate(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else 
                map.put(c,1);
        }
        for(Map.Entry<Character,Integer> dup : map.entrySet())
        {
            if(dup.getValue() > 1)
                System.out.println(dup.getKey()+"-->"+dup.getValue());
        }
        
    }
    
}
