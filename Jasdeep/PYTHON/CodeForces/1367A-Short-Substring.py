# n = int (input())

# arr = []
# sub_arr = []

# for i in range (n):
#     s = input()
#     arr.append(s)

# for s in arr:

#     if len(s)<=2:
#         print (s)
#         continue

#     l=0
#     r=2

#     while r<=len(s):
#         sub_arr.append(s[l:r+1:2])
#         l+=3
#         r+=3


#     for j in sub_arr:
#         print (j, end="")
#     sub_arr.clear()
#     print ()

# Click Ctrl+` to open the terminal`

t = int(input())

for _ in range(t):
    b = input()
    a = b[0]  # first character

    for i in range(1, len(b), 2):
        a += b[i]

    print(a)


