#include <iostream>

using namespace std;

int
main ()
{
  int n = 0;
  cin >> n;
  int a[n];
  int count=0;
  int count1=0;
  for (int i = 0; i < n; i++) 
    {
      cin >> a[i];
    }

  for (int q = 0; q < n; q++)
    {
      if (a[q] == 0)
	  {
	    count++;
	  }
      else
	  {
	    count1++;
	  }
    }
  for (int k = 0; k < count; k++)
    {
      a[k] = 0;
    }
  for (int j = count; j < n; j++)
    {
      a[j] = 1;
    }

  for (int p = 0; p < n; p++)
    {
      cout << a[p];
    }
  return 0;
}
