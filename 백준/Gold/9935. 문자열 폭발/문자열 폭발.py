x = input()
target = input()
stack = []
len_target = len(target)

for i in x:
    stack.append(i)
    if ''.join(stack[-len_target:]) == target:
        del stack[-len_target:]
    
if len(stack):
    print(''.join(stack))
else:
    print('FRULA')