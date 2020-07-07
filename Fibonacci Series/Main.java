#include<iostream>
using namespace std;
int fibb(int num);
int main()
{
 int n;
 cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fibb(n);
}
int fibb(int num)
{
  if(num==1)
    return 0;
  else if(num==2)
    return 1;
  else 
    return fibb(num-1)+fibb(num-2);
      
      
}