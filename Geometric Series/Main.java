import math
n=int(input())
if(n%2==1):	
  a=1
  r=2
  terms=(n+1)/2
  res=a*pow(2,terms-1)
  print(res)
		
else: 
    a=1
    r=3
    terms=n//2
    res=a*pow(3,terms-1)
    print(res)
          
	