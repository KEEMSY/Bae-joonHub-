N, M = map(int, input().split())
cards = list(map(int, input().split()))

best = 0

for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            total = cards[i] + cards[j] + cards[k]

            if total <= M:
                best = max(best, total)

print(best)
