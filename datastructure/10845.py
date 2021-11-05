#Queue
from sys import stdin

case = int(stdin.readline())
my_queue = []
for i in range(case):
    mes = stdin.readline().split()
    if mes[0] == "push":
        my_queue.append(mes[1])
    elif mes[0] =="pop":
        if len(my_queue) == 0:
            print(-1)
        else:
            print(my_queue.pop(0))
    elif mes[0] == "size":
        print(len(my_queue))
    elif mes[0] =="empty":
        if len(my_queue) == 0:
            print(1)
        else:
            print(0)
    elif mes[0] == "front":
        if len(my_queue) == 0:
            print(-1)
        else:
            print(my_queue[0])
    elif mes[0] =="back":
        if len(my_queue) == 0:
            print(-1)
        else:
            print(my_queue[-1])
    
    


