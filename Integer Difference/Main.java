#include <iostream>

using namespace std;

int main()
{
    int s,n,m;
    cin>>s;
    int a[s];
    for(int i=0;i<s;i++)
    {
        cin>>a[i];
    }
    cin>>n;
    cin>>m;
    
    for(int i=0;i<s;i++)
    {
        if(a[i]-n<m)
        {
            a[i]=++a[i];
        }
    }
    for(int i=0;i<s;i++)
    {
        cout<<a[i]<<" ";
    }


    return 0;
}
