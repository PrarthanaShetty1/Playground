#include <iostream>
//#include<std|bits++.h>

using namespace std;

int main()
{
    int n,x;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    
    
    int count=0;
    x=n/2;
    
        int p=0;
        for(int i=0;i<x;i++)
        {
            for(int j=i+1;j<x;j++)
            {
                if(a[i]>a[j])
                {
                    p=a[i];
                    a[i]=a[j];
                    a[j]=p;
                }
            }
        }
        int q=0;
        for(int i=x;i<n;++i)
        {
            for(int j=i+1;j<n;++j)
            {
                if(a[i]<a[j])
                {
                    q=a[i];
                    a[i]=a[j];
                    a[j]=q;
                }
            }
        }

    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    return 0;
    }