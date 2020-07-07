#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int num,first,last,count;
  cin>>num;
  last=num%10; 
  first = num/1000;  

cout<<(first+last);
}