#include <iostream>
using namespace std;

int main(){

    int n1=0, n2=1, n3=1, num;
    cin>>num;

    for(int i=1; i<num; i++){
        n3= n1+n2;
        n1=n2;
        n2=n3;
    }
    cout<<n3;
    
    return 0;
}