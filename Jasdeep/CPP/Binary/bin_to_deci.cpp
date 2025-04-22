#include<iostream>
using namespace std;

int bintodec(int binNum){
    int ans = 0;
    int pow = 1;
    while (binNum>0)
    {
        int rem = binNum%10;
        ans += rem * pow;
        binNum /= 10;
        pow = pow * 2;
        
        
    }
    
    return ans;
}

int main (){
    int binnum;
    cin>>binnum;

    cout<<bintodec(binnum)<<endl;

    return 0;
}