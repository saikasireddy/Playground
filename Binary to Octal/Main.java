import math
def binary_to_octal(binary):
    octal = 0
    decimal = 0
    i = 0


    while(binary != 0):
        decimal += (binary%10) * math.pow(2,i);
        i = i + 1
        binary = int(binary/10)


    i = 1


    while (decimal != 0):
        octal += (decimal % 8) * i;
        decimal = int(decimal/8)
        i *= 10;


    return octal;




binary = int(input())
print(int(binary_to_octal(binary)))