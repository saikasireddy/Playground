n=[int(i) for i in str(input())]
eve,odd=0,0
for j in range(0,len(n)):
  if(j%2==0):
    eve=eve+n[j]
  else:
    odd=odd+n[j]
print(abs(odd-eve))