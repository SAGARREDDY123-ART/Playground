#include<iostream>
using namespace std;
int main()
{
 int target,score,attempt=0;
  cin>>target;
  int sum=0;
  while(sum<target)
  {
    cin>>score;
    sum=sum+score;
    attempt=attempt+1;
  }
//cout<<"The number of turns is "<<attempt;
  printf("The number of turns is %d",attempt);
}