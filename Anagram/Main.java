#include <string.h>
#include <iostream>
#include <bits/stdc++.h> 

using namespace std;

int main()
{
    int n,m;
    string s;
    string str;
    cin>>s>>str;
    n=s.length();
    m=str.length();
    if(n!=m)
    {
        cout<<"Not Anagram";
    }
    int count=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(s[i]==str[j])
            {
                count+=1;
                break;
            }
        }
    }
    if(count==n)
    {
        cout<<"Anagram";
    }
    else{
        cout<<"Not Anagram";
    }
    return 0;
}
