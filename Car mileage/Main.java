#include<iostream>
using namespace std;
int main()
{
float milege;//milege=kmpl==km/litres
  int pet_lit,dis,dis_1;//petrol in litres
  cin>>milege>>pet_lit>>dis;
  dis_1=(int)milege*pet_lit;
  //cout<<dis_1;
  if(dis>dis_1)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
    
  
}