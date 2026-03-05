class Account:
    def __init__(self, acc_no, acc_pass):
        self.acc_no = acc_no
        self.acc_pass = acc_pass

class Account1:
    def __init__(self, acc_no, acc_pass):
        self.acc_no = acc_no
        self.__acc_pass = acc_pass

    def __hello(self):
        print("Hello from Account1")

    def welcome(self):
        self.__hello()

    def get_acc_pass(self):
        return self.__acc_pass

acc1 = Account("12345", "mypassword")
print("Account Number:", acc1.acc_no)        # Public attribute
print("Account Password:", acc1.acc_pass)    # Public attribute

acc2 = Account1("67890", "mypassword123")
print("Account Number:", acc2.acc_no)        # Public attribute
# The following line would raise an AttributeError because __acc_pass is private
# print("Account Password:", acc2.acc_pass)
print("Account Password (using getter):", acc2._Account1__acc_pass)  # Accessing private attribute using name mangling

# The following line would raise an AttributeError because __hello is private
# acc2.__hello()
print(acc2.welcome())  # Accessing private method through a public method