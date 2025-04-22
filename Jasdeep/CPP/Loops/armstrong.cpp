#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, rem, dignum = 0, as = 0;
    cin >> n;
    int temp = n;  // 
    int real = n;  

    while (n > 0) {
        rem = n % 10;
        dignum++;
        n /= 10;
    }

    n = temp;

    while (n > 0) {
        rem = n % 10;
        as += pow(rem, dignum); 
        n /= 10;
    }

    if (as == real) {
        cout << "armstrong";
    } else {
        cout << "no";
    }

    return 0;
}
