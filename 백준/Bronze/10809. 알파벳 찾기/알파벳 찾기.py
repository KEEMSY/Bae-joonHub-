target = input()

alpha_dict = {}
for i in range(97,123):
    alpha_dict[chr(i)] = -1



for idx in range(len(target)):
    if alpha_dict[target[idx]] == -1:
        alpha_dict[target[idx]] = idx


answer = ''
for i in range(97,123):
    answer += (str(alpha_dict[chr(i)])) + ' '
print(answer.strip())