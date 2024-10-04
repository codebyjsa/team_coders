#include<iostream>
using namespace std;

int fact(int n){

    int factorial =1;
    for(int i=1; i<=n; i++){
        factorial*=i;
    }

    return factorial;
}

int ncr(int n, int r){
    int fact_n = fact(n);
    int fact_r = fact(r);
    int fact_nmr = fact(n-r);

    return fact_n/(fact_r*fact_nmr);
}

int main(){
    
    int n, r;
    cin>>n>>r;

    cout<<ncr(n, r)<<endl;

    return 0;
}