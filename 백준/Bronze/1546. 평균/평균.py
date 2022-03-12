x = int(input())
testlist = list(map(int, input().split()))
maxscore = max(testlist)


newlist = []
for i in testlist:
    newlist.append(i/maxscore*100)
newavg = sum(newlist)/x
print(newavg)
