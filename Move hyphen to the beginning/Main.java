#include<bits/stdc++.h> 
using namespace std; 

void moveHyphenInFront(char s[]) 
{ 
	int i = strlen(s)-1; 
	for (int j = i; j >= 0; j--) 
		if (s[j] != '-') 
			swap(s[i--], s[j]); 
} 

int main() 
{ 
    char s[80];
    cin >> s;
	moveHyphenInFront(s); 
	cout << s; 
	return 0; 
} 
