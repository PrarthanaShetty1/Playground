#include <iostream>

using namespace std;

int main()
{  
    int n,a=0;
    cin>>n;
    int x=0;
    int b=1;
    while(n>0)
    {
        x=n%10;
        a+=x*b;
        b*=2;
        n/=10;
    }
    
    cout<<a;

    return 0;
}
