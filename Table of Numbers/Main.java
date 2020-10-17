#include <iostream>

using namespace std;

int main()
{
    int n,ans=0,x=0;
    cin>>n;
    for(int i=1;i<=10;i++)
    {
        x=i*n;
        cout<<x<<" ";
        ans=ans+x;
    }
    cout<<endl;
    cout<<ans;
    return 0;
}
