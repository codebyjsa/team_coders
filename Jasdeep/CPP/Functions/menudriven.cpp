#include <bits/stdc++.h>
using namespace std;

bool isPalindrome(int x) {
    int rem, num = 0, temp = x;
    while (x > 0) {
        rem = x % 10;
        num = num * 10 + rem; // Fix for correct digit placement
        x /= 10;
    }
    return (num == temp); // Directly return the comparison result
}

float kgToPounds(int x) {
    return (x * 2.204);
}

int main() {
    char choice;
    cin >> choice;
    int x;

    if (toupper(choice) == 'A') {
        cin >> x;
        if (isPalindrome(x)) {
            cout << "Palindrome\n";
        } else {
            cout << "Not a Palindrome\n";
        }
    } else if (toupper(choice) == 'B') {
        cin >> x; // Ensure x is initialized
        cout << kgToPounds(x) << "\n";
    } else {
        cout << "Invalid choice! Terminated!\n";
    }
    return 0;
}
