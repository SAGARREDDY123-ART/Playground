#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int t_b,t_r,r,b;
  cin>>t_b>>t_r>>r>>b;
 float total_overs=t_b/6;
  cout<<total_overs<<"\n";
  float overs_finished;
  overs_finished=(b/6)+(b%6)*0.1; //12.4 means 12 overs 4 balls 
  cout<<overs_finished<<"\n";
  float crr=r/overs_finished;
  printf("%.1f\n",crr);
  float trr=t_r/total_overs;
  printf("%.1f\n",trr);
  if(crr>trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
  
}