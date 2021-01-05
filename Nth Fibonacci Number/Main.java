'''def fib(n):
  if(n==1):
    return 0
  elif(n==2):
    return 1
  else:
    return fib(n-1)+fib(n-2)
n=int(input())
print(fib(n))'''
'''n=int(input())
n1,n2=0,1
count1=0
if n==1:
  print(n1)
else:
  for i in range(2,n):
    c=n1+n2
    n1=n2
    n2=c
  print(n2)'''
def fib(n):
  a=0
  b=1
  if(n==1):
    return a
  else:
    for i in range(2,n):
      c=a+b
      a=b
      b=c
    return b
n=int(input())
print(fib(n))
      
    