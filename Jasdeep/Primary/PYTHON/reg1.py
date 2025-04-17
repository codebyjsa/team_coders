import re

pattern = r"^ab*$"  # start with 'a', then zero or more 'b', and nothing else

test_strings = ["a", "ab", "abb", "abbb", "b", "ba", "abc", ""]

for s in test_strings:
    if re.match(pattern, s):
        print(f"'{s}' matches")
    else:
        print(f"'{s}' does not match")
