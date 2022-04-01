from collections import Counter
import sys
input = sys.stdin.readline

n = int(input())
temp = []
for _ in range(n):
    num = int(input())
    temp.append(num)
temp.sort()

print(round(sum(temp)/n))
print(temp[len(temp)//2])
max_num = Counter(temp).most_common(2)

if len(temp) > 1:
    if max_num[0][1] == max_num[1][1]:
        print(max_num[1][0])
    else:
        print(max_num[0][0])
else:
    print(max_num[0][0])
    
print(temp[-1]-temp[0])