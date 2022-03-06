temp = input()
target = temp.lower()

alpha_dict = {}
for i in range(97,123):
    alpha_dict[chr(i)] = 0


for idx in range(len(target)):
    alpha_dict[target[idx]] += 1


check = -1
answer = []
for i in range(97,123):
    if alpha_dict[chr(i)] != 0:
        if check == alpha_dict[chr(i)]:
            answer.append((check, chr(i)))

        else:
            if check < alpha_dict[chr(i)]:
                check = max(alpha_dict[chr(i)], check)
                answer.append((check, chr(i)))
answer.sort(key=lambda x: x[0],reverse=True)

if len(answer) >= 2:
    if answer[0][0] == answer[1][0]:
        print('?')
    else:
        print(answer[0][1].upper())
else:
    print(answer[0][1].upper())