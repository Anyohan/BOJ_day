s = int(input())
for i in range(s):
    s -= i
    if s <= i:
        break
print(i)
