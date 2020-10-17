#include <iostream>

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
    cin>>x;
    int count=0;
    
    for(int i=0;i<n;i++)
    {
        if(a[i]==x)
        {
            cout<<"index = "<<i;
            count=1;
        }
        if(i==n-1 && count==0)
        {
            cout<<"-1";
        }
    }

    return 0;
}
