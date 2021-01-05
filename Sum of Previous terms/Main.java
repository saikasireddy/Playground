def fibonacci(n):
    a = 1
    b = 2
    if(n>30):
        return("Invalid Input")
    elif(n == 1 or n==2):
        return n
    else:
        for i in range(2,n):
            c = a + b
            a = b
            b = c
        return b
n=int(input())
print(fibonacci(n))
