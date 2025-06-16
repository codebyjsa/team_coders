#include<iostream>
using namespace std;
int main (){
    int marks [6];

    for (int i = 0; i < 6; i++) {
        cout << "Enter marks of student " << (i + 1) << ": ";
        cin >> marks[i];
    }
    cout << "Students with marks less than 35 are: "<<endl;
    for (int i = 0; i < 6; i++) {
        if (marks[i] < 35) {
            cout << "Student " << (i + 1) << " with marks: " << marks[i] << endl;
        }
    }
}