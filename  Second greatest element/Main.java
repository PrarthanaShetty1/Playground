#include <iostream>
#include <bits/stdc++.h> 

using namespace std;

int main()
{
    int max;
    int n,count=0;
    cin>>n;
    if(n<2){
        cout<<"Invalid Input";
    }
    else{
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    int x;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[j]==a[i])
            {
                count++;
            }
        }
    }
    if(count==n){
        cout<<"There is no second largest element";
    }
    else{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(a[j]>a[i])
            { 
                x=a[i];
                a[i]=a[j];
                a[j]=x;
            }

            
        }
    }
    cout<<a[n-2];
    }
    }
    return 0;
}
