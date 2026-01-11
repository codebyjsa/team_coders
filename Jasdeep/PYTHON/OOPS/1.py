class Student:

    #default constructor
    def __init__(self):
        pass

    #parameterized constructor
    def __init__(self, fullname):
        self.name = fullname

    @staticmethod #By this we will not need to create object to call this method
    def welcome ():
        print("Welcome Stuent")

    def name (self, lastname):
        return self.name+" "+lastname

s1= Student("Jasdeep")
print(s1.name)  # Output: Jasdeep
s1.welcome()    # Output: Welcome Student
