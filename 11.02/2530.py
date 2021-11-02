#내 풀이

#a,b,c = map(int,input().split())
#d = int(input())

#m = (c+d)//60
#s = (c+d)%60
#r = b+m
#g = r//60
#k = a+g%24
 

#if k >= 24:
    #if r >= 60:
       # print(k-24,r%60,s)
    #else:
        #print(k-24,r,s)
#else:
    #if r >= 60:
        #print(k,r%60,s)
    #else:
        #print(k,r,s)


# 다른풀이

hour, minute, second = map(int, input().split())
cook = int(input())
 
second += cook % 60
cook = cook // 60
 
if second >= 60:
    second -= 60
    minute += 1
 
minute += cook % 60
cook = cook // 60
 
if minute >= 60:
    minute -= 60
    hour += 1
 
hour += cook % 24
if hour > 23:
    hour -= 24
 
print(hour, minute, second)
 