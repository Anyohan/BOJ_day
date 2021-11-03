case = int(input())
for _ in range(case):
    k,sec = input().split()
    result = ""
    for i in sec:
        result += i*int(k)
    print(result)



