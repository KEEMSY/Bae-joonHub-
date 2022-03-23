n = int(input())
key_num = 666
cnt = 0

while True:
    if '666' in str(key_num):
        cnt += 1
    if cnt == n:
        print(key_num)
        
        break
    key_num += 1