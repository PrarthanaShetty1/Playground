#include <iostream>
using namespace std;
struct Node {
   int data;
   struct Node *next;
};
struct Node* head = NULL;

void insert(int new_data) {
   struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
   new_node->data = new_data;
   new_node->next = head;
   head = new_node;
}
void display1() {
   struct Node* ptr;
   ptr = head;
   while (ptr != NULL) {
      cout<< ptr->data <<" ";
      ptr = ptr->next;
   }
}

int display(int n,int y) {
  int ans=0;
   struct Node* ptr;
   ptr = head;
  for(int i=0;i<n-y+1;i++)
  {
      ans=ptr->data;
      ptr = ptr->next;
    
  }
   return ans;
}
int main() {
  int n,x,y,z;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>x;
    insert(x);
  }
  cin>>y;
  if(y>n)
  {
    cout<<"No node found";
  }
  else{
  cout<<display(n,y);}
   return 0;
}