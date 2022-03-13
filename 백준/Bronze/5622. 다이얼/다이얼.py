x = input()
answer = 0
for i in x:
    if 65 <= ord(i) <= 67:
        answer += 3
    elif 68 <= ord(i) <= 70:
        answer += 4
    elif 71 <= ord(i) <= 73:
        answer += 5
    elif 74 <= ord(i) <= 76:
        answer += 6
    elif 77 <= ord(i) <= 79:
        answer += 7
    elif 80 <= ord(i) <= 83:
        answer += 8
    elif 84 <= ord(i) <= 86:
        answer += 9
    elif 87 <= ord(i) <= 90:
        answer += 10
print(answer)
