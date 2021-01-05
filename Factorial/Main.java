'''n=int(input())
fact=0
if(n==0):
  print(1)
else:
  for i in range(1,n+1):
    fact=fact*i
  print(fact)'''



import math
def fact1(n):
  if n==1:
			return 1
  else:
    return n*(fact1(n-1))
n=int(input())
print(fact1(n))