t = int(input())

for _ in range(t):
    stack = []
    words=input()
    for word in words:
        if word == '(':
            stack.append(word)
        elif word == ')':
            if stack:
                stack.pop()
            else:
                print("NO")
                break
    else: 
        if not stack: 
            print("YES")
        else: 
            print("NO")