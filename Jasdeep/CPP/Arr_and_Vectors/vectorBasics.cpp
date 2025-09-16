#include <iostream>
#include <vector>
using namespace std;

int main(){

    vector<int> v; //you need not mention the size

    v.push_back(3);
    v.push_back(4);
    v.push_back(5);

    for(int i=0; i<v.size(); i++){
        cout<<v[i]<<" ";
    }cout<<endl;

    cout<<v.size()<<endl;
    cout<<v.capacity()<<endl;
    
    return 0;
}