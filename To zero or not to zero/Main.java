x,y=input().split()
l=int(x)
u=int(y)
for i in range(l,u+1):
  if(u>=100):
    print("%03d"%i,end=" ")
  elif(u>=10):
    print("%02d"%i,end=" ")
  else:
    print("%d"%i,end=" ")