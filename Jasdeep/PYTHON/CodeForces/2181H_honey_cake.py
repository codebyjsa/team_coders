import math

w = int(input())
h = int(input())
d = int(input())

found = False

n = int(input())
for wc in range (1, int(math.sqrt(n))+1):

    if (n%wc != 0 or w%wc!=0):
        continue

    rem = n//wc

    for hc in range (1, int(math.sqrt(rem))+1):

        if (rem%hc != 0 or h%hc != 0 ):
            continue

        dc = rem//hc

        if (d%dc == 0):
            found = True
            print(wc, hc, dc)
            break

    if found:
        break

if not found:
    print(-1)