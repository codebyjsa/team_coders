class Student:
    def __init__(self, name):
        self.name = name

s1 = Student("Alice")

print(s1.name)  # Output: Alice

del s1.name

print(s1.name)  # This will raise an AttributeError since 'name' has been deleted