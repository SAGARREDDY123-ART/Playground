#include <iostream>
using namespace std;
int main() 
{
  int a;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
    for(int j=1;j<=a;j++)
    {
      if(i%2!=0&&j==a)
        cout<<(i+1);
      else if(i%2==0&&j==1)
        cout<<(i+1);
      else
      cout<<i;
    }
    printf("\n");
  }
  return 0;
}