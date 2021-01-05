import math
def decimal_to_binary(n):
	binary = 0
	i = 1
	flag = 1
	while(n != 0):
		remainder = n % 2
		n = int(n / 2)
		binary = binary + remainder * i
		i = i * 10
	return binary
n = int(input())
print(decimal_to_binary(n))