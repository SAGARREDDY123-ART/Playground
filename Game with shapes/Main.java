#include<iostream>
using namespace std;
int main()
{
  int a,b;//a=radius of circle
  cin>>a>>b;//b=length of a squre
 if(a<=(b/2.0))
   cout<<"circle can be inside a square";
 else
   cout<<"circle cannot be inside a square";
}