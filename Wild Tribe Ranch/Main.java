#include<iostream>
using namespace std;
int main()
{
  int a,b;//a==max weight, b==weight of florence
  cin>>a>>b;
  if(a>b)
    cout<<"Yes, you can enter.";
    else if(b>a)
      cout<<"Sorry, you can't enter";
      else
        cout<<"Yes, you can enter. Kindly use a rope.";
}