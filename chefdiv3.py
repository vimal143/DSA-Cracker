tc=int(input())
while tc>0:
    N,K,D=input().split()
    A=list(map(int,input().split()))
    sum=0
    N=int(N)
    K=int(K)
    D=int(D)
    for i in A:
        sum+=A[i]
    if((sum/K)<D):
        print(sum/K)
    elif((sum/K)>D):
         print(D)
    else:
        print(0)     
    tc-=1      
