N,K = map(int,input().split())
caseList = list(range(1,N+1))
josephList = []
head = 0

for i in range(N):
    head += K-1
    if len(caseList) <= head:
        head = head%len(caseList)
    josephList.append(caseList.pop(head))
print("<",", ".join(str(i) for i in josephList),">",sep = "")

#head = head%len(caseList)
#[1,2,4,5,7] head = 6, len = 5
#6번째 사람을 구해야되는데 5명밖에 없다
#그러면... 6%5 는 1 이니까 다시 앞으로



    
    

    

