x,y=input().split()
s=int(x)
a=int(y)
a1=[]
sum=s
a1.append(s)
for i in range(1,a):
  a1.append(sum-1)
  sum=sum+a1[i]
print(sum)