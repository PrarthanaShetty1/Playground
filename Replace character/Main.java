#include <iostream>
#include <bits/stdc++.h> 

using namespace std;

int ReplaceChar(char str[],int n,char c1, char c2)
{
   for(int i=0; i<n;i++)
   {
       if(str[i]==c1)
       {
           str[i]=c2;
       }
       else if(str[i]==c2)
       {
           str[i]=c1;
       }
   }
   cout<<str;
}

int main()
{
    char c1,c2;
    char str[80];
    cin>>str;
    cin>>c1;
    cin>>c2;
    int n;
    n=strlen(str);
    ReplaceChar(str,n,c1,c2);

    return 0;
}
