
import sys


def gcd(a,b):   #최대공약수 => a/b 나머지 r  b/r 나머지 r1 r/r1 식으로 나눠감 
    if b == 0:
        return a
    else:
        return gcd(b,a%b)

case = int(input())

for i in range(case):
    a,b = map(int,input().split())
    lcm = (a*b) / gcd(a,b)
    print(int(lcm))