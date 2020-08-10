public class LongestRepeatingChar
{
     public static void main(String []args){
        String s = "aabaaa";
        System.out.println(maxlen(s));
  }
  public static int maxlen(String s){
      if(s==null || s.length()==0)
        return 0;
      int cnt =0;
      char prev = 0;
      int max =1;

      for(int i=0;i<s.length()-1;i++){
          char c = s.charAt(i);
          
          if(c==s.charAt(i+1)){
              cnt++;
          }else{
              max = Math.max(cnt,max);
              cnt =1;
          }
      }
      max = Math.max(cnt,max);
        return max;
     }
}
