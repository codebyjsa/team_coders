class Car:

    def __init__(self, type):
        self.type = type

    @staticmethod
    def start():
        print("Car started")

    @staticmethod
    def stop():
        print("Car stopped")

class Toyota(Car):

    def __init__(self, name, type):
        self.name = name
        super().__init__(type)

car1 = Toyota("Corolla", "Sedan")
car1.start()
car1.stop()
print("Car Name:", car1.name)
print("Car Type:", car1.type)

#Multi Inheritance
class A:
    varA="Hello from A"

class B:
    varB="Hello from B"

class C(A, B):
    varC="Hello from C"

objC = C()
print(objC.varA)
print(objC.varB)
print(objC.varC)