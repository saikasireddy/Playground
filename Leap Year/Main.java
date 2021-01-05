#include <stdio.h>
int main()
{
   // Try out your code here
  int n;
  scanf("%d",&n);
  if(n%4==0 && n%400==0){
  printf("LEAP YEAR");
  }
  else if(n%100==0){
    printf("NOT LEAP YEAR");
  }
  else if(n%400==0){
    printf("LEAP YEAR");
  }
  else{
  printf("NOT LEAP YEAR");}
   return 0;

}



/*n=int(input())
if(n%4==0 or n%400==0):
  print("LEAP YEAR")
elif(n%100==0):
  print("NOT LEAP YEAR")
else:
  print("NOT LEAP YEAR")*/