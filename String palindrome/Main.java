def pali(s):
  return s==s[::-1]
s=input()
p=pali(s)
if p:
  print(s,"is a palindrome")
else:
  print(s,"is not a palindrome")