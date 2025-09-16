#include <iostream>
using namespace std;

class Person {
    private:
        string name;
        int age;

    public:
        Person(string n, int a) {
            name = n;
            age = a;
        }

    string getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    void setAge(int a)
{
        if (a > 0) {
            age = a;
        } else {
            cout << "Age must be positive." << endl;
        }
    }

    
};