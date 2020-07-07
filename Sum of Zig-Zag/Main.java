#include<iostream>
using namespace std;
int main()
{
int r,c,sum=0;//sum of 1st and last row +middle element of other rows
 cin>>r>>c;
 int arr[r][c];
  for(int i=1;i<=r;i++)
  {
    for(int j=1;j<=c;j++)
    {
      cin>>arr[i][j];
      if(i==1||i==r)
      sum=sum+arr[i][j];
      else if(j%2==0)
        sum=sum+arr[i][j];
    }
  }
    cout<<"Sum of Zig-Zag pattern is "<<sum;
}