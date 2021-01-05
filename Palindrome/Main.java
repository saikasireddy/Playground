def palindrome(s):
  return s==s[::-1]
s=input()
c=palindrome(s)
if c:
  print("Palindrome")
else:
  print("Not a Palindrome")