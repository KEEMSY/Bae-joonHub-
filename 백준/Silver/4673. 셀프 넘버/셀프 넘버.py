all_num = [i for i in range(1,10001)]
gen_num = []


def make_num(n):
    one_num = [int(i) for i in str(n)]
    return n + sum(one_num)

for i in range(1,10001):
    gen_num.append(make_num(i))

result = list(set(all_num) - set(gen_num))

result.sort()
for i in result:
    print(i)