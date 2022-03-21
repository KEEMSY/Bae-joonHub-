s = input()

area_cnt = 0
for i in range(1,len(s)):
    if s[i-1] != s[i]:
        area_cnt += 1
print((area_cnt +1)//2)