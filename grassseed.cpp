#include <iostream>
#include <iomanip>
using namespace std;
int main() {
  double c;
  cin>>c;
  if(0<c and c<=100){
    int l;
    cin>>l;
    if(1<=l and l<=100){
      double sum=0,h,w;
      for(int i=1;i<=l;i++){
        cin>>h>>w;
        sum+=h*w;
      }
      cout<<setprecision(11)<<sum*c;
    }
  }
}