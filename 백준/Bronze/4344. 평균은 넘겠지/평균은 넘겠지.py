C = int(input())

for i in range(C):
    data =list(map(int,input().split()))
    S = data[0] 
    A = data[1:]
    avg = 0
    for j in range(S):
        if sum(A)/S < A[j]:
            avg += 1
    M = avg/S * 100
    print(f'{M:.3f}%')
    
    