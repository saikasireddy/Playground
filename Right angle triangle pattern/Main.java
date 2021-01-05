n=int(input())
num=0
for i in range(0,n):
    for j in range(0,i+1):
        print("*",end=" ")
        num+=1
    print("\r")
'''rows = int(input())
for i in range(0, rows):
    for j in range(0, i + 1):
        print("*", end=' ')

    print("\r")'''