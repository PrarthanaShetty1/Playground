#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{ 
    int n,x;
    cin>>n;
    int a[n];
    for(int i=1;i<=n;i++)
    {
        cin>>a[i];
    }
    cin>>x;
    int count=0;
    if(x<=n)
    { 
        count=1;
            for(int k=x;k<=n;k++)
            {
                swap(a[k],a[k+1]);
            }
    }
    
    if(count==1)
    {
        for(int l=1;l<n;l++)
        {
            cout<<a[l]<<" ";
        }
    }else{
        cout<<"Deletion not possible";
    }

    return 0;
}
