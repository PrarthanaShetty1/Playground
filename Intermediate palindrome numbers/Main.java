#include <iostream>

using namespace std;

int main()
{
    int a,b;
    cin>>a>>b;
    for(int i=a;i<=b;i++)
    {
        int n=0,d=0,r=0;
        n = i;
        while (n != 0)
        {
        d = n % 10;
        r = r * 10 + d;
        n = n / 10;
        }
        if(i==r)
        {
            cout<<i<<" ";
        }
    }
}
