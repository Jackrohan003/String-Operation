/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


public class StringAllUniqueCharMain {
 
 public static void main(String[] args) {
  
  System.out.println("Apple has all unique chars : "+ hasAllUniqueChars("apple"));
  System.out.println("index has all unique chars : "+ hasAllUniqueChars("index"));
  System.out.println("world has all unique chars : "+ hasAllUniqueChars("world"));
 }
 
 
 public static boolean hasAllUniqueChars (String word) {
 
     HashSet<Character> alphaSet=new HashSet<>();
 
 
     for(int index=0;index < word.length(); index ++)   {
      
         char c =word.charAt(index);
 
         // If Hashset's add method return false,that means it is already present in HashSet
         if(!alphaSet.add(c))
              return false;
     }
 
     return true;
 }
}
 
