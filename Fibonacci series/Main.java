n=int(input())
n1,n2=0,1
count1=0
if(n==1):
  print(n1)
else:
  while(count1<n):
    print(n1,end=" ")
    nth=n1+n2
    n1=n2
    n2=nth
    count1+=1