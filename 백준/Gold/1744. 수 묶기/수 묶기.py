import sys
input = sys.stdin.readline

def cal(data):
    answer = 0
    while len(data) >= 2:
        a = data.pop()
        b = data.pop()
        if a == 1 or b == 1:
            answer += (a + b)
        else:
            answer += (a * b)

    if len(data) == 1:
        answer += data.pop()

    return answer

n = int(input())
p_data = []
m_data = []
for _ in range(n):
    x = int(input())
    if x > 0:
        p_data.append(x)
    else:
        m_data.append(x)

m_data.sort(reverse=True)
p_data.sort()

p_sum = cal(p_data)
m_sum = cal(m_data)
print(p_sum + m_sum)