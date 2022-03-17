H, M = map(int, input().split())

if H==0 and M <= 44:
    H = 23
    M = 15 + M
    print(H,M)

elif H!=0 and M <= 44:
    H = H-1
    M = 15 + M
    print(H,M)

elif H==0 and M>=45:
    M = M-45
    print(H,M)

elif H!=0 and M>=45:
    M = M-45
    print(H,M)
