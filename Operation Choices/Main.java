/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int c,a,b;
    cin>>c>>a>>b;
    if(c==1)
    {
        cout<<a+b;
    }
    if(c==2)
    {
        cout<<a-b;
    }
    if(c==3)
    {
        cout<<a*b;
    }
    if(c==4)
    {
        cout<<a/b;
    }
    return 0;
}

