#include <iostream>

using namespace std;

int main()
{
    int n1,n2;
    cin>>n1>>n2;
    int a[n1];
    int b[n2];
    int z=n1*n2;
    int c[z];
    int d[z];
    for(int i=0;i<n1;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<n2;i++)
    {
        cin>>b[i];
    }

    int k=0;
    for(int i=0; i<n1;i++)
    { 
        for(int j=0;j<n2;j++)
        {
            if(a[i]!=b[j])
            {
                c[k]=a[i];
                k++;
            }
        }
    }
    k=0;
    for(int i=0; i<n2;i++)
    { 
        for(int j=0;j<n1;j++)
        {
            if(b[i]!=a[j])
            {
                d[k]=b[i];
                k++;
            }
        }
    }
    int c1=0;
    for(int i=0;i<n1;i++)
    {
        int count=0;
        for(int j=0;j<z;j++)
        {
            if(c[j]==a[i])
            {
                count++;
            }
            if(count==n2)
            {
                cout<<c[j]<<" ";
                c1++;
                count=0;
            }
        }
    }
    for(int i=0;i<n2;i++)
    {
        int count=0;
        for(int j=0;j<z;j++)
        {
            if(d[j]==b[i])
            {
                count++;
            }
            if(count==n1)
            {
                cout<<d[j]<<" ";
                c1++;
                count=0;
            }
        }
    }
    cout<<endl;
    cout<<c1;
    return 0;
}
