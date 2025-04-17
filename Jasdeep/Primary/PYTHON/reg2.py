import re

# Regular expression pattern to allow only a-z, A-Z, and 0-9
pattern = r"^[a-zA-Z0-9]+$"

# Test strings
test_strings = ["Hello123", "hello_world", "Test123!", "Python3", ""]

for s in test_strings:
    if re.fullmatch(pattern, s):
        print(f"'{s}' contains only allowed characters.")
    else:
        print(f"'{s}' contains invalid characters.")
