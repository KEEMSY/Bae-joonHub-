alist = []
for i in range(3):
    x = int(input())
    alist.append(x)
A = alist[0]*alist[1]*alist[2]
B = str(A)

for i in range(10):
    print(B.count(str(i)))