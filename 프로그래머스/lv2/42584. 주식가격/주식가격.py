from collections import deque

def solution(prices):
    l = len(prices)
    answer = [0] * l
    prices = deque(prices)

    for i in range(l):
        now_price = prices.popleft()
        for price in prices:
            answer[i] += 1
            if price < now_price:
                break

    return answer