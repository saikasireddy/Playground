n=int(input())
temp=n
sum1=0
while(n>0):
  f=1
  r=n%10
  for i in range(r,1,-1):
    f=f*i
  sum1=sum1+f
  n=n//10
if(sum1==temp):
  print("Yes")
else:
  print("No")
  



'''sum1=0
num=int(input())
temp=num
while(num):
    i=1
    f=1
    r=num%10
    while(i<=r):
        f=f*i
        i=i+1
    sum1=sum1+f
    num=num//10
if(sum1==temp):
    print("Yes")
else:
    print("No")'''