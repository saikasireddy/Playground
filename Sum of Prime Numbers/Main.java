'''from math import sqrt
def prim(pn):
  if pn==1:
    return False
  for i in range(2,int(sqrt(pn))+1):
    if(pn%i==0):
      return False
  return True
def sp(l,r):
  sum1=0
  for i in range(r-1, l, -1):
    sp=prim(i)
    if(sp):
      sum1+=i
    return sum1
l=int(input())
r=int(input())
print(sp(l,r))'''
'''import math  
def checkPrime(numberToCheck) : 
    if numberToCheck == 1 : 
        return False
    for i in range(2, int(math.sqrt(numberToCheck)) + 1) : 
        if numberToCheck % i == 0 : 
            return False
    return True  
def primeSum(l, r) : 
    sum = 0
    for i in range(r-1, l , -1) :
        isPrime = checkPrime(i) 
        if (isPrime) : 
            sum += i 
    return sum
l=int(input())
r=int(input())
print(primeSum(l, r)) '''
import math
def prim(checknum):
  if(checknum==1):
    return False
  for i in range(2,(int(math.sqrt(checknum)))+1):
    if(checknum%i==0):
      return False
  return True
def su(l,r):
  sum1=0
  for i in range(r-1,l,-1):
    c=prim(i)
    if(c):
      sum1+=i
  return sum1
l=int(input())
r=int(input())
print(su(l,r))