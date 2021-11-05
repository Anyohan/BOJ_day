import math
a,b,c = input().split()
a = int(a)
b = int(b)
c = int(c)

print(math.floor((a+b)%c))
print(math.floor(((a%c)+(b%c))%c))
print(math.floor((a*b)%c))
print(math.floor(((a%c)*(b%c))%c))


