#include <iostream>

using namespace std;

int Calculate(int m, int n)
{
    int max=0;
    for(int i=m;i<=n;i++)
    {
        if(i%3==0 && i%5==0)
        {
            max+=i;
        }
    }
    return max;
}

int main()
{
    int n,m;
    cin>>m>>n;
    cout<<Calculate(m,n);

    return 0;
}
