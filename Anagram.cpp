#include <bits/stdc++.h>
using namespace std;

bool IsAnagram(string str1,string str2)
{
    int s1=0;
    int s2=0;
    
    if(str1.length()!=str2.length())
        return false;
    
    int len1 = str1.length();
    for(int i=0;i<len1;i++)
        s1 = s1+int(str1[i]);
    
    int len2 = str2.length();
    for(int i=0;i<len2;i++)
        s2 = s2+int(str2[i]);
    
    if(s1==s2)
        return true;
    else
        return false;
}

int main() {
	//code
	int t;
	cin>>t;
	while(t--)
	{
	    string str1;
	    cin>>str1;
	    string str2;
	    cin>>str2;
	    bool Res = IsAnagram(str1,str2);
	    
	    if(Res)
	        cout<<"YES"<<endl;
	    else
	        cout<<"NO"<<endl;
	}
	return 0;
}
