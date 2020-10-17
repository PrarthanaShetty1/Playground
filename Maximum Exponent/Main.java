#include <iostream>

using namespace std;

int exponent(int i)
{
    int c=0;
    while(i%2==0 && i!=0)
    {
        c=c+1;
        i=i/2;
    }
    return c;
}


int main()
{
    int a,b;
    int max=0,ans,an;
    cin>>a;
    cin>>b;
    for(int i=a;i<=b;i++)
    {
        ans=exponent(i);
        if(ans>max)
        {
            max=ans;
            an=i;
        }
    }
    cout<<an;
    
    return 0;
}
