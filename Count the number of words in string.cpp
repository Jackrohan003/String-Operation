#include<iostream>

using namespace std;

int main()
{
    char s[100];
    int count=0;
    
    cout<<"Enter the string ";
    cin.getline(s,100);
 
    char *p =s;
   
    while(*p!='\0')
    {
        if(*p==' ' && *(p+1)!=' '&& *(p+1)!='\0') //*(p+1) ignore the multiple white space and null character.
        {
            count++;        
        }
    p++;
    }

    cout<<"number of words "<<count+1;

}
