s1 = "abcde"
s2 = "123"

s3 = ""
len1 = len(s1)
len2 = len(s2)
min_len = min(len1, len2)

for i in range(min_len):
    s3 += s1[i] + s2[-(i + 1)]

# Add remaining characters from s1 if any
if len1 > min_len:
    s3 += s1[min_len:]

# Add remaining characters from s2 if any (from front)
if len2 > min_len:
    s3 += s2[:len2 - min_len][::-1]

print("Merged String:", s3)
