message = input()
distinct_characters = set(message)
if len(distinct_characters) % 2 == 0:
    print("CHAT WITH HER!")
else:
    print("IGNORE HIM!")