n = int(input())

# cnt = 0

# while n>0:
#     if n>=100:
#         n-=100
#     elif n>=20:
#         n-=20
#     elif n>=10:
#         n-=10
#     elif n>=5:
#         n-=5
#     elif n>=1:
#         n-=1
#     cnt+=1
# print(cnt)

den = [100, 20, 10, 5, 1]
cnt = 0

# start = 0
# end = len(den)-1

# while n>0:
#     mid = start + (end - start)//2
#     if n>den[mid]:
#         end = mid - 1
#     elif n<den[mid]:
#         start = mid + 1
#     elif mid<0:
#         n-=den[0]
#         cnt+=1
#     elif mid>len(den)-1:
#         n-=den[-1]
#         cnt+=1
#     else:
#         n-=den[mid]
#         cnt+=1
# print(cnt)

for d in den:
    cnt += n // d
    n = n % d
print(cnt)