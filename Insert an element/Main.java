#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    // 1 2  3 4 5
    // 1 10 2 3 4 5
    int n=0,x=0,y=0;
    cin>>n;
    int a[n+1];
    for (int i=0;i<n;i++) {
        cin>>a[i];
    }
    cin>>x;
    cin>>y;

    for(int i=n;i>x;i--)
    {
        swap(a[i],a[i-1]);
    }
    
    a[x]=y;
    
    swap(a[x-1],a[x]);
    
    for(int i=0;i<n+1;i++)
    {
        cout<<a[i]<<" ";
    }
    
    return 0;
}
