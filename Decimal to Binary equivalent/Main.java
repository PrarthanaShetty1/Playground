#include <iostream>


using namespace std;

int main()
{
    int a[10];
    int n;
    cin>>n;
    int i=0;
    while(n>0)
    {
        if(n%2==0){
            a[i]=0;
        }
        else{
            a[i]=1;
        }
        n=n/2;
        i++;
    }
    
    for(int j=i-1;j>=0;j--)
    {
        cout<<a[j];
    }

    return 0;
}
