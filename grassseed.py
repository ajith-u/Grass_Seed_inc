c=float(input())
if(0<c<=100.0):
  l=int(input())
  if(1<=l<=100):
    sum=0.0
    for i in range(0,l):
      lw=input().split()
      sum+=float(lw[0])*float(lw[1])
    print(sum*c)