#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int temp=pow(m,n);
  if(temp>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}