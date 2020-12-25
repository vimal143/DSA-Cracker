tc=int(input())
while tc>0:
    N=int(input())
    A=list(map(int,input().split()))
    sum=0
    for i in range(0,N):
        sum+=A[i]
    print(sum)      
    tc-=1

