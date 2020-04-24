import java.util.*;

class ReverseStringRecursive
{
 public static void main(String[] args)
 {
  ReverseStringRecursive rsr=new ReverseStringRecursive();
  String blogName="Rohan";
  String reverse=rsr.recursiveReverse(blogName);
  System.out.println("Reverse of java2blog is:"+reverse);
 }
 
 public String recursiveReverse(String orig)
 {
  if(orig.length()==1)
   return orig;
  else
   return orig.charAt(orig.length()-1)+recursiveReverse(orig.substring(   0,orig.length()-1));
   
  
 }
}
 
