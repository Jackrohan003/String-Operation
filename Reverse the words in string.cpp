#include <bits/stdc++.h>
using namespace std;

int main()
{
    string str;
    string d="";
    cout<<"Enter the string :";
        
     getline(cin,str);
     int len = str.length();
     int start,end=len;
     
     
     for(int i=len-1;i>=0;i--)
     {
        
            if(str[i]==' ')
            {
                start = i+1;
                while(start!=end)
                    d+=str[start++];
                    
                d+=' ';
                end = i;
            }
            i--;
     }
        start=0;
            while(start!=end)
                d+=str[start++];
                
         cout<<"Reveres the string "<<d;
         
         return 0;
}
