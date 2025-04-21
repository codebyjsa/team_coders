#include<iostream>
using namespace std;

struct student {
    int studentID;
    char name[100];
    int age;
    float grade;
};

void studentInput(student students[], int n){
    for (int i = 0; i < n; i++)
    {
        cout<<"Enter the details for the student "<<i+1<<endl;
        cout<<"Student's ID: ";
        cin >> students[i].studentID;
        cin.ignore();
        cout<<"Student's Name: ";
        cin.getline(students[i].name, 100);
        cout<<"Age: ";
        cin>>students[i].age;
        cout<<"Grades: ";
        cin>>students[i].grade;
        cout<< endl;
    }    
}

void studentDisplay(student students[], int n){
    for (int i = 0; i < n; i++)
    {
        cout<<"Student ID: "<<i+1<<endl;
        cout<<"Name: "<<students[i].name<<endl;
        cout<<"Age: "<<students[i].age<<endl;
        cout<<"Grades: "<<students[i].grade<<endl;
        cout<<endl;
    }
}

void studentHighGrade(student students[], int n){
    float max_grade = -1.0;
    for (int i = 0; i < n; i++)
    {
        if (students[i].grade>max_grade)
        {
            max_grade=students[i].grade;
        }
    }
    cout<<"Students with max grades"<<endl;
    for (int i = 0; i < n; i++)
    {
        if (max_grade==students[i].grade)
        {
            cout<<"Student ID: "<<i+1<<endl;
            cout<<"Name: "<<students[i].name<<endl;
            cout<<"Age: "<<students[i].age<<endl;
            cout<<"Grades: "<<students[i].grade<<endl;
            cout<<endl;
        }
    }
}


int main (){

    int n;
    cout<<"Enter the number of students: ";
    cin>>n;
    student students[n];

    studentInput(students, n);
    studentDisplay(students, n);
    studentHighGrade(students, n);

    return 0;
}